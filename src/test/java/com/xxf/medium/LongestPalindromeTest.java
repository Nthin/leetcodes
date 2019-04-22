package com.xxf.medium;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LongestPalindromeTest {

    private LongestPalindrome longestPalindrome = new LongestPalindrome();

    @Test
    public void longestPalindrome() {
        Assert.assertEquals("bab", longestPalindrome.longestPalindrome("babad"));
        Assert.assertEquals("bb", longestPalindrome.longestPalindrome("cbbd"));
        Assert.assertEquals("aba", longestPalindrome.longestPalindrome("abacdfgdcaba"));
    }
}