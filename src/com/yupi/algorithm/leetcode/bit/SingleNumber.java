package com.yupi.algorithm.leetcode.bit;

/**
 * 功能描述：只出现一次的数字
 *
 * 思路：好题！出现三次的数字转化成位后必定每个为1的位出现次数都是3的倍数
 * 因此统计32位中位数出现1次数不为3的倍数的位，加到结果中
 */

public class SingleNumber {

    public int singleNumber(int[] nums) {
        int res = 0;
        for (int i = 0; i < 32; i++) {
            int count = 0;
            int mask = 1 << i;
            for (int j = 0; j < nums.length; j++) {
                if ((mask & nums[j]) != 0) {
                    count++;
                }
            }
            if (count % 3 != 0) {
                res |= mask;
            }
        }
        return res;
    }
}