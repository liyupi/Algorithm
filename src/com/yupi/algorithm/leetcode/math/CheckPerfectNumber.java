package com.yupi.algorithm.leetcode.math;

/**
 * 功能描述：完美数
 *
 * @author Yupi Li
 * @date 2018/10/11 09:37
 */

public class CheckPerfectNumber {

    public boolean checkPerfectNumber(int num) {
        if (num == 1) {
            return false;
        }
        int max = (int) Math.sqrt(num);
        int sum = 1;
        for (int i = 2; i <= max; i++) {
            if (num % i == 0) {
                sum += i;
                sum += num / i;
            }
        }
        return sum == num;
    }

}