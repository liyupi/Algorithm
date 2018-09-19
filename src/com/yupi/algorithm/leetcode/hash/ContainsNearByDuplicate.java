package com.yupi.algorithm.leetcode.hash;

import java.util.HashMap;
import java.util.Map;

/**
 * 功能描述：数组中是否存在二者距离小于k的重复元素
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */

public class ContainsNearByDuplicate {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                if (Math.abs(map.get(nums[i]) - i) <= k) {
                    return true;
                }
            }
            map.put(nums[i],i);
        }
        return false;
    }

}