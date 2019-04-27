package com.xxf.easy;

import org.junit.Assert;
import org.junit.Test;

public class StrStrTest {

    private StrStr strStr = new StrStr();

    @Test
    public void strStr() {
        Assert.assertEquals(2, strStr.strStr("hello", "ll"));
        Assert.assertEquals(-1, strStr.strStr("aaaaa", "bba"));
    }
}