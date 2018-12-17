package com.yupi.algorithm.leetcode.math;

/**
 * 功能描述：计算各个位数不同的数字个数
 * 思路：排列组合问题，由于n范围只有10，可使用打表法提高效率
 */

public class CountNumbersWithUniqueDigits {

/*  排列组合
    public int countNumbersWithUniqueDigits(int n) {
        if (n == 0) {
            return 1;
        }
        // 最多10位
        if (n > 10) {
            n = 10;
        }
        // 第一位为0的10种情况
        int res = 10;
        // 排除第一位为0的情况（已记录在结果中），初试因子为10-1=9
        // i位数的情况数
        int factor = 9;
        for (int i = 1; i < n; i++) {
            factor *= (10 - i);
            res += factor;
        }
        return res;
    }*/

    public int countNumbersWithUniqueDigits(int n) {
        int[] res = new int[]{1, 10, 91, 739, 5275, 32491, 168571, 712891, 2345851, 5611771, 8877681};
        if (n > 10) {
            n = 10;
        }
        return res[n];
    }

}