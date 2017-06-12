package com.keb.gt.gtplanner.api.plan;

import android.graphics.Point;

import com.keb.gt.gtplanner.api.StoryPlanner;
import com.keb.gt.gtplanner.date.SpecialDateCalculator;
import com.keb.gt.gtplanner.resource.PointInTime;
import com.keb.gt.gtplanner.resource.Series;
import com.keb.gt.gtplanner.resource.Story;
import com.keb.gt.gtplanner.resource.StoryData;
import com.keb.gt.gtplanner.resource.StoryType;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Set;

import static android.R.attr.filter;
import static android.R.attr.imeSubtypeExtraValue;
import static android.R.attr.max;

/**
 * The StoryPlanner implementation that calculates the current story fo the given date.
 */

public class Planner implements StoryPlanner {

    private final List<Story> planData;

    public static Planner getInstance() {
        return new Planner();
    }

    private Planner() {
        this.planData = StoryData.buildStories();
    }

    @Override
    public List<String> getStarterStories() {
        List<String> starterList = new LinkedList<>();
        for (Story story : this.planData) {
            if (story.getType() == StoryType.BEGINNING) {
                starterList.add(story.getId());
            }
        }
        return starterList;
    }

    @Override
    public String currentStory(Date currentDate) {
        return calculateCurrentStory(currentDate, new HashSet<>(this.planData));
    }

    private String calculateCurrentStory(Date currentDate, Set<Story> availableStories) {
        final PointInTime pointInTime = SpecialDateCalculator.classifyDate(currentDate);
        final boolean importantPointInTime = isImportantPointInTime(pointInTime);
        final int currentYear = extractYear(currentDate);
        final int cycle = getStoryCycle(currentYear);

        if (availableStories != null
            && (availableStories.size() > 0)) {
            return planningSteps(pointInTime, importantPointInTime, availableStories,
                    currentYear, cycle);
        }
        // Random Story as default
        return chooseRandomStory(new HashSet<>(this.planData));
    }

    private String planningSteps(PointInTime pointInTime, boolean important,
                                 Set<Story> availables, int currentYear, int yearCycle) {

        String storyId = determineStoryByPointInTime(pointInTime, important, availables, yearCycle);
        if (storyId != null) {
            return storyId;
        }
        return chooseRandomStory(availables);
    }

    private String determineStoryByPointInTime(PointInTime pit, boolean important,
                                               Set<Story> availables, int yearCycle) {
        Set<Story> matches = findCycleMatches(yearCycle, availables);
        if (matches.isEmpty()) {
            matches = availables;
        }
        Set<Story> timePointMatch = findTimePointMatch(pit, important, matches);
        if (timePointMatch.size() > 1) {
            return checkMatchingSeries(timePointMatch);
        }
        return timePointMatch.iterator().next().getId();
    }

    private String checkMatchingSeries(Set<Story> checkSeries) {
        List<Series> availSeries = new ArrayList<>();
        for (Story story: checkSeries) {
            availSeries.add(story.getSeries());
        }
        List<Story> stories = filterSeries(determineRelevantSeries(availSeries), checkSeries);
        if (!stories.isEmpty()) {
            return findCurrentPartOfSeries(stories);
        }
        return null;
    }

    private List<Story> filterSeries(final Series series, Set<Story> availSeries) {
        List<Story> filteredList = new ArrayList<>();
        for (Story story : availSeries) {
            if (story.getSeries().equals(series)) {
                filteredList.add(story);
            }
        }
        return filteredList;
    }

    private String findCurrentPartOfSeries(List<Story> series) {
        int leastPart = -1;
        String leastStoryId = null;
        for (Story story : series) {
            if (leastPart == -1) {
                leastPart = story.getPartOfSeries();
            }
            if (story.getPartOfSeries() <= leastPart) {
                leastPart = story.getPartOfSeries();
                leastStoryId = story.getId();
            }
        }
        return leastStoryId;
    }

    private Series determineRelevantSeries(List<Series> series) {
        return series.get(0);
    }

    private Set<Story> findTimePointMatch(PointInTime pit, boolean important,
                                          Set<Story> availables) {
        Set<Story> targetMatches = new HashSet<>();
        for (Story story : availables) {
            if (story.getSpecialDate().equals(pit)) {
                targetMatches.add(story);
            }
        }
        return targetMatches;
    }

    private Set<Story> findCycleMatches(int yearCycle, Set<Story> availableStories) {
        Set<Story> matches = new HashSet<>();
        for (Story story : availableStories) {
            if (story.getYearCycle() == yearCycle) {
                matches.add(story);
            }
        }
        return matches;
    }

    private String evaluateByCycle(int CycleYear, Set<Story> availableStories) {

        return null;
    }

    private boolean isImportantPointInTime(PointInTime pointInTime) {
        return PointInTime.getImportantPointsInTime().contains(pointInTime);
    }



    @Override
    public String currentStory(Date currentDate, Set<String> storiesHeard) {
        Set<Story> heardRemoved = new HashSet<>();
        for (Story story : planData) {
            if (!storiesHeard.contains(story.getId())) {
                heardRemoved.add(story);
            }
        }
        return calculateCurrentStory(currentDate, heardRemoved);
    }

    private String chooseRandomStory(Set<Story> availableStories) {
        List<Story> setOfSingleStories = new ArrayList<>();
        for (Story story : availableStories) {
            if (!story.isSeries()) {
                setOfSingleStories.add(story);
            }
        }
        int size = setOfSingleStories.size();
        if (size < 1) {
            setOfSingleStories = new ArrayList<>(availableStories);
            size = setOfSingleStories.size();
        }
        Random random = new Random();
        int randomIndex = random.nextInt((size - 1) + 1);

        return setOfSingleStories.get(randomIndex).getId();
    }

    private int extractYear(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        return cal.get(Calendar.YEAR);
    }

    private int getStoryCycle(int year) {
        if (year > 0) {
            return (year % 3) + 1;
        }
        // Default year cycle 1
        return 1;
    }
}
