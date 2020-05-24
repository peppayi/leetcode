package com.peppayi.leetcode.problems.lcof;

public class P16 {

    public double myPow(double x, int n) {
        if (n < 0) {
            return 1 / (x * myPow(x, -(n+1)));
        }
        else if (n == 0) {
            return 1.0d;
        }
        else {
            return n % 2 == 0 ? myPow(x * x, n / 2) : myPow(x * x, n / 2) * x;
        }
    }
}
