package com.yupi.algorithm.leetcode.math;

/**
 * 功能描述：转换为7进制
 *
 * @author Yupi Li
 * @date 2018/10/11 09:37
 */

public class ConvertToBase7 {

    public String convertToBase7(int num) {
        if (num == 0) {
            return "0";
        }
        StringBuilder builder = new StringBuilder();
        boolean negative = false;
        if (num < 0) {
            negative = true;
            num = -num;
        }
        while (num != 0) {
            int pos = num % 7;
            builder.insert(0, pos);
            num /= 7;
        }
        if (negative) {
            builder.insert(0, '-');
        }
        return builder.toString();
    }

}