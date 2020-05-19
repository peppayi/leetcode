package com.peppayi.leetcode.problems.lcof;

public class P11 {

    public int minArray(int[] numbers) {
        if (numbers == null || numbers.length == 0) throw new IllegalArgumentException("numbers is empty");

        return minArray(numbers, 0, numbers.length - 1);
    }

    private int minArray(int[] numbers, int start, int end) {
        if (start == end) return numbers[start];
        else if (start + 1 == end) return Math.min(numbers[start], numbers[end]);
        else {
            int mid = (end - start) / 2 + start;
            return Math.min(minArray(numbers, start, mid), minArray(numbers, mid + 1, end));
        }
    }
}
