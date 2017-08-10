package com.keb.gt.gtplanner.date;

import android.text.format.DateFormat;

import org.junit.Before;
import org.junit.Test;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


/**
 * Created by Manu on 07.02.2017.
 */
public class SpecialDateCalculatorTest {

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void equalsPureDate() throws Exception {

    }

    @Test
    public void classifyDate() throws Exception {

    }

    @Test
    public void isSeptember() throws Exception {

    }

    @Test
    public void isJanuary() throws Exception {

    }

    @Test
    public void isHalloween() throws Exception {

    }

    @Test
    public void isPentecost() throws Exception {
        GregorianCalendar calDate = createCalDate(2010, Calendar.MAY, 24);
        assertTrue(SpecialDateCalculator.isPentecost(calDate.getTime()));
        calDate = createCalDate(2010, Calendar.MAY, 19);
        assertTrue(SpecialDateCalculator.isPentecost(calDate.getTime()));

        calDate = createCalDate(2010, Calendar.MAY, 16);
        assertFalse(SpecialDateCalculator.isPentecost(calDate.getTime()));
    }

    @Test
    public void isMothersDay() throws Exception {

    }

    @Test
    public void getAdvent() throws Exception {
        Calendar gc = Calendar.getInstance();
        gc.clear();
        gc.set(2010, Calendar.DECEMBER, 25);
        gc.setFirstDayOfWeek(Calendar.MONDAY);


        Calendar advent = SpecialDateCalculator.getAdvent(gc, SpecialDateCalculator.Advent.FIRST_ADVENT);
        assertEquals("28.11.2010 00:00:00",SimpleDateFormat.getDateTimeInstance().format(advent.getTime()));
        advent = SpecialDateCalculator.getAdvent(gc, SpecialDateCalculator.Advent.SECOND_ADVENT);
        assertEquals("05.12.2010 00:00:00",SimpleDateFormat.getDateTimeInstance().format(advent.getTime()));
        advent = SpecialDateCalculator.getAdvent(gc, SpecialDateCalculator.Advent.THIRD_ADVENT);
        assertEquals("12.12.2010 00:00:00",SimpleDateFormat.getDateTimeInstance().format(advent.getTime()));
        advent = SpecialDateCalculator.getAdvent(gc, SpecialDateCalculator.Advent.FOURTH_ADVENT);
        assertEquals("19.12.2010 00:00:00", SimpleDateFormat.getDateTimeInstance().format(advent.getTime()));

    }

    @Test
    public void getFourthAdvent() throws Exception {

    }

    @Test
    public void getFirstAdvent() throws Exception {

    }

    @Test
    public void inTimeSpanOf() throws Exception {

    }

    @Test
    public void easterSunday() throws Exception {
        assertEquals(SpecialDateCalculator.easterSunday(1996).get(Calendar.MONTH),Calendar.APRIL);
        assertEquals(SpecialDateCalculator.easterSunday(1996).get(Calendar.DAY_OF_MONTH),7);

        assertEquals(SpecialDateCalculator.easterSunday(2002).get(Calendar.MONTH),Calendar.MARCH);
        assertEquals(SpecialDateCalculator.easterSunday(2002).get(Calendar.DAY_OF_MONTH),31);

        assertEquals(SpecialDateCalculator.easterSunday(2006).get(Calendar.MONTH),Calendar.APRIL);
        assertEquals(SpecialDateCalculator.easterSunday(2006).get(Calendar.DAY_OF_MONTH),16);

        assertEquals(SpecialDateCalculator.easterSunday(2007).get(Calendar.MONTH),Calendar.APRIL);
        assertEquals(SpecialDateCalculator.easterSunday(2007).get(Calendar.DAY_OF_MONTH),8);

        assertEquals(SpecialDateCalculator.easterSunday(2008).get(Calendar.MONTH),Calendar.MARCH);
        assertEquals(SpecialDateCalculator.easterSunday(2008).get(Calendar.DAY_OF_MONTH),23);

        assertEquals(SpecialDateCalculator.easterSunday(2009).get(Calendar.MONTH),Calendar.APRIL);
        assertEquals(SpecialDateCalculator.easterSunday(2009).get(Calendar.DAY_OF_MONTH),12);

        assertEquals(SpecialDateCalculator.easterSunday(2010).get(Calendar.MONTH),Calendar.APRIL);
        assertEquals(SpecialDateCalculator.easterSunday(2010).get(Calendar.DAY_OF_MONTH),4);

        assertEquals(SpecialDateCalculator.easterSunday(2011).get(Calendar.MONTH),Calendar.APRIL);
        assertEquals(SpecialDateCalculator.easterSunday(2011).get(Calendar.DAY_OF_MONTH),24);

        assertEquals(SpecialDateCalculator.easterSunday(2012).get(Calendar.MONTH),Calendar.APRIL);
        assertEquals(SpecialDateCalculator.easterSunday(2012).get(Calendar.DAY_OF_MONTH),8);

        assertEquals(SpecialDateCalculator.easterSunday(2013).get(Calendar.MONTH),Calendar.MARCH);
        assertEquals(SpecialDateCalculator.easterSunday(2013).get(Calendar.DAY_OF_MONTH),31);

        assertEquals(SpecialDateCalculator.easterSunday(2014).get(Calendar.MONTH),Calendar.APRIL);
        assertEquals(SpecialDateCalculator.easterSunday(2014).get(Calendar.DAY_OF_MONTH),20);

        assertEquals(SpecialDateCalculator.easterSunday(2015).get(Calendar.MONTH),Calendar.APRIL);
        assertEquals(SpecialDateCalculator.easterSunday(2015).get(Calendar.DAY_OF_MONTH),5);

        assertEquals(SpecialDateCalculator.easterSunday(2016).get(Calendar.MONTH),Calendar.MARCH);
        assertEquals(SpecialDateCalculator.easterSunday(2016).get(Calendar.DAY_OF_MONTH),27);

        assertEquals(SpecialDateCalculator.easterSunday(2017).get(Calendar.MONTH),Calendar.APRIL);
        assertEquals(SpecialDateCalculator.easterSunday(2017).get(Calendar.DAY_OF_MONTH),16);

        assertEquals(SpecialDateCalculator.easterSunday(2018).get(Calendar.MONTH),Calendar.APRIL);
        assertEquals(SpecialDateCalculator.easterSunday(2018).get(Calendar.DAY_OF_MONTH),1);

        assertEquals(SpecialDateCalculator.easterSunday(2019).get(Calendar.MONTH),Calendar.APRIL);
        assertEquals(SpecialDateCalculator.easterSunday(2019).get(Calendar.DAY_OF_MONTH),21);

        assertEquals(SpecialDateCalculator.easterSunday(2020).get(Calendar.MONTH),Calendar.APRIL);
        assertEquals(SpecialDateCalculator.easterSunday(2020).get(Calendar.DAY_OF_MONTH),12);

        assertEquals(SpecialDateCalculator.easterSunday(2021).get(Calendar.MONTH),Calendar.APRIL);
        assertEquals(SpecialDateCalculator.easterSunday(2021).get(Calendar.DAY_OF_MONTH),4);

        assertEquals(SpecialDateCalculator.easterSunday(2022).get(Calendar.MONTH),Calendar.APRIL);
        assertEquals(SpecialDateCalculator.easterSunday(2022).get(Calendar.DAY_OF_MONTH),17);

        assertEquals(SpecialDateCalculator.easterSunday(2023).get(Calendar.MONTH),Calendar.APRIL);
        assertEquals(SpecialDateCalculator.easterSunday(2023).get(Calendar.DAY_OF_MONTH),9);

        assertEquals(SpecialDateCalculator.easterSunday(2024).get(Calendar.MONTH),Calendar.MARCH);
        assertEquals(SpecialDateCalculator.easterSunday(2024).get(Calendar.DAY_OF_MONTH),31);

        assertEquals(SpecialDateCalculator.easterSunday(2025).get(Calendar.MONTH),Calendar.APRIL);
        assertEquals(SpecialDateCalculator.easterSunday(2025).get(Calendar.DAY_OF_MONTH),20);

        assertEquals(SpecialDateCalculator.easterSunday(2026).get(Calendar.MONTH),Calendar.APRIL);
        assertEquals(SpecialDateCalculator.easterSunday(2026).get(Calendar.DAY_OF_MONTH),05);

        assertEquals(SpecialDateCalculator.easterSunday(2030).get(Calendar.MONTH),Calendar.APRIL);
        assertEquals(SpecialDateCalculator.easterSunday(2030).get(Calendar.DAY_OF_MONTH),21);
    }

    @Test
    public void isEaster() throws Exception {
        // List of easter sundays of some years for testing purposes
        assertTrue(SpecialDateCalculator.isEaster(createDate(1996, Calendar.APRIL,7)));
        assertTrue(SpecialDateCalculator.isEaster(createDate(2002, Calendar.MARCH,31)));
        assertTrue(SpecialDateCalculator.isEaster(createDate(2006, Calendar.APRIL,16)));
        assertTrue(SpecialDateCalculator.isEaster(createDate(2007, Calendar.APRIL,8)));
        assertTrue(SpecialDateCalculator.isEaster(createDate(2008, Calendar.MARCH,23)));
        assertTrue(SpecialDateCalculator.isEaster(createDate(2009, Calendar.APRIL,12)));
        assertTrue(SpecialDateCalculator.isEaster(createDate(2010, Calendar.APRIL,4)));
        assertTrue(SpecialDateCalculator.isEaster(createDate(2011, Calendar.APRIL,24)));
        assertTrue(SpecialDateCalculator.isEaster(createDate(2012, Calendar.APRIL,8)));
        assertTrue(SpecialDateCalculator.isEaster(createDate(2013, Calendar.MARCH,31)));
        assertTrue(SpecialDateCalculator.isEaster(createDate(2014,Calendar.APRIL,20)));
        assertTrue(SpecialDateCalculator.isEaster(createDate(2015,Calendar.APRIL,05)));
        assertTrue(SpecialDateCalculator.isEaster(createDate(2016,Calendar.MARCH,27)));
        assertTrue(SpecialDateCalculator.isEaster(createDate(2017,Calendar.APRIL,16)));
        assertTrue(SpecialDateCalculator.isEaster(createDate(2018,Calendar.APRIL,1)));
        assertTrue(SpecialDateCalculator.isEaster(createDate(2019,Calendar.APRIL,21)));
        assertTrue(SpecialDateCalculator.isEaster(createDate(2020,Calendar.APRIL,12)));
        assertTrue(SpecialDateCalculator.isEaster(createDate(2021,Calendar.APRIL,04)));
        assertTrue(SpecialDateCalculator.isEaster(createDate(2022,Calendar.APRIL,17)));
        assertTrue(SpecialDateCalculator.isEaster(createDate(2023,Calendar.APRIL,9)));
        assertTrue(SpecialDateCalculator.isEaster(createDate(2030,Calendar.APRIL,21)));
    }

    private GregorianCalendar createCalDate(int year, int month, int day) {
        return new GregorianCalendar(year, month, day);
    }

    private Date createDate(int year, int month, int day) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(year, month, day);
        return gregorianCalendar.getTime();
    }

    @Test
    public void isSummer() throws Exception {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(2018, Calendar.JUNE, 14);
        System.out.println(gregorianCalendar.get(Calendar.MONTH));
        assertTrue(SpecialDateCalculator.isSummer(gregorianCalendar.getTime()));
        gregorianCalendar.set(Calendar.MONTH, Calendar.JULY);
        assertTrue(SpecialDateCalculator.isSummer(gregorianCalendar.getTime()));
        gregorianCalendar.set(Calendar.MONTH, Calendar.MAY);
        assertFalse(SpecialDateCalculator.isSummer(gregorianCalendar.getTime()));
    }

    @Test
    public void isFirstAdvent() throws Exception {

    }

    @Test
    public void isChristmas() throws Exception {

    }

}