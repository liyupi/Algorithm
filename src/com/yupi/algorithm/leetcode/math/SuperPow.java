package com.yupi.algorithm.leetcode.math;

/**
 * 功能描述：超级次方
 * 思路：只要是次方就考虑递归，每次拆分成一半的次方乘一半的次方
 */

public class SuperPow {

    public int superPow(int a, int[] b) {
        long res = 1;
        for (int i = 0; i < b.length; i++) {
            res = myPow(res, 10) * myPow(a, b[i]) % 1337;
        }
        return (int)res;
    }

    long myPow(long num, int time) {
        if (time == 0) {
            return 1;
        }
        if (time == 1) {
            return num;
        }
        return myPow(num % 1337, time / 2) * myPow(num % 1337, time - time / 2) % 1337;
    }


}