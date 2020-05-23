package com.peppayi.leetcode.problems.lcof;

public class P15 {

    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int c = 0;

        while (n != 0) {
            c += n & 1;
            n >>>= 1;
        }

        return c;
    }
}
