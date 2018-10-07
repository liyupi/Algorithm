package com.yupi.algorithm.leetcode.string;

/**
 * 功能描述：字符串找不同
 *
 * @author Yupi Li
 * @date 2018/10/04 09:37
 */

public class FindTheDifference {

    public char findTheDifference(String s, String t) {
        int[] chars = new int[26];
        int sLen = s.length();
        chars[t.charAt(sLen) - 97] = -1;
        for (int i = 0; i < s.length(); i++) {
            chars[s.charAt(i) - 97]++;
            chars[t.charAt(i) - 97]--;
        }
        for (int i = 0; i < 26; i++) {
            if (chars[i] < 0) {
                return (char) (i + 97);
            }
        }
        return ' ';
    }

}