package com.yupi.algorithm.leetcode.hash;

import java.util.HashMap;
import java.util.Map;

/**
 * 功能描述：最长和谐子序列
 *
 * 思路：将出现次数记录在map中，依次遍历数组中每个元素及其+1的元素出现的次数和，用max记录最大值
 * 另一种思路是快排
 *
 * @author Yupi Li
 * @date 2018/10/11 09:37
 */

public class FindLHS {

    public int findLHS(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            int times = map.get(nums[i]);
            if (map.containsKey(nums[i] + 1)) {
                max = Math.max(map.get(nums[i] + 1) + times, max);
            }
        }
        return max;
    }

}