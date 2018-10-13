package com.yupi.algorithm.leetcode.math;

import java.util.Arrays;

/**
 * 功能描述：供暖器
 *
 * 思路：先快排，然后依次判断每个房子到供暖器的最近距离，并取最大值
 *
 *
 * @author Yupi Li
 * @date 2018/10/11 09:37
 */

public class FindRadius {

    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(houses);
        Arrays.sort(heaters);
        int minR = 0;
        int j = 0;
        for (int i = 0; i < houses.length; i++) {
            while (j < heaters.length - 1 && Math.abs(houses[i] - heaters[j]) >= Math.abs(houses[i] - heaters[j + 1])) {
                j++;
            }
            minR = Math.max(minR, Math.abs(houses[i] - heaters[j]));
        }
        return minR;
    }
}