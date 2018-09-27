package com.yupi.algorithm.leetcode.string;

import java.util.Arrays;

/**
 * 功能描述：大数乘法（按位乘即可）
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */

public class BigIntegerMultiply {
    private static String multiply(String num1, String num2) {
        if ("0".equals(num1) || "0".equals(num2)) {
            return "0";
        }
        int len1 = num1.length();
        int len2 = num2.length();
        char[] chars = new char[len1 + len2];
        Arrays.fill(chars, '0');
        for (int i = len1 - 1; i >= 0; i--) {
            int add = 0;
            for (int j = len2 - 1; j >= 0; j--) {
                int n1 = num1.charAt(i) - 48;
                int n2 = num2.charAt(j) - 48;
                int pos = i + j + 1;
                int sum = n1 * n2 + chars[pos] - 48 + add;
                add = sum / 10;
                int val = sum % 10;
                chars[pos] = (char) (val + 48);
            }
            if (add > 0) {
                chars[i] = (char) (add + 48);
            }
        }
        int i = 0;
        String res = String.valueOf(chars);
        for (; i < chars.length; i++) {
            if (chars[i] != '0') {
                break;
            }
        }
        return res.substring(i);
    }

    public static void main(String[] args) {
        System.out.println(multiply("456", "123"));
    }
}