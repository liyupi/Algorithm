package com.yupi.algorithm.leetcode.matrix;

/**
 * 功能描述：范围求和II
 * 思路：本以为是线段树，没想到是水题，因为增加值从0下标开始，因此靠近左上的一定最大，记录x、y坐标最小值的乘积即可
 */

public class RangeSumMaxCount {

    public int maxCount(int m, int n, int[][] ops) {
        if (ops.length == 0 || ops[0].length == 0) {
            return m * n;
        }
        int minX = ops[0][0];
        int minY = ops[0][1];
        for (int i = 1; i < ops.length; i++) {
            minX = Math.min(ops[i][0], minX);
            minY = Math.min(ops[i][1], minY);
        }
        return minX * minY;
    }
}