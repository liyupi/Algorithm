package com.yupi.algorithm.leetcode.hash;

import java.util.HashMap;
import java.util.Map;

/**
 * 功能描述：最大同一直线上的点数
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */

public class MaxPointsOnLine {

    public static void main(String[] args) {
        new MaxPointsOnLine().maxPoints(new Point[]{new Point(4, 0), new Point(4, -1), new Point(4, 5)});
    }

    public int maxPoints(Point[] points) {
        if (points.length == 0) {
            return 0;
        }
        if (points.length == 1) {
            return 1;
        }
        Map<Double, Integer> map = new HashMap<>();
        int max = 2;
        for (int i = 0; i < points.length; i++) {
            int zong = 1;
            int dup = 0;
            for (int j = i + 1; j < points.length; j++) {
                if (points[i].x == points[j].x && points[i].y == points[j].y) {
                    dup++;
                    continue;
                }
                if (points[i].y == points[j].y) {
                    zong++;
                    continue;
                }
                double k = (double) (points[i].x - points[j].x) / (points[i].y - points[j].y);
                if (Math.abs(k) == 0) {
                    k = 0.0;
                }
                if (map.containsKey(k)) {
                    map.put(k, map.get(k) + 1);
                } else {
                    map.put(k, 2);
                }
            }
            int subMax = zong;
            for (Integer value : map.values()) {
                subMax = value > subMax ? value : subMax;
            }
            max = Math.max(subMax + dup, max);
            map.clear();
        }
        return max;
    }

    static class Point {
        int x;
        int y;

        Point() {
            x = 0;
            y = 0;
        }

        Point(int a, int b) {
            x = a;
            y = b;
        }
    }
}