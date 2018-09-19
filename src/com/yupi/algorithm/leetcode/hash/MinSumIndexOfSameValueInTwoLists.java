package com.yupi.algorithm.leetcode.hash;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * 功能描述：两个列表的最小索引总和
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */

public class MinSumIndexOfSameValueInTwoLists {

    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map = new HashMap<>();
        List<String> list = new LinkedList<>();
        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }
        int min = list1.length + list2.length;
        for (int i = 0; i < list2.length; i++) {
            if (map.containsKey(list2[i])) {
                int val = map.get(list2[i]) + i;
                if (val < min) {
                    min = val;
                    list.clear();
                    list.add(list2[i]);
                } else if (val == min) {
                    list.add(list2[i]);
                }
            }
        }
        String[] res = new String[list.size()];
        return list.toArray(res);
    }

}