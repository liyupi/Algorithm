package com.yupi.algorithm.leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 功能描述：合并区间
 * <p>
 * 思路：快排所有区间的开始和结束，得到两个有序数组，然后交错比较
 */

public class MergeIntervals {
    public class Interval {
        int start;
        int end;

        Interval() {
            start = 0;
            end = 0;
        }

        Interval(int s, int e) {
            start = s;
            end = e;
        }
    }

    public List<Interval> merge(List<Interval> intervals) {
        int maxPos = intervals.size();
        if (maxPos < 2) {
            return intervals;
        }
        int[] starts = new int[maxPos];
        int[] ends = new int[maxPos];
        int pos = 0;
        for (Interval interval : intervals) {
            starts[pos] = interval.start;
            ends[pos] = interval.end;
            pos++;
        }
        Arrays.sort(starts);
        Arrays.sort(ends);
        List<Interval> res = new ArrayList<>();
        // 交错比较
        for (int i = 0, j = 0; i < maxPos; i++) {
            if (i == maxPos - 1 || starts[i + 1] > ends[i]) {
                res.add(new Interval(starts[j], ends[i]));
                j = i + 1;
            }
        }
        return res;
    }
}