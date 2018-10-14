package com.yupi.algorithm.leetcode.hash;

import java.util.HashMap;
import java.util.Map;

/**
 * 功能描述：下一个最大元素
 * <p>
 * 思路：用map来记录每个元素出现的位置，加速初始定位
 *
 * @author Yupi Li
 * @date 2018/10/11 09:37
 */

public class NextGreaterElement {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums2.length; i++) {
            map.put(nums2[i], i);
        }
        int[] res = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            int start = map.get(nums1[i]) + 1;
            while (start < nums2.length) {
                if (nums2[start] > nums1[i]) {
                    res[i] = nums2[start];
                    break;
                }
                start++;
            }
            if (start == nums2.length) {
                res[i] = -1;
            }
        }
        return res;
    }

}