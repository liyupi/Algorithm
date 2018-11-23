package com.yupi.algorithm.leetcode.dfs;

/**
 * 功能描述：被围绕的区域
 *
 * 思路：因为与边界相邻的O不会被改变，因此可以访问所有与边界相邻的O，没访问过即可变成X
 */

public class AroundArea {

    boolean[][] visited;

    int[][] dir = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    public void solve(char[][] board) {
        int m = board.length;
        if (m < 3) {
            return;
        }
        int n = board[0].length;
        if (n < 3) {
            return;
        }
        visited = new boolean[m][n];
        for (int j = 0; j < n; j++) {
            if (board[0][j] == 'O' && !visited[0][j]) {
                dfs(board, 0, j);
            }
            if (board[m - 1][j] == 'O' && !visited[m - 1][j]) {
                dfs(board, m - 1, j);
            }
        }
        for (int i = 0; i < m; i++) {
            if (board[i][0] == 'O' && !visited[i][0]) {
                dfs(board, i, 0);
            }
            if (board[i][n - 1] == 'O' && !visited[i][n - 1]) {
                dfs(board, i, n - 1);
            }
        }
        for (int i = 1; i < m - 1; i++) {
            for (int j = 1; j < n - 1; j++) {
                if (board[i][j] == 'O' && !visited[i][j]) {
                    board[i][j] = 'X';
                }
            }
        }
    }

    private void dfs(char[][] board, int x, int y) {
        visited[x][y] = true;
        for (int[] aDir : dir) {
            int nextX = x + aDir[0];
            int nextY = y + aDir[1];
            if (nextX >= 0 && nextX < board.length && nextY >= 0 && nextY < board[0].length
                    && board[nextX][nextY] == 'O' && !visited[nextX][nextY]) {
                dfs(board, nextX, nextY);
            }
        }
    }
}