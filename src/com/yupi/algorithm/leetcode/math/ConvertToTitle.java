package com.yupi.algorithm.leetcode.math;

/**
 * 功能描述：数字转字母序列
 *
 * 思路：26进制问题
 *
 * @author Yupi Li
 * @date 2018/10/04 09:37
 */

public class ConvertToTitle {

    public String convertToTitle(int n) {
        String res = "";
        while (n != 0) {
            res = (char) ((n - 1) % 26 + 65) + res;
            n = (n - 1) / 26;
        }
        return res;
    }

}