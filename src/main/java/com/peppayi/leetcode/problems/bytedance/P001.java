package com.peppayi.leetcode.problems.bytedance;

public class P001 {

    public int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length == 0) throw new IllegalArgumentException("nums is empty");

        for (int i = 0; i < nums.length; ++i) {
            for (int j = i + 1; j < nums.length; ++j) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }

        throw new IllegalArgumentException("No such two elements");
    }
}
