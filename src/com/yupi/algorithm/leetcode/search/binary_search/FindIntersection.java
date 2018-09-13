package com.yupi.algorithm.leetcode.search.binary_search;

import java.util.*;

/**
 * 功能描述：寻找交集
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */

public class FindIntersection {

    public int[] intersection(int[] nums1, int[] nums2) {
        if (nums1.length == 0 || nums2.length == 0){
            return new int[]{};
        }
        Arrays.sort(nums2);
        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < nums1.length; i++) {
            if (map.containsKey(nums1[i])&&map.get(nums1[i])!=0) {
                continue;
            }
            if (binary_search(nums2,nums1[i])){
                map.put(nums1[i],1);
                list.add(nums1[i]);
            }
        }
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }

    public boolean binary_search(int[] nums,int target){
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (nums[middle]  == target) {
                return true;
            } else if (nums[middle] < target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return false;
    }

}