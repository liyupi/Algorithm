package com.yupi.algorithm.leetcode.array;

/**
 * 功能描述：旋转01数组
 *
 * 思路：可直接new一个数组并直接从尾部复制（省去了交换的时间）
 */

public class FlipAndInvertImage {

    public int[][] flipAndInvertImage(int[][] A) {
        int[][] B = new int[A.length][A[0].length];
        int y = A[0].length;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                A[i][j] = A[i][y - j - 1] ^ 1;
            }
        }
/*        for (int i = 0; i < A.length; i++) {
            reverseArray(A[i]);
        }*/
        return B;
    }

/*    private void reverseArray(int[] ints) {
        int left = 0;
        int right = ints.length - 1;
        while (left < right) {
            int temp = ints[left];
            ints[left] = ints[right];
            ints[right] = temp;
            left++;
            right--;
        }
    }*/
}