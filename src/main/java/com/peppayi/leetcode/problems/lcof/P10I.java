package com.peppayi.leetcode.problems.lcof;

public class P10I {

    public int fib(int n) {
        int a = 0, b = 1;

        if (n == 0) return a;
        if (n == 1) return b;

        for (int i = 2; i <= n; ++i) {
            int c = (a + b) % 1000000007;
            a = b;
            b = c;
        }

        return b;
    }
}
