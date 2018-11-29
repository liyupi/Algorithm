package com.yupi.algorithm.leetcode.dfs;

/**
 * 功能描述：朋友圈
 * <p>
 * 思路：可以不用并查集思想，直接dfs，用一个一维数组记录每个人是否访问过
 * 访问某个人时，直接将其朋友也标为访问过，朋友的朋友也标为访问过。
 * 则dfs总次数即为朋友圈数（类似求水洼数）
 */

public class FindFriendCircle {

    boolean[] visited;

    public int findCircleNum(int[][] M) {
        int m = M.length;
        int n = M[0].length;
        visited = new boolean[m];
        int res = 0;
        for (int i = 0; i < m; i++) {
            if (!visited[i]) {
                dfs(M, i);
                res++;
            }
        }
        return res;
    }

    void dfs(int[][] M, int x) {
        visited[x] = true;
        for (int i = 0; i < M.length; i++) {
            if (M[x][i] == 1 && !visited[i]) {
                dfs(M, i);
            }
        }
    }
}