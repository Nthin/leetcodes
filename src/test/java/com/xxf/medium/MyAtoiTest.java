package com.xxf.medium;

import org.junit.Assert;
import org.junit.Test;

public class MyAtoiTest {

    private MyAtoi atoi = new MyAtoi();

    @Test
    public void myAtoi() {
        Assert.assertEquals(42, atoi.myAtoi("42"));
        Assert.assertEquals(-42, atoi.myAtoi("   -42"));
        Assert.assertEquals(4193, atoi.myAtoi("4193 with words"));
        Assert.assertEquals(0, atoi.myAtoi("words and 987"));
        Assert.assertEquals(Integer.MIN_VALUE, atoi.myAtoi("-91283472332"));
    }
}