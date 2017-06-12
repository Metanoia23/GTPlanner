package com.keb.gt.gtplanner.resource;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

/**
 * Created by Manu on 06.02.2017.
 */
public class SeriesTest {
    @Test
    public void testConsistensy() {
        Set<Integer> seriesNums = new HashSet<>();
        for (Series series : Series.values()) {
            assertFalse(seriesNums.contains(series.getNumber()));
            seriesNums.add(series.getNumber());
        }
    }

}