package com.yupi.algorithm.leetcode.hash;

import java.util.HashSet;
import java.util.Set;

/**
 * 功能描述：自建哈希表（其实应该是数组加链表）
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */

public class HappyNum {

    public boolean isHappy(int n) {
        Set<Integer> hashSet = new HashSet<>();
        int val = n;
        while (true) {
            int sum = 0;
            while (val != 0) {
                int mod = val % 10;
                sum += mod * mod;
                val /= 10;
            }
            if (sum != 1 && hashSet.contains(sum)) {
                return false;
            }
            if (sum == 1) {
                return true;
            }
            hashSet.add(sum);
            val = sum;
        }
    }


}