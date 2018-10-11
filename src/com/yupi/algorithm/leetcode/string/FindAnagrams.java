package com.yupi.algorithm.leetcode.string;

import java.util.ArrayList;
import java.util.List;

/**
 * 功能描述：找到字符串中所有字母异位词
 *
 * 思路：滑窗法，时间复杂度o(n)
 * 使用一个count变量统计当前子串在模式串中剩余的字母数，为0表示匹配
 * 若窗口长度大于模式串长度，须剔除最左字符
 * 使用map来统计字符剩余出现次数
 * 若当前字符仍须匹配，则count-1
 * 若剔除的字符>=0（模式串中出现过，否则为负数），则count+1
 *
 * @author Yupi Li
 * @date 2018/10/04 09:37
 */

public class FindAnagrams {


    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        int[] chars = new int[26];
        int pLen = p.length();
        int count = pLen;
        for (int i = 0; i < count; i++) {
            chars[p.charAt(i) - 97]++;
        }
        int len = s.length();
        for (int i = 0; i < len; i++) {
            int c = s.charAt(i) - 97;
            if (chars[c] >= 1) {
                count--;
            }
            chars[c]--;
            if (i >= pLen) {
                int lastc = s.charAt(i - pLen) - 97;
                if (chars[lastc] >= 0) {
                    count++;
                }
                chars[lastc]++;
            }
            if (count == 0) {
                list.add(i  - pLen + 1);
            }
        }
        return list;
    }
}