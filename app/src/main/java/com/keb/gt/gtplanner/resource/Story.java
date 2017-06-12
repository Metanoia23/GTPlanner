package com.keb.gt.gtplanner.resource;

/**
 * Created by Manu on 29.01.2017.
 */

public class Story {

    private String id;

    private int yearCycle;

    private StoryType type;

    private Series series;

    private int partOfSeries;

    private boolean isSeries;

    private PointInTime specialDate;

    private int forbiddenPredessesor1;

    private int forbiddenPredessesor2;

    public Story(String id, int yearCycle, StoryType type, Series series, int partOfSeries,
                  PointInTime specialDate) {
        this.id = id;
        this.yearCycle = yearCycle;
        this.type = type;
        this.series = series;
        this.partOfSeries = partOfSeries;
        this.isSeries = (Series.NO_SERIES.equals(series) || Series.EASTER.equals(series))
                                || series == null ? false : true;
        this.specialDate = specialDate;
    }

    public void setForbiddenPredessesor1(int forbiddenPredessesor1) {
        this.forbiddenPredessesor1 = forbiddenPredessesor1;
    }

    public void setForbiddenPredessesor2(int forbiddenPredessesor2) {
        this.forbiddenPredessesor2 = forbiddenPredessesor2;
    }

    public String getId() {
        return id;
    }

    public int getYearCycle() {
        return yearCycle;
    }

    public StoryType getType() {
        return type;
    }

    public Series getSeries() {
        return series;
    }

    public int getPartOfSeries() {
        return partOfSeries;
    }

    public boolean isSeries() {
        return isSeries;
    }

    public PointInTime getSpecialDate() {
        return specialDate;
    }

    public int getForbiddenPredessesor1() {
        return forbiddenPredessesor1;
    }

    public int getForbiddenPredessesor2() {
        return forbiddenPredessesor2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Story story = (Story) o;

        return id.equals(story.id);

    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
