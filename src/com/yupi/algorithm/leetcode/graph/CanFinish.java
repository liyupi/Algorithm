package com.yupi.algorithm.leetcode.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 功能描述：课程表
 * 思路：利用map存储图，pathIn数组记录每个节点的入度，入度为0即表示可以到达，
 * 然后使用dfs遍历每个节点，遍历到的节点的后续节点入度-1（有点像进程PV操作），
 * 遍历过的节点入度赋值为-1表示访问过
 */

public class CanFinish {

    Map<Integer, List<Integer>> map = new HashMap<>();

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] pathIn = new int[numCourses];
        for (int i = 0; i < prerequisites.length; i++) {
            if (!map.containsKey(prerequisites[i][1])) {
                List<Integer> list = new ArrayList<>();
                list.add(prerequisites[i][0]);
                map.put(prerequisites[i][1], list);
            } else {
                map.get(prerequisites[i][1]).add(prerequisites[i][0]);
            }
            pathIn[prerequisites[i][0]]++;
        }
        int sum = 0;
        for (int i = 0; i < numCourses; i++) {
            if (pathIn[i] == 0) {
                sum += dfs(pathIn, i);
            }
        }
        return sum == numCourses;
    }

    int dfs(int[] pathIn, int pos) {
        pathIn[pos] = -1;
        int sum = 1;
        if (!map.containsKey(pos)) {
            return sum;
        }
        for (int num : map.get(pos)) {
            pathIn[num]--;
            if (pathIn[num] == 0) {
                sum += dfs(pathIn, num);
            }
        }
        return sum;
    }

}