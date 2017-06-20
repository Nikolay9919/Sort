package com.mycompany.sort;

import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayStyleTest {

    @Test
    public void testSort() {
        int[] arr = {32, 21, 454, 65, 12, 34};
        int[] expResult = {454, 65, 34, 32, 21, 12};
        int[] result = ArrayStyle.sort(arr);
        assertArrayEquals(expResult, result);
    }

    @Test
    public void testSortEmptyArray() {
        int[] arr = {};
        int[] expResult = {};
        int[] result = ArrayStyle.sort(arr);
        assertArrayEquals(expResult, result);
    }

    @Test(expected = NullPointerException.class)
    public void testSortNull() {
        int[] arr = null;
        ArrayStyle.sort(arr);
    }

}
