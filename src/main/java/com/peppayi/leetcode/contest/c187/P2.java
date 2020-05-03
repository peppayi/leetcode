package com.peppayi.leetcode.contest.c187;

public class P2 {

    public boolean kLengthApart(int[] nums, int k) {
        int prev = -1-k;

        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] == 1) {
                if (i - prev - 1 >= k) {
                    prev = i;
                }
                else {
                    return false;
                }
            }
        }

        return true;
    }
}
