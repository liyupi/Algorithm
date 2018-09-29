package com.yupi.algorithm.leetcode.math;

import java.util.HashMap;
import java.util.Map;

/**
 * 功能描述：求众数
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */

public class MajorityElement {

    // 另一种思路，快排，处于n/2位置的数一定是众数
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int min = nums.length / 2;
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            if (map.get(nums[i]) > min) {
                return nums[i];
            }
        }
        return nums[0];
    }

}