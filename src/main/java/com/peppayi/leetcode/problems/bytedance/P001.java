package com.peppayi.leetcode.problems.bytedance;

import java.util.HashMap;
import java.util.Map;

public class P001 {

    public int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length == 0) throw new IllegalArgumentException("nums is empty");

        Map<Integer, Integer> caches = new HashMap<>(nums.length, 1);
        for (int i = 0; i < nums.length; ++i) {
            int n = nums[i];
            int complement = target - n;
            Integer index = caches.get(complement);
            if (index == null) {
                caches.put(n, i);
            }
            else {
                return new int[] {index, i};
            }
        }

        throw new IllegalArgumentException("No such two elements");
    }
}
