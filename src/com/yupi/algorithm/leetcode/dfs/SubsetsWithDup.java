package com.yupi.algorithm.leetcode.dfs;

import java.util.*;

/**
 * 功能描述：子集
 * <p>
 * 思路：dfs，用set记录元素以去重，注意1, 4, 4与4, 4, 1算重复，因此要先排序
 */

public class SubsetsWithDup {

    private List<List<Integer>> res = new ArrayList<>();


    public List<List<Integer>> subsetsWithDup(int[] nums) {
        res.add(new ArrayList<>());
        Arrays.sort(nums);
        dfs(nums, new ArrayList<>(), 0);
        return res;
    }

    void dfs(int[] nums, List<Integer> list, int pos) {
        if (pos == nums.length) {
            return;
        }
        Set<Integer> set = new HashSet<>();
        for (int i = pos; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                continue;
            }
            set.add(nums[i]);
            List<Integer> next = new ArrayList<>(list);
            next.add(nums[i]);
            res.add(next);
            dfs(nums, next, i + 1);
        }
    }

}