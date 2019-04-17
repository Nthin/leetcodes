package com.xxf.easy;

import org.junit.Assert;
import org.junit.Test;

public class LongestCommonPrefixTest {

    private LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
    private String[] strs1 = new String[]{"flower", "flow", "flight"};
    private String[] strs2 = new String[]{"dog","racecar","car"};
    private String[] strs3 = new String[]{"dog"};
    private String[] strs4 = new String[]{"c", "c"};

    @Test
    public void longestCommonPrefix() {
        String result1 = longestCommonPrefix.longestCommonPrefix(strs1);
        String result2 = longestCommonPrefix.longestCommonPrefix(strs2);
        String result3 = longestCommonPrefix.longestCommonPrefix(strs3);
        String result4 = longestCommonPrefix.longestCommonPrefix(strs4);
        Assert.assertEquals("fl", result1);
        Assert.assertEquals("", result2);
        Assert.assertEquals("dog", result3);
        Assert.assertEquals("c", result4);
    }

    @Test
    public void longestCommonPrefix2() {
        String result1 = longestCommonPrefix.longestCommonPrefix2(strs1);
        String result2 = longestCommonPrefix.longestCommonPrefix2(strs2);
        String result3 = longestCommonPrefix.longestCommonPrefix2(strs3);
        String result4 = longestCommonPrefix.longestCommonPrefix2(strs4);
        Assert.assertEquals("fl", result1);
        Assert.assertEquals("", result2);
        Assert.assertEquals("dog", result3);
        Assert.assertEquals("c", result4);
    }
}