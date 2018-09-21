package com.yupi.algorithm.leetcode.hash;

import java.util.HashMap;

/**
 * 功能描述：四数之和
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */

public class FourSumCount {

    public static void main(String[] args) {
        System.out.println(new FourSumCount().fourSumCount(new int[]{-1, -1}, new int[]{-1, 1}, new int[]{-1, 1}, new int[]{1, -1}));
    }

    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = A.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int sum = A[i] + B[j];
                map.put(sum, map.getOrDefault(sum, 0) + 1);
            }
        }
        int res = 0;
        for (int k = 0; k < n; k++) {
            for (int l = 0; l < n; l++) {
                int sum = -C[k] - D[l];
                if (map.containsKey(sum)) {
                    res += map.get(sum);
                }
            }
        }
        return res;
    }

}