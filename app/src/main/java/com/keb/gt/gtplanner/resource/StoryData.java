package com.keb.gt.gtplanner.resource;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Manu on 29.01.2017.
 */

public final class StoryData {

    public static List<Story> buildStories() {
        List<Story> stories = new LinkedList<>();
        stories.add(new Story("10001", 1, StoryType.NEW_TESTAMENT, Series.ANF1, 1, PointInTime.EVERYTIME));
        stories.add(new Story("10002", 1, StoryType.NEW_TESTAMENT, Series.ANF1, 2, PointInTime.EVERYTIME));
        stories.add(new Story("10003", 1, StoryType.NEW_TESTAMENT, Series.NO_SERIES, 0, PointInTime.EVERYTIME));
        stories.add(new Story("10004", 1, StoryType.NEW_TESTAMENT, Series.ANF1, 3, PointInTime.EVERYTIME));
        stories.add(new Story("10005", 1, StoryType.SONG, Series.ANF2, 1, PointInTime.EVERYTIME));
        stories.add(new Story("10006", 1, StoryType.NEW_TESTAMENT, Series.ANF2, 2, PointInTime.EVERYTIME));
        stories.add(new Story("10008", 1, StoryType.NEW_TESTAMENT, Series.ANF2, 3, PointInTime.EVERYTIME));
        stories.add(new Story("10007", 1, StoryType.OLD_TESTAMENT, Series.ANF2, 4, PointInTime.EVERYTIME));
        stories.add(new Story("10009", 1, StoryType.NO_TYPE, Series.CHRISTMAS_ONE, 1, PointInTime.FIRST_ADVENT));
        stories.add(new Story("10010", 1, StoryType.NO_TYPE, Series.CHRISTMAS_ONE, 2, PointInTime.SECOND_ADVENT));
        stories.add(new Story("10011", 1, StoryType.NEW_TESTAMENT, Series.CHRISTMAS_ONE, 3, PointInTime.THIRD_ADVENT));
        stories.add(new Story("10012", 1, StoryType.NEW_TESTAMENT, Series.CHRISTMAS_ONE, 4, PointInTime.FOURTH_ADVENT));
        stories.add(new Story("10013", 1, StoryType.STORY, Series.NO_SERIES, 0, PointInTime.BEFORE_CHRISTMAS));
        stories.add(new Story("10014", 1, StoryType.STORY, Series.CHRISTMAS_ONE, 5, PointInTime.EVERYTIME));
        stories.add(new Story("10015", 1, StoryType.SINGLE_LESSON, Series.NO_SERIES, 0, PointInTime.EVERYTIME));
        stories.add(new Story("10016", 1, StoryType.OLD_TESTAMENT, Series.ELIA, 1, PointInTime.EVERYTIME));
        stories.add(new Story("10017", 1, StoryType.OLD_TESTAMENT, Series.ELIA, 2, PointInTime.EVERYTIME));
        stories.add(new Story("10018", 1, StoryType.OLD_TESTAMENT, Series.ELIA, 3, PointInTime.EVERYTIME));
        stories.add(new Story("10019", 1, StoryType.OLD_TESTAMENT, Series.ELIA, 4, PointInTime.EVERYTIME));
        stories.add(new Story("10020", 1, StoryType.OLD_TESTAMENT, Series.ELIA, 5, PointInTime.EVERYTIME));
        stories.add(new Story("10021", 1, StoryType.OLD_TESTAMENT, Series.ELIA, 6, PointInTime.EVERYTIME));
        stories.add(new Story("10022", 1, StoryType.OLD_TESTAMENT, Series.ELIA, 7, PointInTime.EVERYTIME));
        stories.add(new Story("10023", 1, StoryType.OLD_TESTAMENT, Series.ELIA, 8, PointInTime.EVERYTIME));
        stories.add(new Story("10024", 1, StoryType.OLD_TESTAMENT, Series.EASTER, 1, PointInTime.EVERYTIME));
        stories.add(new Story("10025", 1, StoryType.OLD_TESTAMENT, Series.EASTER, 2, PointInTime.EVERYTIME));
        stories.add(new Story("10026", 1, StoryType.NEW_TESTAMENT, Series.EASTER, 3, PointInTime.EVERYTIME));
        stories.add(new Story("10027", 1, StoryType.NEW_TESTAMENT, Series.EASTER, 4, PointInTime.EVERYTIME));
        stories.add(new Story("10028", 1, StoryType.NEW_TESTAMENT, Series.EASTER, 5, PointInTime.EASTER));
        stories.add(new Story("10029", 1, StoryType.NEW_TESTAMENT, Series.EASTER, 6, PointInTime.EVERYTIME));
        stories.add(new Story("10030", 1, StoryType.NO_TYPE, Series.EASTER, 7, PointInTime.EVERYTIME));
        stories.add(new Story("10031", 1, StoryType.STORY, Series.EASTER, 8, PointInTime.EVERYTIME));
        stories.add(new Story("10032", 1, StoryType.MISSION_STORY, Series.EASTER, 9, PointInTime.EVERYTIME));
        stories.add(new Story("10033", 1, StoryType.NEW_TESTAMENT, Series.EASTER, 10, PointInTime.EVERYTIME));
        stories.add(new Story("10034", 1, StoryType.NEW_TESTAMENT, Series.EASTER, 11, PointInTime.EVERYTIME));
        stories.add(new Story("10035", 1, StoryType.NEW_TESTAMENT, Series.EASTER, 12, PointInTime.PENTECOST));
        stories.add(new Story("10036", 1, StoryType.NEW_TESTAMENT, Series.EASTER, 13, PointInTime.EVERYTIME));
        stories.add(new Story("10037", 1, StoryType.NEW_TESTAMENT, Series.EASTER, 14, PointInTime.EVERYTIME));
        stories.add(new Story("10038", 1, StoryType.NEW_TESTAMENT, Series.EASTER, 15, PointInTime.EVERYTIME));
        Story story39 = new Story("10039", 1, StoryType.NEW_TESTAMENT, Series.EASTER, 16, PointInTime.EVERYTIME);
        story39.setForbiddenPredessesor1(10040);
        stories.add(story39);
        Story story40 = new Story("10040", 1, StoryType.BEGINNING, Series.NO_SERIES, 16, PointInTime.EVERYTIME);
        story40.setForbiddenPredessesor1(10039);
        stories.add(story40);
        stories.add(new Story("10041", 1, StoryType.A_TR, Series.NO_SERIES, 0, PointInTime.EVERYTIME));
        stories.add(new Story("10042", 1, StoryType.MISSION_STORY, Series.TIFAM, 1, PointInTime.SUMMER));
        stories.add(new Story("10043", 1, StoryType.MISSION_STORY, Series.TIFAM, 2, PointInTime.SUMMER));
        stories.add(new Story("10044", 1, StoryType.MISSION_STORY, Series.TIFAM, 3, PointInTime.SUMMER));
        stories.add(new Story("10045", 1, StoryType.MISSION_STORY, Series.TIFAM, 4, PointInTime.SUMMER));
        stories.add(new Story("10046", 1, StoryType.MISSION_STORY, Series.TIFAM, 5, PointInTime.SUMMER));
        stories.add(new Story("10047", 1, StoryType.MISSION_STORY, Series.TIFAM, 6, PointInTime.SUMMER));
        stories.add(new Story("10048", 1, StoryType.NEW_TESTAMENT, Series.NO_SERIES, 0, PointInTime.EVERYTIME));
        stories.add(new Story("10049", 1, StoryType.NEW_TESTAMENT, Series.SHEPHERD, 1, PointInTime.EVERYTIME));
        stories.add(new Story("10050", 1, StoryType.NEW_TESTAMENT, Series.SHEPHERD, 2, PointInTime.EVERYTIME));
        stories.add(new Story("10051", 1, StoryType.NEW_TESTAMENT, Series.NO_SERIES, 0, PointInTime.EVERYTIME));
        stories.add(new Story("10052", 1, StoryType.STORY, Series.NO_SERIES, 0, PointInTime.SEPTEMBER));
        stories.add(new Story("10053", 1, StoryType.OLD_TESTAMENT, Series.JOSEF, 1, PointInTime.EVERYTIME));
        stories.add(new Story("10054", 1, StoryType.OLD_TESTAMENT, Series.JOSEF, 2, PointInTime.EVERYTIME));
        stories.add(new Story("10055", 1, StoryType.OLD_TESTAMENT, Series.JOSEF, 3, PointInTime.EVERYTIME));
        stories.add(new Story("10056", 1, StoryType.OLD_TESTAMENT, Series.JOSEF, 4, PointInTime.EVERYTIME));
        stories.add(new Story("10057", 1, StoryType.OLD_TESTAMENT, Series.JOSEF, 5, PointInTime.EVERYTIME));
        stories.add(new Story("10058", 1, StoryType.OLD_TESTAMENT, Series.JOSEF, 6, PointInTime.EVERYTIME));
        stories.add(new Story("10059", 1, StoryType.MISSION_STORY, Series.CHRISTMAS_TWO, 1, PointInTime.FIRST_ADVENT));
        stories.add(new Story("10060", 1, StoryType.MISSION_STORY, Series.CHRISTMAS_TWO, 2, PointInTime.SECOND_ADVENT));
        stories.add(new Story("10061", 1, StoryType.NEW_TESTAMENT, Series.CHRISTMAS_TWO, 3, PointInTime.THIRD_ADVENT));
        stories.add(new Story("10062", 1, StoryType.NEW_TESTAMENT, Series.CHRISTMAS_TWO, 4, PointInTime.FOURTH_ADVENT));
        stories.add(new Story("10063", 1, StoryType.NO_TYPE, Series.NO_SERIES, 0, PointInTime.BEFORE_CHRISTMAS));
        stories.add(new Story("10064", 1, StoryType.NEW_TESTAMENT, Series.CHRISTMAS_TWO, 5, PointInTime.EVERYTIME));
        stories.add(new Story("10065", 2, StoryType.NEW_TESTAMENT, Series.PETER, 1, PointInTime.EVERYTIME));
        stories.add(new Story("10066", 2, StoryType.NEW_TESTAMENT, Series.PETER, 2, PointInTime.EVERYTIME));
        stories.add(new Story("10067", 2, StoryType.NEW_TESTAMENT, Series.PETER, 3, PointInTime.EVERYTIME));
        stories.add(new Story("10068", 2, StoryType.MISSION_STORY, Series.KRAFTPR, 1, PointInTime.JANUARY));
        stories.add(new Story("10069", 2, StoryType.MISSION_STORY, Series.KRAFTPR, 2, PointInTime.JANUARY));
        stories.add(new Story("10070", 2, StoryType.NEW_TESTAMENT, Series.PETER, 4, PointInTime.EVERYTIME));
        stories.add(new Story("10071", 2, StoryType.NEW_TESTAMENT, Series.PETER, 5, PointInTime.EVERYTIME));
        stories.add(new Story("10072", 2, StoryType.NEW_TESTAMENT, Series.PETER, 6, PointInTime.EVERYTIME));
        stories.add(new Story("10073", 2, StoryType.STORY, Series.PETER, 7, PointInTime.EVERYTIME));
        stories.add(new Story("10074", 2, StoryType.STORY, Series.PETER, 8, PointInTime.EVERYTIME));
        stories.add(new Story("10075", 2, StoryType.NEW_TESTAMENT, Series.PETER, 9, PointInTime.EVERYTIME));
        stories.add(new Story("10076", 2, StoryType.NEW_TESTAMENT, Series.PETER, 10, PointInTime.EVERYTIME));
        stories.add(new Story("10077", 2, StoryType.NEW_TESTAMENT, Series.PETER, 11, PointInTime.EASTER));
        stories.add(new Story("10078", 2, StoryType.STORY, Series.NO_SERIES, 0, PointInTime.EVERYTIME));
        stories.add(new Story("10079", 2, StoryType.STORY, Series.NO_SERIES, 0, PointInTime.EVERYTIME));
        stories.add(new Story("10080", 2, StoryType.NO_TYPE, Series.NO_SERIES, 0, PointInTime.MOTHERS_DAY));
        stories.add(new Story("10081", 2, StoryType.OLD_TESTAMENT, Series.JONAH, 1, PointInTime.EVERYTIME));
        Story story82 = new Story("10082", 2, StoryType.OLD_TESTAMENT, Series.JONAH, 2, PointInTime.EVERYTIME);
        story82.setForbiddenPredessesor1(10083);
        stories.add(story82);
        Story story83 = new Story("10083", 2, StoryType.OLD_TESTAMENT, Series.DANIEL, 1, PointInTime.EVERYTIME);
        story83.setForbiddenPredessesor1(10082);
        stories.add(story83);
        stories.add(new Story("10084", 2, StoryType.OLD_TESTAMENT, Series.DANIEL, 2, PointInTime.EVERYTIME));
        stories.add(new Story("10085", 2, StoryType.OLD_TESTAMENT, Series.DANIEL, 3, PointInTime.EVERYTIME));
        stories.add(new Story("10086", 2, StoryType.OLD_TESTAMENT, Series.DANIEL, 4, PointInTime.EVERYTIME));
        stories.add(new Story("10087", 2, StoryType.SINGLE_STORY, Series.NO_SERIES, 0, PointInTime.EVERYTIME));
        stories.add(new Story("10088", 2, StoryType.QUIZ, Series.NO_SERIES, 0, PointInTime.EVERYTIME));
        stories.add(new Story("10089", 2, StoryType.MISSION_STORY, Series.RINGU, 1, PointInTime.SUMMER));
        stories.add(new Story("10090", 2, StoryType.MISSION_STORY, Series.RINGU, 2, PointInTime.SUMMER));
        stories.add(new Story("10091", 2, StoryType.MISSION_STORY, Series.RINGU, 3, PointInTime.SUMMER));
        stories.add(new Story("10092", 2, StoryType.MISSION_STORY, Series.RINGU, 4, PointInTime.SUMMER));
        stories.add(new Story("10093", 2, StoryType.MISSION_STORY, Series.RINGU, 5, PointInTime.SUMMER));
        stories.add(new Story("10094", 2, StoryType.MISSION_STORY, Series.RINGU, 6, PointInTime.SUMMER));
        stories.add(new Story("10095", 2, StoryType.SONG, Series.NO_SERIES, 0, PointInTime.EVERYTIME));
        stories.add(new Story("10096", 2, StoryType.SL_TR, Series.NO_SERIES, 0, PointInTime.EVERYTIME));
        stories.add(new Story("10097", 2, StoryType.OLD_TESTAMENT, Series.NOAH, 1, PointInTime.EVERYTIME));
        stories.add(new Story("10098", 2, StoryType.OLD_TESTAMENT, Series.NOAH, 2, PointInTime.EVERYTIME));
        stories.add(new Story("10099", 1, StoryType.QUIZ, Series.NO_SERIES, 0, PointInTime.EVERYTIME));
        stories.add(new Story("10100", 1, StoryType.NO_TYPE, Series.NO_SERIES, 0, PointInTime.EVERYTIME));
        stories.add(new Story("10101", 2, StoryType.OLD_TESTAMENT, Series.MOSES, 1, PointInTime.EVERYTIME));
        stories.add(new Story("10102", 2, StoryType.OLD_TESTAMENT, Series.MOSES, 2, PointInTime.EVERYTIME));
        stories.add(new Story("10103", 2, StoryType.OLD_TESTAMENT, Series.MOSES, 3, PointInTime.EVERYTIME));
        stories.add(new Story("10104", 2, StoryType.OLD_TESTAMENT, Series.MOSES, 4, PointInTime.EVERYTIME));
        stories.add(new Story("10105", 2, StoryType.OLD_TESTAMENT, Series.MOSES, 5, PointInTime.EVERYTIME));
        stories.add(new Story("10106", 2, StoryType.OLD_TESTAMENT, Series.MOSES, 6, PointInTime.EVERYTIME));
        Story story10107 = new Story("10107", 2, StoryType.ST_TR, Series.NO_SERIES, 0, PointInTime.EVERYTIME);
        story10107.setForbiddenPredessesor1(10108);
        story10107.setForbiddenPredessesor2(10109);
        stories.add(story10107);
        Story story10108 = new Story("10108", 2, StoryType.STORY, Series.NO_SERIES, 0, PointInTime.EVERYTIME);
        story10108.setForbiddenPredessesor1(10107);
        story10108.setForbiddenPredessesor2(10109);
        stories.add(story10108);
        Story story10109 = new Story("10109", 2, StoryType.SINGLE_STORY, Series.NO_SERIES, 0, PointInTime.EVERYTIME);
        story10109.setForbiddenPredessesor1(10107);
        story10109.setForbiddenPredessesor2(10108);
        stories.add(story10109);
        stories.add(new Story("10110", 2, StoryType.OLD_TESTAMENT, Series.NO_SERIES, 0, PointInTime.EVERYTIME));
        stories.add(new Story("10111", 2, StoryType.OT_TR, Series.NO_SERIES, 0, PointInTime.EVERYTIME));
        stories.add(new Story("10112", 2, StoryType.OLD_TESTAMENT, Series.NO_SERIES, 0, PointInTime.EVERYTIME));
        stories.add(new Story("10113", 2, StoryType.STORY, Series.CHRISTMAS_THREE, 1, PointInTime.FIRST_ADVENT));
        stories.add(new Story("10114", 2, StoryType.NEW_TESTAMENT, Series.CHRISTMAS_THREE, 2, PointInTime.SECOND_ADVENT));
        stories.add(new Story("10115", 2, StoryType.NEW_TESTAMENT, Series.CHRISTMAS_THREE, 3, PointInTime.THIRD_ADVENT));
        stories.add(new Story("10116", 2, StoryType.STORY, Series.CHRISTMAS_THREE, 4, PointInTime.FOURTH_ADVENT));
        stories.add(new Story("10117", 2, StoryType.MISSION_STORY, Series.CHRISTMAS_THREE, 5, PointInTime.JANUARY));
        stories.add(new Story("10118", 2, StoryType.MISSION_STORY, Series.CHRISTMAS_THREE, 6, PointInTime.JANUARY));
        stories.add(new Story("10119", 2, StoryType.MISSION_STORY, Series.CHRISTMAS_THREE, 7, PointInTime.JANUARY));
        stories.add(new Story("10120", 2, StoryType.MISSION_STORY, Series.CHRISTMAS_THREE, 8, PointInTime.JANUARY));
        stories.add(new Story("10121", 2, StoryType.MISSION_STORY, Series.CHRISTMAS_THREE, 9, PointInTime.JANUARY));
        stories.add(new Story("10122", 3, StoryType.NEW_TESTAMENT, Series.NO_SERIES, 0, PointInTime.EVERYTIME));
        stories.add(new Story("10123", 3, StoryType.NEW_TESTAMENT, Series.NO_SERIES, 0, PointInTime.EVERYTIME));
        stories.add(new Story("10124", 3, StoryType.OLD_TESTAMENT, Series.JOSAPHAT, 1, PointInTime.EVERYTIME));
        stories.add(new Story("10125", 3, StoryType.OLD_TESTAMENT, Series.JOSAPHAT, 2, PointInTime.EVERYTIME));
        stories.add(new Story("10126", 3, StoryType.NEW_TESTAMENT, Series.NO_SERIES, 0, PointInTime.EVERYTIME));
        stories.add(new Story("10127", 3, StoryType.NEW_TESTAMENT, Series.NO_SERIES, 0, PointInTime.EVERYTIME));
        stories.add(new Story("10128", 3, StoryType.NEW_TESTAMENT, Series.NO_SERIES, 0, PointInTime.EVERYTIME));
        stories.add(new Story("10129", 3, StoryType.MISSION_STORY, Series.NO_SERIES, 0, PointInTime.EVERYTIME));
        stories.add(new Story("10130", 3, StoryType.NEW_TESTAMENT_WITH_SONG, Series.EASTER_TWO, 1, PointInTime.EVERYTIME));
        stories.add(new Story("10131", 3, StoryType.NEW_TESTAMENT, Series.EASTER_TWO, 2, PointInTime.EVERYTIME));
        stories.add(new Story("10132", 3, StoryType.NEW_TESTAMENT, Series.EASTER_TWO, 3, PointInTime.EASTER));
        stories.add(new Story("10133", 3, StoryType.NEW_TESTAMENT, Series.LIVE_WAY, 1, PointInTime.EVERYTIME));
        stories.add(new Story("10134", 3, StoryType.NEW_TESTAMENT, Series.LIVE_WAY, 2, PointInTime.EVERYTIME));
        stories.add(new Story("10135", 3, StoryType.OLD_TESTAMENT, Series.LIVE_WAY, 3, PointInTime.EVERYTIME));
        stories.add(new Story("10136", 3, StoryType.NEW_TESTAMENT, Series.LIVE_WAY, 4, PointInTime.EVERYTIME));
        stories.add(new Story("10137", 3, StoryType.NEW_TESTAMENT, Series.LIVE_WAY, 5, PointInTime.EVERYTIME));
        stories.add(new Story("10138", 3, StoryType.OLD_TESTAMENT, Series.MEPHIBOSET, 1, PointInTime.EVERYTIME));
        stories.add(new Story("10139", 3, StoryType.OLD_TESTAMENT, Series.MEPHIBOSET, 2, PointInTime.EVERYTIME));
        stories.add(new Story("10140", 3, StoryType.MISSION_STORY, Series.TAYLOR, 1, PointInTime.SUMMER));
        stories.add(new Story("10141", 3, StoryType.MISSION_STORY, Series.TAYLOR, 2, PointInTime.SUMMER));
        stories.add(new Story("10142", 3, StoryType.MISSION_STORY, Series.TAYLOR, 3, PointInTime.SUMMER));
        stories.add(new Story("10143", 3, StoryType.MISSION_STORY, Series.TAYLOR, 4, PointInTime.SUMMER));
        stories.add(new Story("10144", 3, StoryType.MISSION_STORY, Series.TAYLOR, 5, PointInTime.SUMMER));
        stories.add(new Story("10145", 3, StoryType.MISSION_STORY, Series.TAYLOR, 6, PointInTime.SUMMER));
        stories.add(new Story("10146", 3, StoryType.OLD_TESTAMENT, Series.ABRAM, 1, PointInTime.EVERYTIME));
        stories.add(new Story("10147", 3, StoryType.OLD_TESTAMENT, Series.ABRAM, 2, PointInTime.EVERYTIME));
        stories.add(new Story("10148", 3, StoryType.OLD_TESTAMENT, Series.ABRAM, 3, PointInTime.EVERYTIME));
        stories.add(new Story("10149", 3, StoryType.MISSION_STORY, Series.INAM, 1, PointInTime.EVERYTIME));
        stories.add(new Story("10150", 3, StoryType.MISSION_STORY, Series.INAM, 2, PointInTime.EVERYTIME));
        stories.add(new Story("10151", 3, StoryType.OLD_TESTAMENT, Series.ILL, 1, PointInTime.EVERYTIME));
        stories.add(new Story("10152", 3, StoryType.OLD_TESTAMENT, Series.ILL, 2, PointInTime.EVERYTIME));
        stories.add(new Story("10153", 3, StoryType.NEW_TESTAMENT, Series.SATAN, 1, PointInTime.EVERYTIME));
        stories.add(new Story("10154", 3, StoryType.NEW_TESTAMENT, Series.SATAN, 2, PointInTime.EVERYTIME));
        stories.add(new Story("10155", 3, StoryType.NEW_TESTAMENT, Series.SATAN, 3, PointInTime.EVERYTIME));
        stories.add(new Story("10156", 3, StoryType.OLD_TESTAMENT, Series.ESTHER, 1, PointInTime.EVERYTIME));
        stories.add(new Story("10157", 3, StoryType.OLD_TESTAMENT, Series.ESTHER, 2, PointInTime.EVERYTIME));
        stories.add(new Story("10158", 3, StoryType.OLD_TESTAMENT, Series.ESTHER, 3, PointInTime.EVERYTIME));
        stories.add(new Story("10159", 3, StoryType.OLD_TESTAMENT, Series.ESTHER, 4, PointInTime.EVERYTIME));
        stories.add(new Story("10160", 3, StoryType.NEW_TESTAMENT, Series.LAZARUS, 1, PointInTime.EVERYTIME));
        stories.add(new Story("10161", 3, StoryType.NEW_TESTAMENT, Series.LAZARUS, 2, PointInTime.EVERYTIME));
        stories.add(new Story("10162", 3, StoryType.QUIZ, Series.NO_SERIES, 0, PointInTime.EVERYTIME));
        stories.add(new Story("10163", 3, StoryType.MISSION_STORY, Series.WILD_FORREST, 1, PointInTime.SUMMER));
        stories.add(new Story("10164", 3, StoryType.MISSION_STORY, Series.WILD_FORREST, 2, PointInTime.SUMMER));
        stories.add(new Story("10165", 3, StoryType.MISSION_STORY, Series.WILD_FORREST, 3, PointInTime.SUMMER));
        stories.add(new Story("10166", 3, StoryType.MISSION_STORY, Series.WILD_FORREST, 4, PointInTime.SUMMER));
        stories.add(new Story("10167", 3, StoryType.MISSION_STORY, Series.WILD_FORREST, 5, PointInTime.SUMMER));
        stories.add(new Story("10168", 3, StoryType.MISSION_STORY, Series.WILD_FORREST, 6, PointInTime.SUMMER));
        stories.add(new Story("10169", 3, StoryType.NO_TYPE, Series.HALLOWEEN, 1, PointInTime.HALLOWEEN));
        stories.add(new Story("10170", 3, StoryType.NO_TYPE, Series.HALLOWEEN, 2, PointInTime.HALLOWEEN));
        return stories;
    }
}
