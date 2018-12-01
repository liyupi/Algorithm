package com.yupi.algorithm.leetcode.dfs;

import java.util.ArrayList;
import java.util.List;

/**
 * 功能描述：组数总和
 * 思路：dfs
 */

public class CombinationSum3 {

    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> combinationSum3(int k, int n) {
        dfs(k, n, 0, new ArrayList<>());
        return res;
    }

    private void dfs(int k, int n, int pos, List<Integer> list) {
        if (k == 1) {
            if (n > pos && n <= 9) {
                list.add(n);
                res.add(new ArrayList<>(list));
                list.remove(list.size() - 1);
            }
            return;
        }
        for (int i = pos + 1; i <= 9; i++) {
            if (n - i <= 0) {
                break;
            }
            list.add(i);
            dfs(k - 1, n - i, i, list);
            list.remove(list.size() - 1);
        }
    }

}