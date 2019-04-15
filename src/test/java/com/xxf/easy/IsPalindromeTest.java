package com.xxf.easy;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class IsPalindromeTest {

    private IsPalindrome isPalindrome = new IsPalindrome();

    @Test
    public void isPalindrome() {
        assertTrue(isPalindrome.isPalindrome(121));
        assertFalse(isPalindrome.isPalindrome(10));
        assertFalse(isPalindrome.isPalindrome(-123));
        assertFalse(isPalindrome.isPalindrome(200));
    }

    @Test
    public void isPalindrome2() {
        assertTrue(isPalindrome.isPalindrome(121));
        assertFalse(isPalindrome.isPalindrome(10));
        assertFalse(isPalindrome.isPalindrome(-123));
        assertFalse(isPalindrome.isPalindrome(200));
    }
}