package com.revature.problem2;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {
    Solution s = new Solution();

    @Test
    public void test1() {
        List<String> list = Arrays.asList("do", "dog", "cat", "bird", "donut", "cake", "dough");
        assertEquals(Arrays.asList("dog", "donut", "dough"), s.autoComplete(list));
    }

    @Test
    public void test2() {
        List<String> list = Arrays.asList("spo", "fork", "knife", "spoon", "spin", "spun", "spool", "spork", "bowl");
        assertEquals(Arrays.asList("spool", "spoon", "spork"), s.autoComplete(list));
    }

    @Test
    public void test3() {
        List<String> list = Arrays.asList("base", "ball", "bar", "baseball", "basement", "bathroom", "bedroom");
        assertEquals(Arrays.asList("baseball", "basement"), s.autoComplete(list));
    }

    @Test
    public void test4() {
        List<String> list = Arrays.asList("com", "computer", "incomplete", "recomb", "capcom", "compos", "sitcom");
        assertEquals(Arrays.asList("computer", "compos"), s.autoComplete(list));
    }
}