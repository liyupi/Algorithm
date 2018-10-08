package com.yupi.algorithm.leetcode.math;

/**
 * 功能描述：第N个数字
 *
 * 思路：先找大范围，再找对应小范围的哪个数，对应该数第几位
 * 1-9 共占位9
 * 10-99 共占位180
 * 100-999 共占位2700
 * ...
 *
 * @author Yupi Li
 * @date 2018/10/04 09:37
 */

public class FindNthDigit {


    public int findNthDigit(int n) {
        int len = 1;
        long base = 9;
        while (true) {
            long val = len * base;
            if (n <= val) {
                break;
            }
            len++;
            base *= 10;
            n -= val;
        }
        long temp = base / 9;
        long num = (n - 1) / len + temp;
        int pos = (n - 1) % len + 1;
        while (true) {
            long singlePos = num / temp;
            if (--pos == 0) {
                return (int)singlePos;
            }
            num %= temp;
            temp /= 10;
        }
    }

}