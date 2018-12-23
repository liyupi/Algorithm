package com.yupi.algorithm.leetcode.dp;

/**
 * 功能描述：超级丑数
 * 思路：和第n个丑数原理一致，用indices数组记录每个因子当前应乘的丑数位置，每轮比较最小
 * LeetCode 313
 */

public class NthSuperUglyNumber {

    public int nthSuperUglyNumber(int n, int[] primes) {
        int[] indices = new int[primes.length];
        int[] res = new int[n];
        res[0] = 1;
        for (int i = 1; i < n; i++) {
            int[] temp = new int[primes.length];
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < primes.length; j++) {
                temp[j] = res[indices[j]] * primes[j];
                if (temp[j] < min) {
                    min = temp[j];
                }
            }
            for (int j = 0; j < primes.length; j++) {
                if (temp[j] == min) {
                    indices[j]++;
                }
            }
            res[i] = min;
        }
        return res[n - 1];
    }

}