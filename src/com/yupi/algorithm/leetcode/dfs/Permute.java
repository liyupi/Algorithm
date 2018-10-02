package com.yupi.algorithm.leetcode.dfs;

import java.util.ArrayList;
import java.util.List;

/**
 * 功能描述：全排列
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */

public class Permute {


    private List<List<Integer>> resList = new ArrayList<>();
    private boolean[] visited;

    void dfs(List<Integer> list, int[] nums) {
        if (list.size() == nums.length) {
            resList.add(list);
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (visited[i]) {
                continue;
            }
            visited[i] = true;
            List<Integer> temp = new ArrayList<>(list);
            temp.add(nums[i]);
            dfs(temp, nums);
            visited[i] = false;
        }

    }


    public List<List<Integer>> permute(int[] nums) {
        visited = new boolean[nums.length];
        List<Integer> list = new ArrayList<>();
        dfs(list, nums);
        return resList;
    }
}