package com.yupi.algorithm.leetcode.string;

/**
 * 功能描述：原地算法压缩字符串
 *
 * 思路：水题，注意下出现数大于10要将次数转为字符串存入
 *
 * @author Yupi Li
 * @date 2018/10/11 09:37
 */

public class Compress {


    public int compress(char[] chars) {
        if (chars.length == 0) {
            return 0;
        }
        char posChar = chars[0];
        int pos = 0;
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == posChar) {
                count++;
            } else {
                chars[pos] = posChar;
                if (count > 1) {
                    pos = numToChar(chars, pos, count);
                }
                pos++;
                posChar = chars[i];
                count = 1;
            }
        }
        chars[pos] = posChar;
        if (count > 1) {
            pos = numToChar(chars, pos, count);
        }
        return ++pos;
    }

    private int numToChar(char[] chars, int pos, int num) {
        String str = String.valueOf(num);
        int len = str.length();
        for (int i = 0; i < len; i++) {
            chars[++pos] = str.charAt(i);
        }
        return pos;
    }

}