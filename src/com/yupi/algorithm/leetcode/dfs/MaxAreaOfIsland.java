package com.yupi.algorithm.leetcode.dfs;

/**
 * 功能描述：最大面积
 *
 * 思路：dfs即可
 *
 */

public class MaxAreaOfIsland {

    private int[][] dir = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    int dfs(int[][] grid, int x, int y) {
        grid[x][y] = 0;
        int sum = 1;
        for (int i = 0; i < dir.length; i++) {
            int nextX = x + dir[i][0];
            int nextY = y + dir[i][1];
            if (nextX >= 0 && nextX < grid.length
                    && nextY >= 0 && nextY < grid[0].length
                    && grid[nextX][nextY] == 1) {
                sum += dfs(grid, nextX, nextY);
            }
        }
        return sum;
    }

    public int maxAreaOfIsland(int[][] grid) {
        int max = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    max = Math.max(dfs(grid,i,j), max);
                }
            }
        }
        return max;
    }

}