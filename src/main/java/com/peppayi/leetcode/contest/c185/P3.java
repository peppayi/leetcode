package com.peppayi.leetcode.contest.c185;

import java.util.HashMap;
import java.util.Map;

public class P3 {

    private static Map<Character, Character> nextCroak = new HashMap<>();

    private static final char START_CROAK = 'c';

    static {
        nextCroak.put('c', 'r');
        nextCroak.put('r', 'o');
        nextCroak.put('o', 'a');
        nextCroak.put('a', 'k');
        nextCroak.put('k', 'c');
    }

    public int minNumberOfFrogs(String croakOfFrogs) {
        if (croakOfFrogs == null || croakOfFrogs.isEmpty()) return 0;

        Map<Character, Integer> waitingCroakCount = new HashMap<>();

        int N = croakOfFrogs.length();
        int frogCount = 0;

        for (int i = 0; i < N; ++i) {
            char c = croakOfFrogs.charAt(i);
            if (! nextCroak.containsKey(c)) {
                return -1;
            }

            char next = nextCroak.get(c);
            if (waitingCroakCount.containsKey(c)) {
                waitingCroakCount.compute(c, (key, value) -> value == 1 ? null : value - 1);
                if (next != START_CROAK) {
                    waitingCroakCount.compute(next, (key, value) -> value == null ? 1 : value + 1);
                }
            }
            else if (c == START_CROAK) {
                waitingCroakCount.put(next, waitingCroakCount.getOrDefault(next, 0) + 1);
                frogCount = Math.max(frogCount, waitingCroakCount.values().stream().mapToInt(v -> v).sum());
            }
            else {
                return -1;
            }
        }

        return waitingCroakCount.isEmpty() ? frogCount : -1;
    }
}
