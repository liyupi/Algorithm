package com.yupi.algorithm.leetcode.math;

import java.util.ArrayList;
import java.util.List;

/**
 * 功能描述：自除数
 * <p>
 * 思路：水题，遍历即可
 */

public class SelfDividingNumbers {

    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            int val = i;
            boolean isSelf = true;
            while (val != 0) {
                int singleNum = val % 10;
                if (singleNum == 0 || i % singleNum != 0) {
                    isSelf = false;
                    break;
                }
                val /= 10;
            }
            if (isSelf) {
                list.add(i);
            }
        }
        return list;
    }
}