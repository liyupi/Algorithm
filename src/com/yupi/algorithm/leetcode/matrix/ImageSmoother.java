package com.yupi.algorithm.leetcode.matrix;

/**
 * 功能描述：图片平滑器
 *
 * 思路：对每个点，依次遍历其8个方向的和即可
 *
 */

public class ImageSmoother {

    int[][] dirs = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}, {1, 1}, {1, -1}, {-1, 1}, {-1, -1}};

    public int[][] imageSmoother(int[][] M) {
        int[][] res = new int[M.length][M[0].length];
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                long sum = 0;
                int num = 1;
                for (int[] dir : dirs) {
                    int x = j + dir[1];
                    int y = i + dir[j];
                    if (x >= 0 && x < M[i].length && y >= 0 && y < M.length) {
                        sum += M[x][y];
                        num++;
                    }
                }
                res[i][j] = (int) ((sum + M[i][j]) / num);
            }
        }
        return res;
    }

}