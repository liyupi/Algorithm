package com.yupi.algorithm.leetcode.math;

/**
 * 功能描述：种花问题
 *
 * 思路：小trick，种花后下标+2而不是+1可提升效率
 *
 * @author Yupi Li
 * @date 2018/10/11 09:37
 */

public class CanPlaceFlowers {

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int plant = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            if ((i == 0 || flowerbed[i - 1] == 0) && (i + 1 == flowerbed.length || flowerbed[i + 1] == 0) && flowerbed[i] == 0) {
                plant++;
                flowerbed[i] = 1;
                i++;
                if (plant >= n) {
                    break;
                }
            }
        }
        return plant >= n;
    }

}