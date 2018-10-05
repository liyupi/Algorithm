package com.yupi.algorithm.leetcode.math;

/**
 * 功能描述：计数质数（埃式筛法）
 *
 * @author Yupi Li
 * @date 2018/10/04 09:37
 */

public class CountPrimes {


    public int countPrimes(int n) {
        boolean[] notPrime = new boolean[n + 1];
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (!notPrime[i]) {
                count++;
                for (int j = 2; ; j++) {
                    int num = i * j;
                    if (num > n) {
                        break;
                    }
                    notPrime[i * j] = true;
                }
            }
        }
        return count;
    }
    
}