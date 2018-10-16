package com.yupi.algorithm.leetcode.math;

/**
 * 功能描述：给定位数的最大回文乘积
 *
 * 思路：n位数的最大回文乘积长度一定为2n，因此可以从n位数最大值（如99开始），遍历构造回文串
 * 再让回文串依次模99到10，由于是从大数遍历，因此当大数与其本身乘积<构造的回文数时，直接跳出循环
 * 注意变量范围开成long
 *
 * @author Yupi Li
 * @date 2018/10/11 09:37
 */

public class LargestPalindrome {

    public int largestPalindrome(int n) {
        if (n == 1) {
            return 9;
        }
        int base = (int)Math.pow(10,n);
        int max = base - 1;
        int min = max / 10 + 1;
        for (long i = max; i >= min; i--) {
            long num = i * base + Long.parseLong(new StringBuilder(String.valueOf(i)).reverse().toString());
            for (long j = max; j * j > num ; j--) {
                if (num % j == 0) {
                    return (int) (num % 1337);
                }
            }
        }
        return 0;
    }

}