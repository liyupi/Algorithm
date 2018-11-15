package com.yupi.algorithm.leetcode.dfs;

import java.util.ArrayList;
import java.util.List;

/**
 * 功能描述：组合（返回n个数中取k个数的所有可能性）
 * <p>
 * 思路：dfs即可，注意限定for循环的范围
 */

public class CombineOfKNums {

    private List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> combine(int n, int k) {
        dfs(new ArrayList<>(), 1, k, n);
        return res;
    }

    void dfs(List<Integer> list, int pos, int k, int n) {
        if (list.size() == k) {
            res.add(list);
            return;
        }
        int maxPos = n + 1 - k + list.size();
        for (int i = pos; i <= maxPos; i++) {
            List<Integer> nextList = new ArrayList<>(list);
            nextList.add(i);
            dfs(nextList, i + 1, k, n);
        }
    }
}