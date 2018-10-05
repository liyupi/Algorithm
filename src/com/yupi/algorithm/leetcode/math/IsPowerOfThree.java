package com.yupi.algorithm.leetcode.math;

/**
 * 功能描述：是否为3的幂
 *
 * 思路：不用循环和递归，判断该数的以3为底的对数是否为整数即可
 *
 * @author Yupi Li
 * @date 2018/10/04 09:37
 */

public class IsPowerOfThree {


    public boolean isPowerOfThree(int n) {
        double res = Math.log10(n) / Math.log10(3);
        return (int) res == res;
    }

}