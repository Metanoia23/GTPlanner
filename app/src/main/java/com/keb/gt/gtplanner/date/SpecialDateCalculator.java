package com.keb.gt.gtplanner.date;

import com.keb.gt.gtplanner.resource.PointInTime;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

import static java.util.Calendar.DAY_OF_WEEK;

/**
 * Created by Manu on 05.02.2017.
 */

public final class SpecialDateCalculator {

    private SpecialDateCalculator() throws InstantiationException {
        throw new InstantiationException("Do not instantiate util class.");
    }

    public static PointInTime classifyDate(Date date) {
        if (isJanuary(date)) {
            return PointInTime.JANUARY;
        }
        if (isSeptember(date)) {
            return PointInTime.SEPTEMBER;
        }
        if (isMothersDay(date)) {
            return PointInTime.MOTHERS_DAY;
        }
        if (isHalloween(date)) {
            return PointInTime.HALLOWEEN;
        }
        if (isEaster(date)) {
            return PointInTime.EASTER;
        }
        if (isPentecost(date)) {
            return PointInTime.PENTECOST;
        }
        if (isSummer(date)) {
            return PointInTime.SUMMER;
        }
        if (isFirstAdvent(date)) {
            return PointInTime.FIRST_ADVENT;
        }
        if (isSecondAdvent(date)) {
            return PointInTime.SECOND_ADVENT;
        }
        if (isThirdAdvent(date)) {
            return PointInTime.THIRD_ADVENT;
        }
        if (isFourthAdvent(date)) {
            return PointInTime.FOURTH_ADVENT;
        }
        return PointInTime.EVERYTIME;
    }

    /**
     * Creates a Date instance for Heiligabend the 24th of december
     * @param year The year that the christmas date should be created
     * @return Calendar the christmas date of the given {@code year}
     */
    public static Calendar getChristmasDate(int year) {
        Calendar cal = new GregorianCalendar();
        cal.clear();
        cal.set(year, Calendar.DECEMBER, 24);
        return cal;
    }

    /**
     * Creates a Date instance for the first christmas holiday on 25th of december
     * @param year The year that the christmas holiday date should be created
     * @return Calendar the christmas holiday date of the given {@code year}
     */
    public static Calendar getFirstChristmasHoliday(int year) {
        Calendar cal = new GregorianCalendar();
        cal.clear();
        cal.set(year, Calendar.DECEMBER, 25);
        return cal;
    }

    public static Calendar getFourthAdvent(int year) {
        GregorianCalendar cal = (GregorianCalendar) getFirstChristmasHoliday(year);
        cal.setFirstDayOfWeek(Calendar.MONDAY);
        return getAdvent(cal, Advent.FOURTH_ADVENT);
    }

    public static Calendar getThirdAdvent(int year) {
        GregorianCalendar cal = (GregorianCalendar) getFirstChristmasHoliday(year);
        cal.setFirstDayOfWeek(Calendar.MONDAY);
        return getAdvent(cal, Advent.THIRD_ADVENT);
    }

    public static Calendar getSecondAdvent(int year) {
        GregorianCalendar cal = (GregorianCalendar) getFirstChristmasHoliday(year);
        cal.setFirstDayOfWeek(Calendar.MONDAY);
        return getAdvent(cal, Advent.SECOND_ADVENT);
    }

    public static Calendar getFirstAdvent(int year) {
        GregorianCalendar cal = (GregorianCalendar) getFirstChristmasHoliday(year);
        cal.setFirstDayOfWeek(Calendar.MONDAY);
        return getAdvent(cal, Advent.FIRST_ADVENT);
    }

    /**
     * Creates a Date instance for Halloween on 31th of october
     * @param year The year that the halloween date should be created
     * @return Calendar the halloween date of the given {@code year}
     */
    public static Calendar getHalloween(int year) {
        Calendar cal = new GregorianCalendar();
        cal.clear();
        cal.set(year, Calendar.OCTOBER, 31);
        return cal;
    }

    public static GregorianCalendar getMothersDay(int year) {
        GregorianCalendar gc = new GregorianCalendar();
        gc.clear();
        gc.set(year, Calendar.MAY, 1);

        int dayOfWeek = gc.get(DAY_OF_WEEK);
        int firstSunday = 1;
        if (dayOfWeek != Calendar.SUNDAY) {
            firstSunday = 7 - dayOfWeek;
        }
        gc.set(Calendar.DAY_OF_MONTH, firstSunday);
        gc.add(Calendar.DAY_OF_MONTH, 7);
        return gc;
    }

    public static boolean isSeptember(Date date) {
        Calendar cal = new GregorianCalendar();
        cal.setTime(date);
        final int month = cal.get(Calendar.MONTH);
        return month == Calendar.SEPTEMBER;
    }

    public static boolean isJanuary(Date date) {
        Calendar cal = new GregorianCalendar();
        cal.setTime(date);
        final int month = cal.get(Calendar.MONTH);
        return month == Calendar.JANUARY;
    }

    /**
     * Die Geschichte sollte zwei Sonntage vor Halloween drankommen
     * @param date The date to test
     * @return boolean is this date a match for Halloween story
     */
    public static boolean isHalloween(Date date) {
        Calendar cal = new GregorianCalendar();
        cal.setTime(date);
        final int month = cal.get(Calendar.MONTH);
        if (month == Calendar.OCTOBER) {
//            int day = cal.get(Calendar.DAY_OF_MONTH);
            // SUNDAY = 1 MONDAY = 2 etc.
//            int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
           // (day > 24 && day < 32)
            GregorianCalendar halloween = (GregorianCalendar) getHalloween(cal.get(Calendar.YEAR));
            if ( inTimeSpanOf(cal, halloween, 15)) {
                return true;
            }
        }
        return false;
    }

    /**
     * 14 Tage vor Muttertag sollte die Geschichte fuer den Muttertag drankommen.
     * @param date The date to test
     * @return {@code true} if it is mothers day
     */
    public static boolean isMothersDay(Date date) {
        GregorianCalendar gc = new GregorianCalendar();
        gc.setTime(date);
        int year = gc.get(Calendar.YEAR);
        gc = getMothersDay(year);

        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTime(date);
        return inTimeSpanOf(gregorianCalendar, gc, 14);
    }

    /**
     * 6 Tage vor 1. Advent sollte die Geschichte dafuer drankommen.
     * @param date The date to test
     * @return {@code true} if it is in the time span of first advent
     */
    public static boolean isFirstAdvent(Date date) {
        GregorianCalendar firstAdvent = new GregorianCalendar();
        firstAdvent.setTime(date);
        int year = firstAdvent.get(Calendar.YEAR);
        firstAdvent = (GregorianCalendar) getFirstAdvent(year);

        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTime(date);
        return inTimeSpanOf(gregorianCalendar, firstAdvent, 7);
    }

    /**
     * 7 Tage vor 2. Advent sollte die Geschichte dafuer drankommen.
     * @param date The date to test
     * @return {@code true} if it is in the time span of second advent
     */
    public static boolean isSecondAdvent(Date date) {
        GregorianCalendar secondAdvent = new GregorianCalendar();
        secondAdvent.setTime(date);
        int year = secondAdvent.get(Calendar.YEAR);
        secondAdvent = (GregorianCalendar) getSecondAdvent(year);

        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTime(date);
        return inTimeSpanOf(gregorianCalendar, secondAdvent, 7);
    }

    /**
     * 7 Tage vor 3. Advent sollte die Geschichte dafuer drankommen.
     * @param date The date to test
     * @return {@code true} if it is in the time span of third advent
     */
    public static boolean isThirdAdvent(Date date) {
        GregorianCalendar thirdAdvent = new GregorianCalendar();
        thirdAdvent.setTime(date);
        int year = thirdAdvent.get(Calendar.YEAR);
        thirdAdvent = (GregorianCalendar) getThirdAdvent(year);

        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTime(date);
        return inTimeSpanOf(gregorianCalendar, thirdAdvent, 7);
    }
    /**
     * 7 Tage vor 4. Advent sollte die Geschichte dafuer drankommen.
     * @param date The date to test
     * @return {@code true} if it is in the time span of fourth advent
     */
    public static boolean isFourthAdvent(Date date) {
        GregorianCalendar fourth = new GregorianCalendar();
        fourth.setTime(date);
        int year = fourth.get(Calendar.YEAR);
        fourth = (GregorianCalendar) getFourthAdvent(year);

        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTime(date);
        return inTimeSpanOf(gregorianCalendar, fourth, 7);
    }

    /**
     * Calculates the easter sunday of the given year from the {@code date} parameter
     * @param date The date of which the year is being used to determine easter sunday
     * @return {@code true} If the given date is the date of easter sunday of this year
     */
    public static boolean isEaster(Date date) {
        GregorianCalendar cal = new GregorianCalendar();
        cal.setTime(date);
        Calendar easterDate = easterSunday(cal.get(Calendar.YEAR));
        return equalsPureDate(cal, easterDate);
    }

    /**
     * Test whether year, month and day of month are equal on given dates ignoring hour and time.
     * @param baseDate Date to which the second date parameter is compared to
     * @param compareDate Date to which the first date parameter is compared to
     * @return boolean that is {@code true} if both dates are not null and have same base date.
     */
    public static boolean equalsPureDate(Calendar baseDate, Calendar compareDate) {
        if (baseDate == null || compareDate == null) {
            return false;
        }
        if ((baseDate.get(Calendar.YEAR) == compareDate.get(Calendar.YEAR))
            && (baseDate.get(Calendar.MONTH) == compareDate.get(Calendar.MONTH))
                && (baseDate.get(Calendar.DAY_OF_MONTH) == compareDate.get(Calendar.DAY_OF_MONTH))
                ) {
            return true;
        }
        return false;
    }

    /**
     * Easter Monday = Easter {@code Sunday + 1}
     *
     * Ascension Day = Easter {@code Sunday + 39}
     *
     * Pentecost Sunday = Easter {@code Sunday + 49}
     *
     * Pentecost Monday = Easter {@code Sunday + 50}
     *
     * @param date The date to check
     * @return boolean that is {@code true} if the given date is in the pentecostal date range
     */
    public static boolean isPentecost(Date date) {
        GregorianCalendar gregorianCalendar = (GregorianCalendar) Calendar.getInstance();
        gregorianCalendar.clear();
        gregorianCalendar.setTime(date);

        Calendar pentecost = easterSunday(gregorianCalendar.get(Calendar.YEAR));
        // add 50 because of full day rolling to Pfingstmontag
        pentecost.add(Calendar.DAY_OF_MONTH, 50);
        return inTimeSpanOf(gregorianCalendar, pentecost, 7);
    }

    /**

     * Returns the date of Easter Sunday for a given year.
     *
     * @param year > 1583
     * @return The date of Easter Sunday for a given year.
     */
    public static Calendar easterSunday( int year )
    {
        final int i = year % 19;
        final int j = year / 100;
        final int k = year % 100;

        final int l = (19 * i + j - (j / 4) - ((j - ((j + 8) / 25) + 1) / 3) + 15) % 30;
        final int m = (32 + 2 * (j % 4) + 2 * (k / 4) - l - (k % 4)) % 7;
        final int n = l + m - 7 * ((i + 11 * l + 22 * m) / 451) + 114;

        final int month = n / 31;
        final int day   = (n % 31) + 1;

        return new GregorianCalendar( year, (month - 1), day );
    }


    /**
     * Ist es Sommerferienbeginn 01.07. - Wochentag => Sonntag =>  +1
     * @param date The date to test, whether it is in summer time
     * @return {@code true} if the given {@code date} is in a summer month
     */
    public static boolean isSummer(Date date) {
        GregorianCalendar gc = new GregorianCalendar();
        gc.setTime(date);
        if (((gc.get(Calendar.MONTH)) == Calendar.JUNE)
                || ((gc.get(Calendar.MONTH)) == Calendar.JULY)) {
            return true;
        }

        return false;
    }

    /**
     * It's on 24.12.
     * @param date The date to test
     * @return boolean That is {@code true} if the given date is christmas the 24th of december
     */
    public static boolean isChristmas(Date date) {
        Calendar cal = new GregorianCalendar();
        cal.setTime(date);
        final int month = cal.get(Calendar.MONTH);
        if (month == Calendar.DECEMBER) {
            int day = cal.get(Calendar.DAY_OF_MONTH);
            if (day == 24) {
                return true;
            }
        }
        return false;
    }

    public static boolean inTimeSpanOf(Calendar dateFrom, Calendar dateTo, int spanOfDays) {
        long timeFromInMillis = dateFrom.getTimeInMillis();
        long timeToInMillis = dateTo.getTimeInMillis();
        if (timeFromInMillis > timeToInMillis) {
            return false;
        }
        return calculateDayDistance(timeFromInMillis, timeToInMillis) <= spanOfDays;
    }

    public static long calculateDayDistance(Date dateFrom, Date dateTo) {
       return calculateDayDistance(dateFrom.getTime(), dateTo.getTime());
    }

    public static long calculateDayDistance(long millisFrom, long millisTo) {
        long diffInMillies = millisTo - millisFrom;
        return TimeUnit.DAYS.convert(diffInMillies,TimeUnit.MILLISECONDS);
    }

    public static Calendar getAdvent(Calendar christmas, Advent numOfAdvent) {
        christmas.setFirstDayOfWeek(Calendar.MONDAY);
        //long epochMillis = (time.getTime() - (((long) christmas.get(Calendar.DAY_OF_WEEK)) * 86400000));
        Calendar resultAdvent = Calendar.getInstance();
        resultAdvent.clear();
        resultAdvent.set(christmas.get(Calendar.YEAR), christmas.get(Calendar.MONTH), christmas.get(Calendar.DAY_OF_MONTH));
        resultAdvent.setFirstDayOfWeek(Calendar.MONDAY);
        /*
         * Fix for Calendar not considering firstDayOfWeek variable
         * For this calculation DayOfWeek - number mappings must be as following:
         * First day of week should be in this example monday with value 1 to sunday with value 7.
         * But in java.util.calendar monday is 2
         */
        int dayOfWeek = christmas.get(DAY_OF_WEEK) ;
        dayOfWeek -= 1;
        if (dayOfWeek == 0) {
            dayOfWeek = 7;
        }
        resultAdvent.add(Calendar.DAY_OF_MONTH, (-1) * (dayOfWeek));
//        resultAdvent.setTimeInMillis(epochMillis);
        int distToChristmasSunday = numOfAdvent.getDistToChristmasSunday();
        resultAdvent.add(Calendar.DAY_OF_MONTH, distToChristmasSunday);
        return resultAdvent;
    }

    public enum Advent {
        FIRST_ADVENT(-21),
        SECOND_ADVENT(-14),
        THIRD_ADVENT(-7),
        FOURTH_ADVENT(0);

        private int distToChristmasSunday;

        Advent(int distToChristmasSunday) {
            this.distToChristmasSunday = distToChristmasSunday;
        }

        public int getDistToChristmasSunday() {
            return this.distToChristmasSunday;
        }
    }

}
