package com.yupi.algorithm.leetcode.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 功能描述：课程表II
 * 思路：和课程表I一样，只不过把路径记录下来
 */

public class CanFinish2 {

    Map<Integer, List<Integer>> map = new HashMap<>();

    public int[] findOrder(int numCourses, int[][] prerequisites) {
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
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            if (pathIn[i] == 0) {
                dfs(pathIn, i, res);
            }
        }
        if (res.size() == numCourses) {
            int[] result = new int[numCourses];
            for (int i = 0; i < numCourses; i++) {
                result[i] = res.get(i);
            }
            return result;
        }
        return new int[]{};
    }

    private void dfs(int[] pathIn, int pos, List<Integer> res) {
        pathIn[pos] = -1;
        res.add(pos);
        if (!map.containsKey(pos)) {
            return;
        }
        List<Integer> next = map.get(pos);
        for (int num : next) {
            pathIn[num]--;
            if (pathIn[num] == 0) {
                dfs(pathIn, num, res);
            }
        }
    }


}