package com.peppayi.leetcode.problems;

public class P05 {

    public String replaceSpace(String s) {
        if (s == null || s.isEmpty()) return s;

        int N = s.length();
        StringBuilder sb = new StringBuilder(N * 3);
        for (int i = 0; i < N; ++i) {
            char c = s.charAt(i);
            if (Character.isWhitespace(c)) {
                sb.append("%20");
            }
            else {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}
