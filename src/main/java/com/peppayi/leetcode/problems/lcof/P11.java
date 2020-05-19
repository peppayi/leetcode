package com.peppayi.leetcode.problems.lcof;

public class P11 {

    public int minArray(int[] numbers) {
        if (numbers == null || numbers.length == 0) throw new IllegalArgumentException("numbers is empty");

        int N = numbers.length;
        int lo = 0, hi = N - 1;
        while (lo < hi) {
            int mi = (hi - lo) / 2 + lo;

            if (numbers[mi] > numbers[hi]) {
                lo = mi + 1;
            }
            else if (numbers[mi] < numbers[lo]){
                hi = mi - 1;
            }
            else {
                hi--;
            }
        }

        return numbers[lo];
    }
}
