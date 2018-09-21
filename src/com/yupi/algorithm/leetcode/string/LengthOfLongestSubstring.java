package com.yupi.algorithm.leetcode.string;

/**
 * 功能描述：最长不重复字母字串长度
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */

public class LengthOfLongestSubstring {
    // map始终记录每个字母最新出现的位置
    public int lengthOfLongestSubstring(String s) {
        int[] map = new int[256];
        int len = s.length();
        int max = 0;
        int pos = 0;
        for (int i = 0; i < map.length; i++) {
            map[i] = -1;
        }
        for (int i = 0; i < len; i++) {
            int c = s.charAt(i);
            if (map[c] >= pos) {
                int val = i - pos;
                max = max > val ? max : val;
                pos = map[c];
            }
            map[c] = i;
        }
        int val = len - pos;
        return max > val ? max : val;
    }

}