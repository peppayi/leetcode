package com.peppayi.leetcode.problems.lcof;

public class P13 {

    public int movingCount(int m, int n, int k) {
        return movingCount(m, n, k, 0, 0, new boolean[m][n]);
    }

    private int movingCount(int m, int n, int k, int mi, int ni, boolean[][] visited) {
        if (mi < 0 || mi == m || ni < 0 || ni == n) return 0;
        if (visited[mi][ni]) return 0;

        int sum = indexSum(mi) + indexSum(ni);
        if (sum <= k) {
            visited[mi][ni] = true;
            return 1 + movingCount(m, n, k, mi - 1, ni, visited) + movingCount(m, n, k, mi + 1, ni, visited) +
                    movingCount(m, n, k, mi, ni - 1, visited) + movingCount(m, n, k, mi, ni + 1, visited);
        }
        else {
            return 0;
        }
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
