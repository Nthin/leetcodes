package com.xxf.easy;

import org.junit.Assert;
import org.junit.Test;

public class RomanToIntTest {

    private RomanToInt romanToInt = new RomanToInt();

    @Test
    public void romanToInt() {
        Assert.assertEquals(9, romanToInt.romanToInt("IX"));
        Assert.assertEquals(58, romanToInt.romanToInt("LVIII"));
        Assert.assertEquals(1994, romanToInt.romanToInt("MCMXCIV"));
    }
}