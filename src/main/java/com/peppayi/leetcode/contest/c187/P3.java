package com.peppayi.leetcode.contest.c187;

public class P3 {

    public int longestSubarray(int[] nums, int limit) {
        int longest = 0;

        for (int i = 0; i < nums.length; ++i) {
            int min = nums[i], max = nums[i], len = 1;
            for (int j = i + 1; j < nums.length; ++j) {
                if (nums[j] < min) {
                    min = nums[j];
                }
                else if (nums[j] > max) {
                    max = nums[j];
                }

                if (max - min <= limit) {
                    len++;
                }
                else {
                    break;
                }
            }

            longest = Math.max(longest, len);
        }

        return longest;
    }
}
