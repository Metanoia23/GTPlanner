package com.keb.gt.gtplanner.api.plan;

import com.keb.gt.gtplanner.api.StoryPlanner;
import com.keb.gt.gtplanner.resource.Series;
import com.keb.gt.gtplanner.resource.Story;
import com.keb.gt.gtplanner.resource.StoryData;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by Manu on 06.02.2017.
 */
public class PlannerTest {

    private StoryPlanner planner;

    @Before
    public void setUp() throws Exception {
        this.planner = Planner.getInstance();
    }

    @Test
    public void getStarterStories1() throws Exception {
        GregorianCalendar cal = new GregorianCalendar(2016,5,12);
        List<String> starterStories = this.planner.getStarterStories();
        assertEquals(7, starterStories.size());
    }

    @Test
    public void currentStory1() throws Exception {

    }

    @Test
    public void currentStory2() throws Exception {

    }

    @Test
    public void getInstance() throws Exception {
        List<Story> stories = StoryData.buildStories();
        assertEquals(stories.size(), 170);
        Map<Integer, List<Integer>> seriesCheckNumberToParts = new HashMap<>();
        for (Story story : stories) {
            if (story.isSeries()) {

                List<Integer> parts = seriesCheckNumberToParts.get(story.getSeries().getNumber());
                if (parts == null) {
                    parts = new ArrayList<>();
                }
                if (story.getPartOfSeries() > 0 &&
                        story.getPartOfSeries() <= story.getSeries().getSeriesSize()) {
                    if (parts.contains(story.getPartOfSeries())) {
                        throw new IllegalArgumentException("Incorrect numeration of series: " + story.getId());
                    } else {
                        parts.add(story.getPartOfSeries());
                    }
                    seriesCheckNumberToParts.put(story.getSeries().getNumber(), parts);
                } else {
                    throw new IllegalArgumentException("Invalid numeration of series " + story.getId());
                }
            }

        }
        // -1 because of the NO_SERIES ENTRY
        assertEquals(Series.values().length -1, seriesCheckNumberToParts.size());
        for (Map.Entry<Integer, List<Integer>> entry : seriesCheckNumberToParts.entrySet()) {
            Series series = Series.getSeriesByNumber(entry.getKey());
            if (series != null) {
               assertEquals(series.getSeriesSize(), entry.getValue().size());
            }
        }
        System.out.println("Went through: " + seriesCheckNumberToParts.size());
    }

    @Test
    public void getStarterStories() throws Exception {

    }

    @Test
    public void currentStory() throws Exception {

    }

}