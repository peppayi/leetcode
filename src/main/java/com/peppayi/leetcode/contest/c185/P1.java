package com.peppayi.leetcode.contest.c185;

public class P1 {

    public String reformat(String s) {
        if (s == null || s.isEmpty()) return "";

        int N = s.length();
        char[] chars = new char[N], digits = new char[N];
        int ci = 0, di = 0;
        for (int i = 0; i < N; ++i) {
            char c = s.charAt(i);
            if (Character.isLetter(c)) {
                chars[ci++] = c;
            }
            else {
                digits[di++] = c;
            }
        }

        if (ci - di > 1 || di - ci > 1) return "";

        char[] rv = new char[N];
        if (ci >= di) {
            for (int i = 0; i < di; ++i) {
                rv[2*i] = chars[i];
                rv[2*i+1] = digits[i];
            }
            if (ci > di) {
                rv[N-1] = chars[ci-1];
            }
        }
        else {
            for (int i = 0; i < ci; ++i) {
                rv[2*i] = digits[i];
                rv[2*i+1] = chars[i];
            }
            rv[N-1] = digits[di-1];
        }

        return String.valueOf(rv);
    }
}
