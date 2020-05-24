package com.peppayi.leetcode.problems.lcof;

public class P17 {

    public int[] printNumbers(int n) {
        assert n > 0;

        int max = (int)Math.pow(10, n) - 1;
        int[] rv = new int[max];
        for (int i = 0; i < max; ++i) {
            rv[i] = i + 1;
        }

        return rv;
    }
}
