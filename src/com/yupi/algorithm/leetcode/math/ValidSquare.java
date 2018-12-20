package com.yupi.algorithm.leetcode.math;

/**
 * 功能描述：有效的正方形
 * 思路：以某一个点为基准，判断其与其他点的最长连线的平方是否为另两条线的平方和，找到了对角线。
 * 再判断剩余边的值是否相等。
 */

public class ValidSquare {

    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        int[] edges = new int[3];
        edges[0] = getLength(p1, p2);
        edges[1] = getLength(p1, p3);
        edges[2] = getLength(p1, p4);
        if (edges[0] == 0 || edges[1] == 0 || edges[2] == 0) {
            return false;
        }
        if (edges[0] == edges[1] && (edges[0] + edges[1] == edges[2])) {
            int a = getLength(p2, p4);
            int b = getLength(p3, p4);
            return a == b && a == edges[0];
        }
        if (edges[0] == edges[2] && (edges[0] + edges[2] == edges[1])) {
            int a = getLength(p2, p3);
            int b = getLength(p4, p3);
            return a == b && a == edges[0];
        }
        if (edges[1] == edges[2] && (edges[1] + edges[2] == edges[0])) {
            int a = getLength(p3, p2);
            int b = getLength(p4, p2);
            return a == b && a == edges[1];
        }
        return false;
    }

    int getLength(int[] p1, int[] p2) {
        return (p1[0] - p2[0]) * (p1[0] - p2[0]) + (p1[1] - p2[1]) * (p1[1] - p2[1]);
    }

}