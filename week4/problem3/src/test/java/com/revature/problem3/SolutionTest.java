package com.revature.problem3;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    Solution s = new Solution();

    @Test
    public void test1() {
        String sentence = "The big dog jumped high    over the lazy red fox  and the man with the  red hat sat high  in the chair and laughed";
        String ans = "and: 2\nhigh: 2\nred: 2\nthe: 5";
        assertEquals(ans, s.wordCount(sentence));
    }

    @Test
    public void test2() {
        String sentence = "Big blue red   Orange biG small  Purple  black white  white Red red";
        String ans = "big: 2\nred: 3\nwhite: 2";
        assertEquals(ans, s.wordCount(sentence));
    }

    @Test
    public void test3() {
        String sentence = "java javascript   python book book club pack backpack";
        String ans = "book: 2";
        assertEquals(ans, s.wordCount(sentence));
    }
}