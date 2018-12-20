package com.yupi.algorithm.leetcode.math;

/**
 * 功能描述：给定数字组合成的最大时间
 * 思路：4个数字分为2组，每组表示小时或分钟。列举组合，求最大时间
 */

public class LargestTimeFromDigits {

    String res;

    public String largestTimeFromDigits(int[] A) {
        res = "";
        getTime(A[0], A[1], A[2], A[3]);
        getTime(A[0], A[2], A[1], A[3]);
        getTime(A[0], A[3], A[1], A[2]);
        getTime(A[1], A[2], A[0], A[3]);
        getTime(A[1], A[3], A[0], A[2]);
        getTime(A[2], A[3], A[0], A[1]);
        return res;
    }

    void getTime(int h1, int h2, int m1, int m2) {
        int hour = getSubTime(h1, h2, 24);
        int minute = getSubTime(m1, m2, 60);
        if (hour == -1 || minute == -1) {
            return;
        }
        String time = (hour < 10 ? "0" + hour : hour) + ":" + (minute < 10 ? "0" + minute : minute);
        res = time.compareTo(res) > 0 ? time : res;
    }

    private int getSubTime(int h1, int h2, int limit) {
        int time1 = h1 * 10 + h2;
        int time2 = h2 * 10 + h1;
        return Math.max(time1 < limit ? time1 : -1, time2 < limit ? time2 : -1);
    }

}