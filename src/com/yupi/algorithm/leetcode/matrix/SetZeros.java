package com.yupi.algorithm.leetcode.matrix;

/**
 * 功能描述：矩阵置零
 * <p>
 * 思路：题目要求使用常数空间，原地交换。因此我们只能利用原数组的空间
 * 可以用首行首列存储某一行某一列是否为0（本来首行或首列也要赋值为0）
 * 注意一种情况：首行/首列本来没0，但是置换后出现了0，会错误，因此需要两个条件判断首行首列原本是否包含0
 */

public class SetZeros {

    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        if (m == 0) {
            return;
        }
        int n = matrix[0].length;
        if (n == 0) {
            return;
        }
        boolean firstRowZero = false;
        boolean firstColZero = false;
        // 第一次扫描
        // 判断首列有没有0
        for (int i = 0; i < m; i++) {
            if (matrix[i][0] == 0) {
                firstColZero = true;
            }
        }
        // 判断首行有没有0
        for (int i = 0; i < n; i++) {
            if (matrix[0][i] == 0) {
                firstRowZero = true;
            }
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] == 0) {
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }
        // 第二次扫描
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[0][j] == 0 || matrix[i][0] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }
        // 如果首行有0，赋值为0
        if (firstRowZero) {
            for (int i = 0; i < n; i++) {
                matrix[0][i] = 0;
            }
        }
        // 如果首列有0，赋值为0
        if (firstColZero) {
            for (int i = 0; i < m; i++) {
                matrix[i][0] = 0;
            }
        }
    }

}