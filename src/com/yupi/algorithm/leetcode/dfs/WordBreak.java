package com.yupi.algorithm.leetcode.dfs;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 功能描述：单词拆分
 * <p>
 * 思路：为防止重复运算，用一个数组记录以i开头的子串是否能被拆分
 */

public class WordBreak {

    private int[] canBreak;

    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> set = new HashSet<>(wordDict);
        canBreak = new int[s.length() + 1];
        return wordBreak(s, 0, set);
    }

    private boolean wordBreak(String s, int start, Set<String> wordDict) {
        int len = s.length();
        if (start == len) {
            return true;
        }
        boolean flag = false;
        for (int i = start; i < len; i++) {
            String str = s.substring(start, i + 1);
            if (wordDict.contains(str)) {
                if (canBreak[i + 1] == 1) {
                    flag = true;
                    break;
                }
                if (canBreak[i + 1] == 2) {
                    continue;
                }
                if (wordBreak(s, i + 1, wordDict)) {
                    flag = true;
                    break;
                }
            }
        }
        canBreak[start] = flag ? 1 : 2;
        return flag;
    }
}