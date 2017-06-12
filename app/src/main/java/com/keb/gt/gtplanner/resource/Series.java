package com.keb.gt.gtplanner.resource;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Enum that stores information about all series in the story for children pool.
 */
public enum Series {

    CHRISTMAS_ONE("WEIH1", 1, 5, false),
    ANF1("ANF1", 0, 3, false),
    ANF2("ANF2", 29, 4, false),
    ELIA("ELIA", 2, 8, true),
    EASTER("OSTERN", 3, 16, false),
    TIFAM("TIFAM", 4, 6, true),
    SHEPHERD("HIRTE", 30, 2, false),
    JOSEF("JOSEF", 5, 6, true),
    CHRISTMAS_TWO("WEIH2", 6, 5, false),
    PETER("PETRUS", 7, 11, false),
    KRAFTPR("KRAFTPR", 8, 2, true),
    JONAH("JONA", 9, 2, true),
    DANIEL("DANIEL",10, 4, true),
    RINGU("RINGU", 11, 6, true),
    NOAH("NOAH", 12, 2, true),
    MOSES("MOSE", 13, 6, true),
    // Exception, because some stories of this series belong to a series,
    // that is defined by PointInTime = JAN
    CHRISTMAS_THREE("WEIH3", 14, 9, false),
    JOSAPHAT("JOSAPH", 16, 2, true),
    EASTER_TWO("OSTERN", 17, 3, false),
    LIVE_WAY("FAHR.", 18, 5, true),
    MEPHIBOSET("MEPH.", 19, 2, true),
    TAYLOR("TAYLOR", 20, 6, true),
    ABRAM("ABRAM", 21, 3, true),
    INAM("INAM", 22, 2, true),
    ILL("AUSS.", 23, 2, true),
    SATAN("SATAN", 24, 3, true),
    ESTHER("ESTHER", 25, 4, true),
    LAZARUS("LAZ", 26, 2, true),
    WILD_FORREST("W.WALD",27, 6, true),
    HALLOWEEN("HALO", 28, 2, false),
    NO_SERIES(null,-1,-1, false);

    private static final Map<Integer, Series> SERIES_MAP = new HashMap<>();
    static {
        for (Series series : Series.values()) {
            SERIES_MAP.put(series.getNumber(), series);
        }
    }

    private String desc;

    private int number;

    private int seriesSize;

    boolean usedForCalculation;

    Series(String desc, int number, int size, boolean usedInCalc) {
        this.desc = desc;
        this.number = number;
        this.seriesSize = size;
        this.usedForCalculation = usedInCalc;
    }

    public String getDesc() {
        return desc;
    }

    public int getNumber() {
        return number;
    }

    public int getSeriesSize() {
        return seriesSize;
    }

    public boolean isUsedForCalculation() {
        return usedForCalculation;
    }

    public static Series getSeriesByNumber(int seriesNum) {
        return SERIES_MAP.get(seriesNum);
    }
}
