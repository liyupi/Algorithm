package com.yupi.algorithm.leetcode.math;

/**
 * 功能描述：柠檬水找零
 *
 * 思路：记录可找的零钱即可
 */

public class LemonadeChange {

    public boolean lemonadeChange(int[] bills) {
        int[] leftMoney = new int[2];
        for (int i = 0; i < bills.length; i++) {
            if (bills[i] == 5) {
                leftMoney[0] += 1;
            } else if(bills[i] == 10) {
                if (leftMoney[0] > 0) {
                    leftMoney[1] += 1;
                    leftMoney[0] -= 1;
                } else {
                    return false;
                }
            } else if (bills[i] == 20) {
                if (leftMoney[1] > 0 && leftMoney[0] > 0) {
                    leftMoney[1] -= 1;
                    leftMoney[0] -= 1;
                } else if(leftMoney[0] > 2) {
                    leftMoney[0] -= 3;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}