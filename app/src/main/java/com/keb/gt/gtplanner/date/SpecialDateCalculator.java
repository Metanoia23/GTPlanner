package com.keb.gt.gtplanner.date;

import com.keb.gt.gtplanner.resource.PointInTime;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

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
        return PointInTime.EVERYTIME;
    }

    private static Date getChristmasDate(int year) {
        Calendar cal = Calendar.getInstance();
        cal.set(year, 12, 24);
        return cal.getTime();
    }

    public static Date getHalloween(int year) {
        Calendar cal = Calendar.getInstance();
        cal.set(year, Calendar.OCTOBER, 31);
        return cal.getTime();
    }

    public static boolean isSeptember(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        final int month = cal.get(Calendar.MONTH);
        return month == Calendar.SEPTEMBER;
    }

    public static boolean isJanuary(Date date) {
        Calendar cal = Calendar.getInstance();
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
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        final int month = cal.get(Calendar.MONTH);
        if (month == Calendar.OCTOBER) {
            int day = cal.get(Calendar.DAY_OF_MONTH);
            // SUNDAY = 1 MONDAY = 2 etc.
            int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
            if (day > 24 && day < 32) {
                return true;
            }
        }
        return false;
    }

    /**
     * 14 Tage vor Muttertag sollte die Geschichte fuer den Muttertag drankommen.
     * @param date The date to test
     * @return
     */
    public static boolean isMothersDay(Date date) {
        return false;
    }

    /**
     *
     * @param date
     * @return
     */
    public static boolean isEaster(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        Calendar instance = Calendar.getInstance();
        instance.set(cal.get(Calendar.YEAR), Calendar.MARCH, 20);
//        instance.add(Calendar.DAY_OF_MONTH, -28);
        Computus easterComputus = new Computus(cal.get(Calendar.YEAR));
        Calendar easterDate = easterComputus.calcEasterDate();
        return date.equals(easterDate.getTime());
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

        return  new GregorianCalendar( year, (month - 1), day );
    }


    /**
     * Ist es Sommerferienbeginn 01.07. - Wochentag => Sonntag =>  +1
     * @param date
     * @return
     */
    public static boolean isSummer(Date date) {
        return false;
    }

    public static boolean isFirstAdvent(Date date) {
        return false;
    }

    /**
     * It's on 24.12.
     * @param date The date to test
     * @return boolean That is {@code true} if the given date is christmas the 24th of december
     */
    public static boolean isChristmas(Date date) {
        Calendar cal = Calendar.getInstance();
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

    private static long calculateDayDistance(Date dateFrom, Date dateTo) {
        long diffInMillies = dateTo.getTime() - dateFrom.getTime();
        return TimeUnit.DAYS.convert(diffInMillies,TimeUnit.MILLISECONDS);
    }

}
