package com.yupi.algorithm.leetcode.dp;

import java.util.ArrayList;
import java.util.List;

/**
 * 功能描述：求某数组的所有子集
 *
 * 思路：动态规划，从长度为1的数组开始，dp[n]即为长度为n的数组的子集
 * 状态转移方程：dp[i] = dp[i-1]的所有元素 + dp[i-1]的每个元素集合加上nums[i]
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */

public class SubSets {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> lastList = new ArrayList<>();
        lastList.add(new ArrayList<>());
        for (int i = 0; i < nums.length; i++) {
            List<List<Integer>> temp = new ArrayList<>(lastList);
            for (List<Integer> list : lastList) {
                List<Integer> subList = new ArrayList<>(list);
                subList.add(nums[i]);
                temp.add(subList);
            }
            lastList = temp;
        }
        return lastList;
    }

}