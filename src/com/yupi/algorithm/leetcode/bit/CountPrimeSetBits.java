package com.yupi.algorithm.leetcode.bit;

/**
 * 功能描述：二进制表示中质数个计算置位
 * <p>
 * 思路：将素数打表，遍历从L到R，依次判断其计算置位数（二进制该为1）是否为素数
 * 小技巧：Integer.bitCount(num); Long.bitCount(num); new BigInteger().bitCount()都能统计计算置位数;
 */

public class CountPrimeSetBits {

    private boolean[] prime = new boolean[]{false, false, true, true, false, true, false, true,
            false, false, false, true, false, true, false, false, false, true, false, true, false, false, false, true};

/*  得到计算置位个数
    int getOneNum(int num) {
        int count = 0;
        while (num != 0) {
            num &= num - 1;
            count++;
        }
        return count;
    }*/

    public int countPrimeSetBits(int L, int R) {
        int count = 0;
        for (int i = L; i <= R; i++) {
            if (prime[Integer.bitCount(i)]) {
                count++;
            }
        }
        return count;
    }

}
