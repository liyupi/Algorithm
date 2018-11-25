package com.yupi.algorithm.leetcode.hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 功能描述：最短完整词
 * <p>
 * 思路：map的运用
 */

public class ShortestCompletingWord {

    String shortestCompletingWord(String licensePlate, String[] words) {
        int min = Integer.MAX_VALUE;
        int minPos = 0;
        List<Map<Integer, Integer>> list = new ArrayList<>();
        for (String word : words) {
            int tempLen = word.length();
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < tempLen; i++) {
                char c = word.charAt(i);
                if (c >= 97 && c <= 122) {
                    c -= 32;
                }
                if (c >= 65 && c <= 90) {
                    map.put((int) c, map.getOrDefault((int)c, 0) + 1);
                }
            }
            list.add(map);
        }
        int len = licensePlate.length();
        for (int i = 0; i < list.size(); i++) {
            Map<Integer, Integer> temp = list.get(i);
            boolean flag = true;
            for (int j = 0; j < len; j++) {
                char c = licensePlate.charAt(j);
                if (c >= 97 && c <= 122) {
                    c -= 32;
                }
                if (c >= 65 && c <= 97) {
                    if (temp.getOrDefault((int) c, 0) > 0) {
                        temp.put((int) c, temp.get((int) c) - 1);
                    } else {
                        flag = false;
                        break;
                    }
                }
            }
            if (flag && words[i].length() < min) {
                minPos = i;
                min = words[i].length();
            }
        }
        return words[minPos];
    }
}