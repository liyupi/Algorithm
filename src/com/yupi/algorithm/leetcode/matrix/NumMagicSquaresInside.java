package com.yupi.algorithm.leetcode.matrix;

import java.util.HashSet;
import java.util.Set;

/**
 * 功能描述：矩阵中的幻方
 *
 * 思路：如果中间的数不为5，则必定不是幻方
 */

public class NumMagicSquaresInside {

    public int numMagicSquaresInside(int[][] grid) {
        int sum = 0;
        for (int i = 2; i < grid.length; i++) {
            for (int j = 2; j < grid[0].length; j++) {
                if (isMagicSquare(grid,i,j)) {
                    sum++;
                }
            }
        }
        return sum;
    }

    private boolean isMagicSquare(int[][] grid, int i, int j) {
        Set<Integer> set = new HashSet<>();
        for (int k = i - 2; k <= i; k++) {
            for (int l = j - 2; l <= j; l++) {
                if (grid[k][l] > 9 || grid[k][l] < 1) {
                    return false;
                }
                set.add(grid[k][l]);
            }
        }
        if (set.size() != 9) {
            return false;
        }
        if (grid[i - 1][j - 1] != 5) {
            return false;
        }
        if (grid[i - 2][j - 2] + grid[i - 2][j - 1] + grid[i - 2][j] != 15) {
            return false;
        }
        if (grid[i - 1][j - 2] + grid[i - 1][j] != 10) {
            return false;
        }
        if (grid[i][j - 2] + grid[i][j - 1] + grid[i][j] != 15) {
            return false;
        }
        if (grid[i][j] + grid[i - 1][j] + grid[i - 2][j] != 15) {
            return false;
        }
        if (grid[i - 2][j - 1] + grid[i][j - 1] != 10) {
            return false;
        }
        if (grid[i][j - 2] + grid[i - 1][j - 2] + grid[i - 2][j - 2] != 15) {
            return false;
        }
        if (grid[i][j] + grid[i - 2][j - 2] != 10) {
            return false;
        }
        if (grid[i][j - 2] + grid[i - 2][j] != 10) {
            return false;
        }
        return true;
    }

}