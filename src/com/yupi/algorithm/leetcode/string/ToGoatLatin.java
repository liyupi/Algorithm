package com.yupi.algorithm.leetcode.string;

/**
 * 功能描述：Goal Latin
 *
 * 思路：简单的字符串分割处理
 */

public class ToGoatLatin {

    public String toGoatLatin(String S) {
        String[] strings = S.split(" ");
        StringBuilder builder = new StringBuilder("a");
        StringBuilder resBuilder = new StringBuilder();
        String vowel = "aeiouAEIOU";
        for (String string : strings) {
            char c = string.charAt(0);
            if (vowel.indexOf(c) > -1) {
                string += "ma";
            } else {
                string = string.substring(1) + string.charAt(0) + "ma";
            }
            resBuilder.append(string + builder.toString() + " ");
            builder.append("a");
        }
        return resBuilder.substring(0, resBuilder.length() - 1).toString();
    }
}