package com.xxf.medium;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ZConvertTest {

    private ZConvert convert = new ZConvert();

    @Test
    public void convert() {
        Assert.assertEquals("LCIRETOESIIGEDHN", convert.convert("LEETCODEISHIRING", 3));
        Assert.assertEquals("LDREOEIIECIHNTSG", convert.convert("LEETCODEISHIRING", 4));
    }
}