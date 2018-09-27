package com.yupi.algorithm.leetcode.matrix;

/**
 * 功能描述：螺旋矩阵II
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */

public class GenerateMatrix2 {
    public static void main(String[] args) {
        new GenerateMatrix2().generateMatrix(3);
    }

    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int max = n * n;
        int size = n;
        int flag = 1; // 1右2下3左0上
        int[][] dir = new int[][]{{-1, 0},{0, 1}, {1, 0}, {0, -1}};
        int posX = 0;
        int posY = 0;
        int temp = size;
        for (int i = 1; i <= max; i++) {
            matrix[posX][posY] = i;
            if (--temp == 0) {
                flag = (flag + 1) % 4;
                if (flag == 0 || flag == 2) {
                    size--;
                }
                temp = size;
            }
            posX += dir[flag][0];
            posY += dir[flag][1];
        }
        return matrix;
    }
}