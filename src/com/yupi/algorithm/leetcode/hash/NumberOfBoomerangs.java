package com.yupi.algorithm.leetcode.hash;

import java.util.HashMap;
import java.util.Map;

/**
 * 功能描述：距离相等的点元组
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */

public class NumberOfBoomerangs {

    public int numberOfBoomerangs(int[][] points) {
        int sum = 0;
        Map<Double, Integer> map = new HashMap<>();
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points.length; j++) {
                if (i == j) {
                    continue;
                }
                double dis = (points[i][0] - points[j][0]) * (points[i][0] - points[j][0])
                        + (points[i][1] - points[j][1]) * (points[i][1] - points[j][1]);
                map.put(dis, map.getOrDefault(dis, 0) + 1);
                sum += 2 * (map.get(dis) - 1);
            }
            map.clear();
        }
        return sum;
    }
}