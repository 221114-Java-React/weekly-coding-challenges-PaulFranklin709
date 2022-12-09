package com.revature.problem2;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.*;

public class SolutionTest {
    Solution sut = new Solution();

    @Test
    public void test1() {
        assertEquals(Arrays.asList("1", "2", "abraca"), sut.abracadabra(3));
    }

    @Test
    public void test2() {
        assertEquals(Arrays.asList("1", "2", "abraca", "4", "dabra"), sut.abracadabra(5));
    }

    @Test
    public void test3() {
        assertEquals(Arrays.asList("1", "2", "abraca", "4", "dabra", "abraca", "7", "8", "abraca", "dabra", "11", "abraca", "13", "14", "abracadabra"), sut.abracadabra(15));
    }

    @Test
    public void test4() {
        assertEquals(Collections.emptyList(), sut.abracadabra(0));
    }

    @Test
    public void test5() {
        assertEquals(Collections.singletonList("1"), sut.abracadabra(1));
    }


}