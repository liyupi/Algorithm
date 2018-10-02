package com.yupi.algorithm.leetcode.dfs;

import java.util.ArrayList;
import java.util.List;

/**
 * 功能描述：子集
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */

public class SubSets {


    private List<List<Integer>> resList = new ArrayList<>();

    private void dfs(int num, int[] nums, List<Integer> temp) {
        if (num >= nums.length) {
            return;
        }
        List<Integer> list = new ArrayList<>(temp);
        // 该元素是否加入集合
        list.add(nums[num]);
        resList.add(list);
        dfs(num + 1, nums, temp);
        dfs(num + 1, nums, list);
    }

    public List<List<Integer>> subsets(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            List<Integer> subList = new ArrayList<>();
            subList.add(nums[i]);
            resList.add(subList);
            dfs(i + 1, nums, subList);
        }
        resList.add(new ArrayList<>());
        return resList;
    }
}