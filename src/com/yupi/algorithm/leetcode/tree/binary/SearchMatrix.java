package com.yupi.algorithm.leetcode.tree.binary;

import java.util.Arrays;

/**
 * 功能描述：搜索二维矩阵
 *
 * 思路：纵向二分和横向二分结合使用，注意二分时的left和right关系
 */

public class SearchMatrix {

    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        if (m == 0) {
            return false;
        }
        int n = matrix[0].length;
        if (n == 0) {
            return false;
        }
        if (target < matrix[0][0] || target > matrix[m - 1][n - 1]) {
            return false;
        }
        int left = 0;
        int right = matrix.length - 1;
        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (matrix[middle][0] > target) {
                right = middle - 1;
            } else if (matrix[middle][0] < target) {
                left = middle + 1;
            } else {
                return true;
            }
        }
        return Arrays.binarySearch(matrix[left - 1], target) >= 0;
    }
}