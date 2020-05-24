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
            double v = 1.0d;

            while (n > 0) {
                v *= x;
                n--;
            }

            return v;
        }
    }
}
