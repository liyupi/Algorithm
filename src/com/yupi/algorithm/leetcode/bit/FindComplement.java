package com.yupi.algorithm.leetcode.bit;

/**
 * 功能描述：求补数
 *
 * 思路：位运算取反，屏蔽高位
 *
 * @author Yupi Li
 * @date 2018/10/11 09:37
 */

public class FindComplement {

    public int findComplement(int num) {
        return ~num & (Integer.highestOneBit(num) - 1);
    }
}