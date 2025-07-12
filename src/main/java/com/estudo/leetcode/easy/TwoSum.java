package com.estudo.leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode.com/problems/two-sum/description/">See description</a>
 * */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> diffs = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            if (diffs.containsKey(nums[i])) {
                return new int[]{diffs.get(nums[i]), i};
            } else {
                int diff = target - nums[i];
                diffs.put(diff, i);
            }
        }

        return null;
    }
}
