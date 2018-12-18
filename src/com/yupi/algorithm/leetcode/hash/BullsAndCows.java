package com.yupi.algorithm.leetcode.hash;

/**
 * 功能描述：Bulls And Cows
 * 思路：map问题，巧妙之处在于不需要使用hash表，总共10个数，用一个数组记录每个数双方出现的最小次数，求和即可
 */

public class BullsAndCows {

    public String getHint(String secret, String guess) {
        int len = secret.length();
        int bull = 0;
        int cow = 0;
        int[] smap = new int[58];
        int[] gmap = new int[58];
        for (int i = 0; i < len; i++) {
            char cs = secret.charAt(i);
            char cg = guess.charAt(i);
            if (cs == cg) {
                bull++;
            } else {
                smap[cs]++;
                gmap[cg]++;
            }
        }
        for (int i = 48; i <= 57; i++) {
            cow += Math.min(smap[i], gmap[i]);
        }
        return bull + "A" + cow + "B";
    }

}