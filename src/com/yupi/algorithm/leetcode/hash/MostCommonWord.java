package com.yupi.algorithm.leetcode.hash;

import java.util.HashMap;
import java.util.Map;

/**
 * 功能描述：最常见的单词
 * <p>
 * 思路：map
 */
public class MostCommonWord {

    public String mostCommonWord(String paragraph, String[] banned) {
        Map<String, Integer> map = new HashMap<>();
        String[] strings = paragraph.split("[!?',; .]");
        for (String s : banned) {
            map.put(s, -1);
        }
        int max = 0;
        String res = "";
        for (String string : strings) {
            string = string.toLowerCase();
            if (string.length() == 0 || map.getOrDefault(string, 0) == -1) {
                continue;
            }
            map.put(string, map.getOrDefault(string, 0) + 1);
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                res = entry.getKey();
            }
        }
        return res;
    }
}
