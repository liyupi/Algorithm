package com.yupi.algorithm.leetcode.graph;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * 功能描述：最小高度树
 * 思路：类似剥洋葱，先找到所有叶子节点，将他们从相邻节点的邻接列表中删除
 * 再判断相邻节点是否为叶子节点（邻接列表大小为1），反复执行
 * 注意n=1是特殊值
 * https://www.cnblogs.com/grandyang/p/5000291.html
 */

public class FindMinHeightTrees {


    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        List<Integer> res = new ArrayList<>();
        if (n == 0) {
            return res;
        }
        if (n == 1) {
            res.add(0);
            return res;
        }
        List<HashSet<Integer>> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(new HashSet<>());
        }
        for (int[] edge : edges) {
            list.get(edge[0]).add(edge[1]);
            list.get(edge[1]).add(edge[0]);
        }
        for (int i = 0; i < n; i++) {
            if (list.get(i).size() == 1) {
                res.add(i);
            }
        }
        while (n > 2) {
            n -= res.size();
            List<Integer> tmp = new ArrayList<>();
            for (int num : res) {
                int next = list.get(num).iterator().next();
                list.get(next).remove(num);
                if (list.get(next).size() == 1) {
                    tmp.add(next);
                }
            }
            res = tmp;
        }
        return res;
    }

}