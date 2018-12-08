package com.yupi.algorithm.leetcode.bit;

/**
 * 功能描述：最大单词长度乘积
 * 思路：利用26位长度的数来记录每个单词某个字母是否出现
 * 这样只需要让两个数与（判断是否为0）即可得到是否有重复的字母
 */

public class MaxProduct {

    public int maxProduct(String[] words) {
        if (words.length < 2) {
            return 0;
        }
        long[] wordArray = new long[words.length];
        for (int i = 0; i < words.length; i++) {
            wordArray[i] = getLong(words[i]);
        }
        int max = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if ((wordArray[i] & wordArray[j]) == 0) {
                    max = Math.max(words[i].length() * words[j].length(), max);
                }
            }
        }
        return max;
    }

    private long getLong(String str) {
        int len = str.length();
        long num = 0;
        for (int i = 0; i < len; i++) {
            int c = str.charAt(i) - 97;
            num |= 1 << c;
        }
        return num;
    }
}