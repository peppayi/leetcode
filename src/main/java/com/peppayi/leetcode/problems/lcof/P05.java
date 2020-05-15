package com.peppayi.leetcode.problems.lcof;

public class P05 {

    public String replaceSpace(String s) {
        if (s == null || s.isEmpty()) return s;

        int N = s.length();
        long spaceCount = s.chars().filter(Character::isWhitespace).count();

        int newSize = N + (int) spaceCount * 2;
        int ni = 0;

        char[] ch = new char[newSize];
        for (int i = 0; i < N; ++i) {
            char c = s.charAt(i);
            if (Character.isWhitespace(c)) {
                ch[ni++] = '%';
                ch[ni++] = '2';
                ch[ni++] = '0';
            }
            else {
                ch[ni++] = c;
            }
        }

        return String.valueOf(ch);
    }
}
