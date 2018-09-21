package com.yupi.algorithm.leetcode.hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 功能描述：根据字符出现频率排序
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */

public class FrequencySort {

    public String frequencySort(String s) {
        int len = s.length();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < len; i++) {
            int c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((o1, o2) -> {
            if (o1.getValue() > o2.getValue()) {
                return -1;
            } else if (o1.getValue().equals(o2.getValue())) {
                return 0;
            } else {
                return 1;
            }
        });
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Integer, Integer> entry : list) {
            int count = entry.getValue();
            for (int i = 0; i < count; i++) {
                sb.append((char)entry.getKey().intValue());
            }
        }
        return sb.toString();
    }
}