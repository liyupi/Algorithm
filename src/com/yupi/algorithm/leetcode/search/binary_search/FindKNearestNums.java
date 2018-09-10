package com.yupi.algorithm.leetcode.search.binary_search;

import java.util.ArrayList;
import java.util.List;

/**
 * 功能描述：升序数列中寻找最接近的k个元素
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */
public class FindKNearestNums {

    public static void main(String[] args) {
    }

    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        if (arr.length == 0) {
            return null;
        }
        int left = 0;
        int right = arr.length - k;
        while (left < right) {
            int middle = left + (right - left) / 2;
            if (Math.abs(arr[middle] - x) <= Math.abs(arr[middle+k] - x)) {
                right = middle;
            } else {
                left = middle + 1;
            }
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            list.add(arr[i+left]);
        }
        return list;
    }

}