package com.yupi.algorithm.leetcode.bit;

/**
 * 功能描述：模拟求和
 *
 * 思路：用^来模拟加法，&来模拟进位
 *
 * @author Yupi Li
 * @date 2018/10/04 09:37
 */

public class GetSumWithoutOperator {

    public int getSum(int a, int b) {
        if (b == 0) {
            return a;
        }
        return getSum(a ^ b, (a & b) << 1);
    }

}