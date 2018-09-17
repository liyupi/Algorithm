package com.yupi.algorithm.leetcode.array;

/**
 * 功能描述：容器最大盛水
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */

public class MaxSquare {

    public static void main(String[] args) {
        System.out.println(new MaxSquare().maxArea(new int[]{2, 3, 10, 5, 7, 8, 9}));
    }


    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        long max = -1;
        while (left < right) {
            long sum;
            if (height[left] < height[right]) {
                sum = (right - left) * height[left];
                left++;
            } else {
                sum = (right - left) * height[right];
                right--;
            }
            max = sum > max ? sum : max;
        }
        return (int) max;
    }
}