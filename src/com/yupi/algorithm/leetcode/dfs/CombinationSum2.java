package com.yupi.algorithm.leetcode.dfs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 功能描述：组合数2
 *
 * 思路：和组合数1一样dfs，但是判断条件加了i>pos且等于上一个元素时，直接跳过
 */

public class CombinationSum2 {

    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
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
                if (i > pos && candidates[i] == candidates[i - 1]) {
                    continue;
                }
                List<Integer> subList = new ArrayList<>(list);
                subList.add(candidates[i]);
                dfs(candidates, i + 1,target - candidates[i], subList);
            }
            if (candidates[i] > target){
                break;
            }
        }
    }


}