package com.yupi.algorithm.leetcode.string;

/**
 * 功能描述：字符串中的单词数
 *
 * 思路：水题，但是注意此处的单词指只被空格分隔的单词
 *
 * @author Yupi Li
 * @date 2018/10/04 09:37
 */

public class CountSegments {

    boolean isSpace(char c) {
        return c == 32;
    }

    public int countSegments(String s) {
        int count = 0;
        int len = s.length();
        boolean word = false;
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            boolean isSpace = isSpace(c);
            if (!word && !isSpace) {
                word = true;
                count++;
                continue;
            }
            if (word && isSpace) {
                word = false;
            }
        }
        return count;
    }
}