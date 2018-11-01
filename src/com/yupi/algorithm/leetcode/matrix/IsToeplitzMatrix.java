package com.yupi.algorithm.leetcode.matrix;

/**
 * 功能描述：Toeplitz Matrix
 *
 * 思路：判断每个点是否等于左上角的点即可
 */

public class IsToeplitzMatrix {

    public boolean isToeplitzMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = 0; j < matrix[0].length - 1; j++) {
                if (matrix[i + 1][j + 1] != matrix[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

}