package com.yupi.algorithm.leetcode.math;

/**
 * 功能描述：构造矩形
 *
 * 思路：因为W>=L，因此height必小于等于sqrt(area)
 *
 * @author Yupi Li
 * @date 2018/10/11 09:37
 */

public class ConstructRectangle {

    public int[] constructRectangle(int area) {
        // 因为W>=L，因此height必小于等于sqrt(area)
        int height = (int) Math.sqrt(area);
        for (; height >= 1; height--) {
            if (area % height == 0) {
                return new int[]{area / height, height};
            }
        }
        return new int[]{0,0};
    }
}