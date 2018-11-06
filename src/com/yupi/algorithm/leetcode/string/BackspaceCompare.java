package com.yupi.algorithm.leetcode.string;

/**
 * 功能描述：比较含退格的字符串
 *
 * 思路：比较压缩后的字符串是否相等即可
 */

public class BackspaceCompare {

    public boolean backspaceCompare(String S, String T) {
        return compress(S).equals(compress(T));
    }

    String compress(String s) {
        int delete = 0;
        int pos = s.length() - 1;
        String res = "";
        while (pos >= 0) {
            if (s.charAt(pos) != '#' && delete == 0) {
                res = s.charAt(pos) + res;
            } else if (s.charAt(pos) == '#') {
                delete++;
            } else {
                delete--;
            }
            pos--;
        }
        return res;
    }
}