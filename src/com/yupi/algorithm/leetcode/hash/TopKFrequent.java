package com.yupi.algorithm.leetcode.hash;

import java.util.*;

/**
 * 功能描述：频率最高的k个数
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */

public class TopKFrequent {
    // 更高效的做法，先求出第k高的频率是多少次，然后遍历频率数组，频率大于它的键加入到list中
    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, (o1, o2) -> {
            if (o1.getValue() > o2.getValue()) {
                return -1;
            } else if (o1.getValue().equals(o2.getValue())) {
                return 0;
            } else {
                return 1;
            }
        });
        List<Integer> resList = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            resList.add(list.get(i).getKey());
        }
        return resList;
    }
}