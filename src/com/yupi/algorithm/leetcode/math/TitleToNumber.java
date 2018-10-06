package com.yupi.algorithm.leetcode.math;

/**
 * 功能描述：字母序列转数字
 *
 * 思路：26进制问题
 *
 * @author Yupi Li
 * @date 2018/10/04 09:37
 */

public class TitleToNumber {

    public int titleToNumber(String s) {
        int sum = 0;
        int len = s.length();
        for (int i = 0; i < len; i++) {
            int num = (int) s.charAt(i) - 64;
            sum = sum * 26 + num;
        }
        return sum;
    }

}