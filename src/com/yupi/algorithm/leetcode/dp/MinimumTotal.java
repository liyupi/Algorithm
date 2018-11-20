package com.yupi.algorithm.leetcode.dp;

import java.util.List;

/**
 * 功能描述：三角形最小路径和
 * <p>
 * 思路：传统dp比较low
 * 这里可以只使用o(n)空间复杂度，直接用一个数组记录到当前层次每个点的最小距离
 * 最后遍历当前层次最小距离数组找最小值即可
 */

public class MinimumTotal {

/*  传统dp做法
    public int minimumTotal(List<List<Integer>> triangle) {
        if (triangle == null || triangle.size() == 0) {
            return 0;
        }
        int[][] dp = new int[triangle.size() + 1][triangle.size() + 1];

        for (int i = triangle.size() - 1; i >= 0; i--) {
            for (int j = triangle.get(i).size() - 1; j >= 0; j--) {
                dp[i][j] = triangle.get(i).get(j) + Math.min(dp[i + 1][j + 1], dp[i + 1][j]);
            }
        }
        return dp[0][0];
    }*/

    // o(n)空间做法
    public int minimumTotal(List<List<Integer>> triangle) {
        if (triangle == null || triangle.size() == 0) {
            return 0;
        }
        int m = triangle.size();
        int n = triangle.get(m - 1).size();
        int[] num = new int[n];
        num[0] = triangle.get(0).get(0);
        for (int i = 1; i < m; i++) {
            int size = triangle.get(i).size();
            num[size - 1] = num[size - 2] + triangle.get(i).get(size - 1);
            for (int j = size - 2; j > 0; j--) {
                num[j] = Math.min(num[j], num[j - 1]) + triangle.get(i).get(j);
            }
            num[0] += triangle.get(i).get(0);
        }
        int min = num[0];
        for (int i = 0; i < num.length; i++) {
            min = Math.min(num[i], min);
        }
        return min;
    }
}