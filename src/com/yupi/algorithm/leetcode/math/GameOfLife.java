package com.yupi.algorithm.leetcode.math;

/**
 * 功能描述：生命游戏
 * 思路：因为要整体更新，需要记录细胞原来的状态，但又要求原地，因此要遍历2次，用数字表示状态（当前和下一次的状态）
 * 0 死细胞转为死细胞
 * 1 活细胞转为活细胞
 * 2 死细胞转为活细胞
 * 3 活细胞转为死细胞
 */

public class GameOfLife {

    int[][] dir = new int[][]{{-1, -1}, {-1, 0}, {-1, 1}, {0, -1}, {0, 1}, {1, -1}, {1, 0}, {1, 1}};

    public void gameOfLife(int[][] board) {
        int m = board.length;
        if (m == 0) {
            return;
        }
        int n = board[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int live = 0;
                for (int k = 0; k < 8; k++) {
                    int nx = i + dir[k][0];
                    int ny = j + dir[k][1];
                    if (nx >= 0 && nx < m && ny >= 0 && ny < n && (board[nx][ny] & 1) == 1) {
                        live++;
                    }
                }
                if (board[i][j] == 1) {
                    if(live < 2 || live > 3) {
                        board[i][j] = 3;
                    }
                } else {
                    if (live == 3) {
                        board[i][j] = 2;
                    }
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 2) {
                    board[i][j] = 1;
                } else if (board[i][j] == 3) {
                    board[i][j] = 0;
                }
            }
        }
    }

}