package com.xxf.easy;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class IsValidTest {

    private IsValid isValid = new IsValid();

    @Test
    public void isValid() {
        String str1 = "()[]{}";
        Assert.assertTrue(isValid.isValid(str1));
        String str2 = "(]";
        Assert.assertFalse(isValid.isValid(str2));
        String str3 = "([)]";
        Assert.assertFalse(isValid.isValid(str3));
        String str4 = "{[]}";
        Assert.assertTrue(isValid.isValid(str4));
        String str5 = "((((((((((((((((";
        Assert.assertFalse(isValid.isValid(str5));
    }
}