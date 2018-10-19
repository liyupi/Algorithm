package com.yupi.algorithm.leetcode.matrix;

/**
 * 功能描述：矩阵重塑
 *
 * @author Yupi Li
 * @date 2018/10/11 09:37
 */

public class MatrixReshape {

    public int[][] matrixReshape(int[][] nums, int r, int c) {
        if (nums.length == 0) {
            return nums;
        }
        int total = r * c;
        if (total != nums.length * nums[0].length) {
            return nums;
        }
        int[][] res = new int[r][c];
        for (int i = 0; i < total; i++) {
            res[i / c][i % c] = nums[i / nums[0].length][i % nums[0].length];
        }
        return res;
    }

}