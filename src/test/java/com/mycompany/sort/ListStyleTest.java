package com.mycompany.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

public class ListStyleTest {

    @Test
    public void testSort() {
        List<Integer> raw = new ArrayList<>(Arrays.asList(32, 21, 454, 65, 12, 34));
        List<Integer> expResult = new ArrayList<>(Arrays.asList(454, 65, 34, 32, 21, 12));;
        List<Integer> result = ListStyle.sort(raw);
        assertEquals(expResult, result);
    }

    @Test
    public void testSortEmptyList() {
        List<Integer> raw = new ArrayList<>();
        List<Integer> expResult = new ArrayList<>();;
        List<Integer> result = ListStyle.sort(raw);
        assertEquals(expResult, result);
    }

    @Test(expected = NullPointerException.class)
    public void testSortNullList() {
        List<Integer> raw = null;
        ListStyle.sort(raw);
    }

}
