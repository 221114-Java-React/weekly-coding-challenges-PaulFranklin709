package com.revature.problem1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    Solution sut = new Solution();

    @Test
    public void test1() {
        assertEquals("olleH", sut.reverseString("Hello"));
    }

    @Test
    public void test2() {
        assertEquals("!dlroW olleH", sut.reverseString("Hello World!"));
    }

    @Test
    public void test3() {
        assertEquals("54321", sut.reverseString("12345"));
    }

    @Test
    public void test4() {
        assertEquals("%$#@!", sut.reverseString("!@#$%"));
    }

    @Test
    public void test5() {
        assertEquals("", sut.reverseString(""));
    }

    @Test
    public void test6() {
        assertEquals(".", sut.reverseString("."));
    }

    @Test
    public void test7() {
        assertEquals("Goodbye   World!", sut.reverseString("!dlroW   eybdooG"));
    }
}