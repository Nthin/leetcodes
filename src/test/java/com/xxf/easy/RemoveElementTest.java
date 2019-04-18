package com.xxf.easy;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class RemoveElementTest {

    private RemoveElement removeElement = new RemoveElement();
    private int[] nums = new int[]{0, 1, 2, 2, 3, 0, 4, 2};

    @Test
    public void removeElement() {
        int result = removeElement.removeElement(nums, 2);
        Assert.assertEquals(5, result);
        int[] results = new int[result];
        System.arraycopy(nums, 0, results, 0, result);
        Arrays.sort(results);
        Assert.assertArrayEquals(new int[]{0, 0, 1, 3, 4}, results);
    }

    @Test
    public void removeElement2() {
        int result = removeElement.removeElement2(nums, 0);
        Assert.assertEquals(6, result);
        int[] results = new int[result];
        System.arraycopy(nums, 0, results, 0, result);
        Arrays.sort(results);
        Assert.assertArrayEquals(new int[]{1, 2, 2, 2, 3, 4}, results);
    }
}