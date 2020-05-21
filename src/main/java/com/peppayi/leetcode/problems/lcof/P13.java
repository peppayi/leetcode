package com.peppayi.leetcode.problems.lcof;

import java.util.ArrayDeque;
import java.util.Queue;

public class P13 {

    public int movingCount(int m, int n, int k) {
        boolean[][] visited = new boolean[m][n];
        int count = 0;

        Queue<int[]> queue = new ArrayDeque<>();
        queue.add(new int[] {0, 0});
        while (! queue.isEmpty()) {
            int[] e = queue.poll();
            int mi = e[0], ni = e[1];
            if (mi == m || ni == n || visited[mi][ni] || indexSum(mi) + indexSum(ni) > k) continue;
            visited[mi][ni] = true;
            count++;
            queue.add(new int[]{mi + 1, ni});
            queue.add(new int[]{mi, ni + 1});
        }

        return count;
    }

    private int indexSum(int i) {
        int sum = 0;
        while (i > 0) {
            sum += i % 10;
            i /= 10;
        }

        return sum;
    }
}
