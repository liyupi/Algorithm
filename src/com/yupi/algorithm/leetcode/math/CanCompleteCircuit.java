package com.yupi.algorithm.leetcode.math;

/**
 * 功能描述：加油站
 * <p>
 * 思路：极其巧妙的题目，以某点为起点若走不完，则直接以当前位置的下一个点为起点
 * 最后判断总量是否满足即可
 */

public class CanCompleteCircuit {

    public int canCompleteCircuit(int[] gas, int[] cost) {
        int total = 0;
        int start = 0;
        int sum = 0;
        for (int i = 0; i < gas.length; i++) {
            total += gas[i] - cost[i];
            sum += gas[i] - cost[i];
            if (sum < 0) {
                start = i + 1;
                sum = 0;
            }
        }
        return total >= 0 ? start : -1;
    }
}