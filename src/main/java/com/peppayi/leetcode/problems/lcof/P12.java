package com.peppayi.leetcode.problems.lcof;

public class P12 {

    public boolean exist(char[][] board, String word) {
        if (board == null || board.length == 0 || board[0].length == 0) return false;

        int R = board.length;
        int C = board[0].length;

        int N = word.length();

        for (int ri = 0; ri < R; ++ri) {
            for (int ci = 0; ci < C; ++ci) {
                boolean[][] visited = new boolean[R][C];
                if (exist(board, ri, ci, word, 0, visited)) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean exist(char[][] board, int r, int c, String word, int si, boolean[][] visited) {
        if (si == word.length()) return true;

        if (r < 0 || r >= board.length) return false;
        if (c < 0 || c >= board[0].length) return false;
        if (visited[r][c]) return false;

        if (board[r][c] == word.charAt(si)) {
            visited[r][c] = true;
            boolean rv = exist(board, r - 1, c, word, si + 1, visited) || exist(board, r + 1, c, word, si + 1, visited)
                    || exist(board, r, c - 1, word, si + 1, visited) || exist(board, r, c + 1, word, si + 1, visited);
            visited[r][c] = false;
            return rv;
        }
        else {
            return false;
        }
    }
}
