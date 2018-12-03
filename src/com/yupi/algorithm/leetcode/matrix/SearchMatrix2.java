package com.yupi.algorithm.leetcode.matrix;

/**
 * 功能描述：搜索二维矩阵II
 * 思路：十分巧妙，每次判断左下角的值，然后可排除一行或一列
 */

public class SearchMatrix2 {

    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int x = matrix.length - 1;
        int y = 0;
        while (x >= 0 && y < matrix[0].length) {
            if (matrix[x][y] > target) {
                x--;
            } else if (matrix[x][y] < target) {
                y++;
            } else {
                return true;
            }
        }
        return false;
    }


}