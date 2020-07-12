package com.peppayi.leetcode.problems;

public class P031 {

    public void nextPermutation(int[] nums) {
        if (nums == null || nums.length == 0) return;

        int N = nums.length;

        int e = N - 1;
        while (e > 0 && nums[e] <= nums[e-1]) {
            e--;
        }

        if (e > 0) {
            int targetI = e;
            while (targetI < N - 1 && nums[targetI + 1] > nums[e - 1]) {
                targetI++;
            }
            swap(nums, e - 1, targetI);
        }

        reverse(nums, e, N-1);
    }

    private void swap(int[] nums, int i, int j) {
        if (i != j) {
            int tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
        }
    }

    private void reverse(int[] nums, int s, int e) {
        while (s < e) {
            swap(nums, s++, e--);
        }
    }
}
