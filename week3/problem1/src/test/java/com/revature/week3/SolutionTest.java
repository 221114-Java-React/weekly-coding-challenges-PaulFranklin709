package com.revature.week3;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    private Solution sut;

    @Before
    public void setUp() throws Exception {
        sut = new Solution();
    }

    @Test
    public void test_isAnagram() {
        assertTrue(sut.isAnagram("arm", "ram"));
        assertTrue(sut.isAnagram("dog", "god"));
        assertTrue(sut.isAnagram("meat", "team"));
        assertTrue(sut.isAnagram("sink", "skin"));
        assertTrue(sut.isAnagram("best", "bets"));
    }

    @Test
    public void test_isNotAnagram() {
        assertFalse(sut.isAnagram("arm", "rom"));
        assertFalse(sut.isAnagram("dogs", "god"));
        assertFalse(sut.isAnagram("meat", "meet"));
        assertFalse(sut.isAnagram("sink", "skinn"));
        assertFalse(sut.isAnagram("bestz", "betz"));
    }

    @Test
    public void test_isAnagram_edgeCases() {
        assertTrue(sut.isAnagram("SSE ca", "caE SS"));
        assertTrue(sut.isAnagram("d O  g", "god"));
        assertTrue(sut.isAnagram("me T A  ", "TeAm"));
        assertTrue(sut.isAnagram("S.in.K.", "skin..."));
        assertTrue(sut.isAnagram("BEST", "      BETS"));
    }

    @Test
    public void test_isNotAnagram_edgeCases() {
        assertFalse(sut.isAnagram("arm", ""));
        assertFalse(sut.isAnagram("", "GOD"));
        assertFalse(sut.isAnagram("meat   ", "   meet"));
        assertFalse(sut.isAnagram("sin.k", "s.k.inn"));
        assertFalse(sut.isAnagram("bestz!@", ",,,,,,,"));
    }
}