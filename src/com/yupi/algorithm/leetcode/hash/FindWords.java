package com.yupi.algorithm.leetcode.hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 功能描述：键盘行
 *
 * 思路：用map存储每个字母所在的行，然后循环判断即可
 *
 * @author Yupi Li
 * @date 2018/10/11 09:37
 */

public class FindWords {

    public String[] findWords(String[] words) {
        Map<Character, Integer> map = new HashMap<>();
        String[] keys = new String[]{"QWERTYUIOP", "ASDFGHJKL", "ZXCVBNM"};
        for (int i = 0; i < keys.length; i++) {
            char[] chars = keys[i].toCharArray();
            for (int j = 0; j < chars.length; j++) {
                map.put(chars[j], i);
            }
        }
        List<String> res = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            char[] chars = words[i].toUpperCase().toCharArray();
            int index = map.get(chars[0]);
            int j = 0;
            for (; j < chars.length; j++) {
                if (map.get(chars[j]) != index) {
                    break;
                }
            }
            if (j == chars.length) {
                res.add(words[i]);
            }
        }
        return res.toArray(new String[0]);
    }

}