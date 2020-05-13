package com.peppayi.leetcode.problems;

public class P03 {

    public int findRepeatNumber(int[] nums) {
        assert nums.length >= 2 && nums.length <= 100000;

        boolean[] exists = new boolean[nums.length];
        for (int n : nums) {
            if (exists[n]) {
                return n;
            }

            exists[n] = true;
        }

        return -1;
    }
}
