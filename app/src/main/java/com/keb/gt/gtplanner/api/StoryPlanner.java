package com.keb.gt.gtplanner.api;

import java.util.Date;
import java.util.List;
import java.util.Set;

/**
 * Created by Manu on 29.01.2017.
 */

public interface StoryPlanner {

    /**
     * Retrieves the so called starter stories.
     * They are the first stories that are recommended to listen to at the beginning.
     * They give some basic ideas and are introductory.
     * There are usually about six stories in the list. The stories are mapped by their id.
     * @return A list of IDs of beinning stories.
     */
    List<String> getStarterStories();

    /**
     * Calculates the current story for the given Date.
     * @param currentDate The date to calculate the story for.
     *                    Usually there is a new story for every new week.
     * @return The ID of the current story for the given Date.
     */
    String currentStory(Date currentDate);
    /**
     * Calculates the current story for the given Date.
     * @param currentDate The date to calculate the story for.
     *                    Usually there is a new story for every new week.
     * @param storiesHeard The list of IDs of the stories, that have been heard already.
     * @return The ID of the current story for the given Date.
     */
    String currentStory(Date currentDate, Set<String> storiesHeard);
}
