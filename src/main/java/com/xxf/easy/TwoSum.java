package com.xxf.easy;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int minusResult = target - nums[i];
            if (numMap.containsKey(minusResult)) {
                return new int[]{i, numMap.get(minusResult)};
            }
            numMap.put(nums[i], i);
        }
        return new int[2];
    }

}
