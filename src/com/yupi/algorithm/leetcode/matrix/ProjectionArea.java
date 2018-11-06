package com.yupi.algorithm.leetcode.matrix;

/**
 * 功能描述：三维形体投影面积
 *
 * 思路：sum = 叠加大于0的块数 + 每行的最大值和 + 每列的最大值和
 */

public class ProjectionArea {

    public int projectionArea(int[][] grid) {
        int sum = 0;
        for (int i = 0; i < grid.length; i++) {
            int max = 0;
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] > 0) {
                    sum++;
                }
                max = Math.max(grid[i][j], max);
            }
            sum += max;
        }
        for (int i = 0; i < grid[0].length; i++) {
            int max = 0;
            for (int j = 0; j < grid.length; j++) {
                max = Math.max(grid[i][j], max);
            }
            sum += max;

        }
        return sum;
    }

}