package com.xxf.medium;

import org.junit.Assert;
import org.junit.Test;

public class LengthOfLongestSubstringTest {

    private String testStr = "pwwkew";
    private LengthOfLongestSubstring longestSubstring = new LengthOfLongestSubstring();

    @Test
    public void lengthOfLongestSubstring() {
        int length = longestSubstring.lengthOfLongestSubstring(testStr);
        Assert.assertEquals(3, length);
    }
}