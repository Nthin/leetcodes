package com.xxf.easy;

import org.junit.Assert;
import org.junit.Test;

public class ReverseLongTest {

    private ReverseLong reverseLong = new ReverseLong();

    @Test
    public void reverseLong() {
        Assert.assertEquals(2198, reverseLong.reverseLong(8912));
    }

    @Test
    public void reverseLong2() {
        Assert.assertEquals(2198, reverseLong.reverseLong2(8912));
    }
}