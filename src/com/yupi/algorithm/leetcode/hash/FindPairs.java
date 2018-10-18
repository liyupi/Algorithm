package com.yupi.algorithm.leetcode.hash;

import java.util.HashMap;
import java.util.Map;

/**
 * 功能描述：数组中的K-diff数对
 *
 * 思路：map存储数组中出现的每个元素，然后遍历数组，查找对应的值+K是否存在于map中即可
 * 可将差的绝对值为k简化成差为k（正向反向会重复），记得找到一个元素后将其从map中移除
 * 注意：k=0时，不能和本身成一对，因此须map中存放元素下标，判断是否与当前元素相同
 *
 *
 * @author Yupi Li
 * @date 2018/10/11 09:37
 */

public class FindPairs {

    public int findPairs(int[] nums, int k) {
        if (k < 0) {
            return 0;
        }
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],i);
        }
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i] + k) && map.get(nums[i] + k) != i) {
                count++;
                map.remove(nums[i] + k);
            }
        }
        return count;
    }

}