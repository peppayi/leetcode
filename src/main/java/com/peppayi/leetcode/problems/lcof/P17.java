package com.peppayi.leetcode.problems.lcof;

public class P17 {

    public int[] printNumbers(int n) {
        assert n > 0;

        int max = 0;
        while (n > 0) {
            max *= 10;
            max += 9;
            n--;
        }

        int[] rv = new int[max];
        for (int i = 1; i <= max; ++i) {
            rv[i-1] = i;
        }

        return rv;
    }
}
