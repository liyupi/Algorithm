package com.yupi.algorithm.leetcode.math;

/**
 * 功能描述：平方数之和
 *
 * 思路：也可以利用二分，left = 0，right = sqrt(c)，平方和小left++，平方和大right--
 *
 * @author Yupi Li
 * @date 2018/10/11 09:37
 */

public class JudgeSquareSum {

    public boolean judgeSquareSum(int c) {
        int max = (int) Math.sqrt(c / 2);
        for (int i = 0; i <= max; i++) {
            double val = Math.sqrt(c - i * i);
            if (val == (int) val) {
                return true;
            }
        }
        return false;
    }
}