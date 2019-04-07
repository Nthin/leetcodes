package com.xxf.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class TwoSumTest {

    @Test
    public void twoSum() {
        int[] nums = new int[]{1, 3, 4, 7, 8};
        int target = 7;
        TwoSum twoSum = new TwoSum();
        int[] indexes = twoSum.twoSum(nums, target);
        assertEquals(2, indexes.length);
        assertEquals(target, nums[indexes[0]] + nums[indexes[1]]);
    }
}