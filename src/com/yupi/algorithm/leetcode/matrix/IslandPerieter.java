package com.yupi.algorithm.leetcode.matrix;

/**
 * 功能描述：岛屿的周长
 *
 * @author Yupi Li
 * @date 2018/10/11 09:37
 */

public class IslandPerieter {

    public int islandPerimeter(int[][] grid) {
        int res = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    res += 4;
                    if (i > 0 && grid[i-1][j] == 1) {
                        res-=2;
                    }
                    if (j > 0 && grid[i][j-1] == 1) {
                        res-=2;
                    }
                }
            }
        }
        return res;
    }
}