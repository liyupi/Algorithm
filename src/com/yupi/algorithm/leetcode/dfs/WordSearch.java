package com.yupi.algorithm.leetcode.dfs;

/**
 * 功能描述：单词搜索
 * <p>
 * 思路：设置访问数组，dfs
 */

public class WordSearch {

    private int[][] dir = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    private boolean[][] visited;

    public boolean exist(char[][] board, String word) {
        int m = board.length;
        if (m == 0 || word == null || word.length() == 0) {
            return false;
        }
        int n = board[0].length;
        if (n == 0) {
            return false;
        }
        visited = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == word.charAt(0)) {
                    visited[i][j] = true;
                    if (dfs(board, word, i, j, 1)) {
                        return true;
                    }
                    visited[i][j] = false;
                }
            }
        }
        return false;
    }

    private boolean dfs(char[][] board, String word, int x, int y, int pos) {
        if (pos == word.length()) {
            return true;
        }
        for (int i = 0; i < dir.length; i++) {
            int nextX = x + dir[i][0];
            int nextY = y + dir[i][1];
            if (nextX >= 0 && nextX < board.length && nextY >= 0 && nextY < board[0].length
                    && !visited[nextX][nextY] && board[nextX][nextY] == word.charAt(pos)) {
                visited[nextX][nextY] = true;
                if (dfs(board, word, nextX, nextY, pos + 1)) {
                    return true;
                }
                visited[nextX][nextY] = false;
            }
        }
        return false;
    }

}