package com.yupi.algorithm.leetcode.array;

import java.util.HashMap;
import java.util.Map;

/**
 * 功能描述：和为某值的子数组
 *
 * 思路：map存储之前的子数组和，利用差得到解（如0-5的和减0-3的和为子数组4-5）
 */

public class NumSubarraysWithSum {

    Map<Integer, Integer> map = new HashMap<>();

    public int numSubarraysWithSum(int[] A, int S) {
        int sum = 0;
        int res = 0;
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
            if (sum >= S) {
                if (sum == S) {
                    res++;
                }
                res += map.getOrDefault(sum - S,0);
            }
            map.put(sum, map.getOrDefault(sum,0) + 1);
        }
        return res;
    }

}