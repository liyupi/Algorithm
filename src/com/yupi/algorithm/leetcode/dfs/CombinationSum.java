package com.yupi.algorithm.leetcode.dfs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 功能描述：组数总和
 *
 * 思路：dfs用于遍历所有可能解
 */

public class CombinationSum {

    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        dfs(candidates, 0, target, new ArrayList<>());
        return res;
    }

    private void dfs(int[] candidates,int pos, int target, List<Integer> list) {
        if (target == 0) {
            res.add(list);
        }
        for (int i = pos; i < candidates.length; i++) {
            if (candidates[i] <= target) {
                List<Integer> subList = new ArrayList<>(list);
                subList.add(candidates[i]);
                dfs(candidates, i,target - candidates[i], subList);
            }
            if (candidates[i] > target){
                break;
            }
        }
    }


}