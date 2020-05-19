package com.peppayi.leetcode.problems.lcof;

public class P11 {

    public int minArray(int[] numbers) {
        if (numbers == null || numbers.length == 0) throw new IllegalArgumentException("numbers is empty");

        int i = 0;
        while (i < numbers.length - 1) {
            if (numbers[i] > numbers[i + 1]) {
                return numbers[i + 1];
            }

            i++;
        }

        return numbers[0];
    }
}
