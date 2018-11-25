package com.yupi.algorithm.leetcode.math;

/**
 * 功能描述：重新排列日志文件
 * <p>
 * 思路：因可向左或向右移动，target为正和负结果相同。
 * 先假设一直向右走，然后判断sum和target的差是否为偶数
 * 如果是偶数，则当前移动次数即为结果
 * 否则要多移动一次，再判断移动次数是否为偶数次，是偶数次则再多移动一次
 */

public class ReachNumber {

    public int reachNumber(int target) {
        target = Math.abs(target);
        int move = 0;
        int pos = 0;
        while (pos < target) {
            pos += ++move;
            if (pos == target) {
                return move;
            }
            if (pos > target) {
                if ((pos - target) % 2 == 0) {
                    return move;
                }
                move++;
                if (move % 2 == 0) {
                    return ++move;
                } else {
                    return move;
                }
            }
        }
        return move;
    }

}