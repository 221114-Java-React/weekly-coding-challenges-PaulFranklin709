package com.revature.problem1;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    Solution s = new Solution();

    @Test
    public void test1() {
        int[] arr = {2, 5, 7, 9, 21, 34};
        int k = 20;

        assertEquals(22, s.elementNotInArray(arr, k));
    }

    @Test
    public void test2() {
        int[] arr = {1, 4, 5, 2, 7};
        int k = 4;

        assertEquals(6, s.elementNotInArray(arr, k));
    }

    @Test
    public void test3() {
        int[] arr = {22, 26, 45, 72, 81, 47, 29, 97, 2, 75, 25, 82, 84, 17, 56, 32, 2, 28, 37, 57, 39, 18, 11};
        int k = 75;

        assertEquals(76, s.elementNotInArray(arr, k));
    }

    @Test
    public void test4() {
        int[] arr = {79, 40, 68, 68, 16, 40, 63, 93, 49, 91, 10, 55, 68, 31, 80, 57, 18, 34, 28, 76, 55, 21, 80, 22, 45, 11, 67, 67, 74, 91, 4, 35, 34, 65, 80, 21, 95, 1, 52, 25, 31, 2, 53, 96, 22, 89, 99, 7, 66, 32, 2, 68, 33, 75, 92, 84, 10, 94, 28, 54, 12, 9, 80, 43, 21, 51, 92, 20, 97, 7, 25, 67, 17, 38, 100, 86, 4, 83, 20, 6};
        int k = 6;

        assertEquals(8, s.elementNotInArray(arr, k));
    }

    @Test
    public void test5() {
        int[] arr = {81, 59, 53, 2, 54, 62, 25, 35, 79, 64, 27, 49, 32, 95, 100, 20, 58, 39, 92, 30, 67, 89, 58, 81, 100, 66, 73, 29, 75, 81, 70, 55, 18, 28, 7, 35, 98, 52, 30, 11, 69, 48, 84, 54, 13, 14, 15, 86, 34, 82, 92, 26, 8, 53, 62, 57, 50, 31, 61, 85, 88, 5, 80, 64, 90, 52, 47, 43, 40, 93, 69, 70, 16, 43, 7, 25, 99, 12, 63, 99, 71, 76};
        int k = 58;

        assertEquals(60, s.elementNotInArray(arr, k));
    }
}