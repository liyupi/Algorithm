package com.yupi.algorithm.leetcode.string;

/**
 * 功能描述：字符串相加
 *
 * 思路：位数不足时按0算即可，能够简化代码
 *
 * @author Yupi Li
 * @date 2018/10/04 09:37
 */

public class AddStrings {

    public String addStrings(String num1, String num2) {
        int pos1 = num1.length() - 1;
        int pos2 = num2.length() - 1;
        StringBuilder builder = new StringBuilder();
        int carry = 0;
        while (pos1 >= 0 || pos2 >= 0) {
            int x = pos1 >= 0 ? num1.charAt(pos1--) - '0' : 0;
            int y = pos2 >= 0 ? num2.charAt(pos2--) - '0' : 0;
            int sum = x + y + carry;
            builder.append(sum % 10);
            carry = sum / 10;
        }
        if (carry == 1) {
            builder.append(1);
        }
        return builder.reverse().toString();
    }


}