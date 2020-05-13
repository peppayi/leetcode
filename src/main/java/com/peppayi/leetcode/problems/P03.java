package com.peppayi.leetcode.problems;

public class P03 {

    public int findRepeatNumber(int[] nums) {
        assert nums.length >= 2 && nums.length <= 100000;

        int N = nums.length;

        int i = 0;
        while (i < N) {
            int v = nums[i];
            assert v >= 0 && v < N;

            if (v == i) {
                i++;
            }
            else if (v == nums[v]) {
                return v;
            }
            else {
                swap(nums, i, v);
            }
        }

        throw new IllegalArgumentException("no duplicate numbers found");
    }

    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
