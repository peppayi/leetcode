package com.peppayi.leetcode.problems;

public class P04 {

    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        int M = matrix.length;
        if (M == 0) return false;

        int N = matrix[0].length;

        int ri = 0, ci = N - 1;
        while (ri < M && ci >= 0) {
            int v = matrix[ri][ci];
            if (v == target) {
                return true;
            }
            else if (v < target) {
                ri++;
            }
            else {
                ci--;
            }
        }

        return false;
    }
}
