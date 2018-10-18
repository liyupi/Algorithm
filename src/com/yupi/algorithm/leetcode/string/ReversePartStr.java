package com.yupi.algorithm.leetcode.string;

/**
 * 功能描述：字符串部分反转（水题）
 *
 * @author Yupi Li
 * @date 2018/10/11 09:37
 */

public class ReversePartStr {

    public String reverseStr(String s, int k) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i += 2 * k) {
            reverseChars(chars, i, i + k - 1);
        }
        return String.valueOf(chars);
    }


    private void reverseChars(char[] chars, int start, int end) {
        if (end >= chars.length) {
            end = chars.length - 1;
        }
        while (start < end) {
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }
    }

}