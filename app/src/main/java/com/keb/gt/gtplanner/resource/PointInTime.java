package com.keb.gt.gtplanner.resource;

import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by Manu on 29.01.2017.
 */

public enum PointInTime {

    FIRST_ADVENT("1.A"),
    SECOND_ADVENT("2.A"),
    THIRD_ADVENT("3.A"),
    FOURTH_ADVENT("4.A"),
    EASTER("O"),
    PENTECOST("P"),
    MOTHERS_DAY("M"),
    BEFORE_CHRISTMAS("VW"),
    AFTER_CHRISTMAS("NW"),
    SUMMER("S"),
    SEPTEMBER("SEP"),
    JANUARY("JAN"),
    HALLOWEEN("HW"),
    EVERYTIME("alle");

    private static final Map<String, PointInTime> TIMEPOINT_MAP = new HashMap<>();
    static {
        for (PointInTime pointInTime : PointInTime.values()) {
            TIMEPOINT_MAP.put(pointInTime.getDesc(), pointInTime);
        }
    }
    private static final Set<PointInTime> IMPORTANT_POINTS_IN_TIME = new HashSet<>();
    static {
        IMPORTANT_POINTS_IN_TIME.add(FIRST_ADVENT);
        IMPORTANT_POINTS_IN_TIME.add(SECOND_ADVENT);
        IMPORTANT_POINTS_IN_TIME.add(THIRD_ADVENT);
        IMPORTANT_POINTS_IN_TIME.add(FOURTH_ADVENT);
        IMPORTANT_POINTS_IN_TIME.add(EASTER);
        IMPORTANT_POINTS_IN_TIME.add(PENTECOST);
        IMPORTANT_POINTS_IN_TIME.add(MOTHERS_DAY);
        IMPORTANT_POINTS_IN_TIME.add(SUMMER);
        IMPORTANT_POINTS_IN_TIME.add(SEPTEMBER);
        IMPORTANT_POINTS_IN_TIME.add(JANUARY);
        IMPORTANT_POINTS_IN_TIME.add(HALLOWEEN);
    }

    private String desc;

    PointInTime(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return this.desc;
    }

    public static PointInTime matchPointInTime(String desc) {
        return TIMEPOINT_MAP.get(desc);
    }

    public static Set<PointInTime> getImportantPointsInTime() {
        return IMPORTANT_POINTS_IN_TIME;
    }
}
