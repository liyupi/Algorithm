package com.yupi.algorithm.leetcode.hash;

import java.util.HashMap;
import java.util.Map;

/**
 * 功能描述：分糖果
 *
 * 思路：妹妹最多获得糖果总数的一半和糖果类别数的最小值
 *
 * @author Yupi Li
 * @date 2018/10/11 09:37
 */

public class DistributeCandies {

    public int distributeCandies(int[] candies) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < candies.length; i++) {
            if (!map.containsKey(candies[i])) {
                map.put(candies[i],1);
            }
        }
        return Math.min(map.size(),candies.length / 2);
    }

}