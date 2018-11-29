package com.yupi.algorithm.leetcode.dp;

/**
 * 功能描述：最大正方形
 * 思路：dp，dp[i][j] = Math.min(dp[i - 1][j], dp[i - 1][j - 1], dp[i][j - 1]) + dp[i][j] == 1 ? 1 : 0;
 * 注意首行首列要单独遍历
 */

public class MaximalSquare {

    public int maximalSquare(char[][] matrix) {
        if(matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }
        int max = 48;
        for (int i = 0; i < matrix.length; i++) {
            max = Math.max(matrix[i][0], max);
        }
        for (int i = 0; i < matrix[0].length; i++) {
            max = Math.max(matrix[0][i], max);
        }
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[i].length; j++) {
                if (matrix[i][j] == '0') {
                    continue;
                }
                matrix[i][j] = (char) (Math.min(Math.min(matrix[i - 1][j - 1], matrix[i - 1][j]), matrix[i][j - 1]) + 1);
                max = Math.max(max, matrix[i][j]);
            }
        }
        return (max - 48) * (max - 48);
    }
}