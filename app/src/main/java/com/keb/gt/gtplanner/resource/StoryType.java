package com.keb.gt.gtplanner.resource;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Manu on 29.01.2017.
 */
public enum StoryType {

    OLD_TESTAMENT("AT"),
    NEW_TESTAMENT("NT"),
    NEW_TESTAMENT_WITH_SONG("NT-L"),
    SONG("L"),
    STORY("G"),
    SINGLE_LESSON("E-L"),
    BEGINNING("A"),
    MISSION_STORY("M"),
    SINGLE_STORY("EG"),
    QUIZ("Q"),
    SL_TR("EG-TR"),
    OT_TR("AT-TR"),
    ST_TR("G-TR"),
    A_TR("A-Tr"),
    NO_TYPE("");

    private static final Map<String, StoryType> TYPE_MAP = new HashMap<>();
    static {
        for (StoryType storyType : StoryType.values()) {
            TYPE_MAP.put(storyType.getShort(), storyType);
        }
    }

    private String abb;
    StoryType(String abbreviation) {
        this.abb = abbreviation;
    }

    public String getShort() {
        return abb;
    }

    public static StoryType findMatchingType(String abbreviation) {
        return TYPE_MAP.get(abbreviation);
    }
}
