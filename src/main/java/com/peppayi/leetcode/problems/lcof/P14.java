package com.peppayi.leetcode.problems.lcof;

public class P14 {

    public int cuttingRope(int n) {
        if (n <= 3) return n - 1;

        int multiply = 1;
        while (n - 3 > 1) {
            multiply *= 3;
            n -= 3;
        }

        multiply *= n;
        return multiply;
    }
}
