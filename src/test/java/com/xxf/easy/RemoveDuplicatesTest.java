package com.xxf.easy;

import org.junit.Assert;
import org.junit.Test;

public class RemoveDuplicatesTest {

    private RemoveDuplicates removeDuplicates = new RemoveDuplicates();

    @Test
    public void removeDuplicates() {
        int[] nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int result = removeDuplicates.removeDuplicates(nums);
        Assert.assertEquals(5, result);
        int[] results = new int[result];
        System.arraycopy(nums, 0, results, 0, result);
        Assert.assertArrayEquals(new int[]{0, 1, 2, 3, 4}, results);
    }
}