package com.yupi.algorithm.leetcode.string;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 功能描述：重新排列日志文件
 * <p>
 * 思路：水题
 */

public class ReorderLogFiles {

    public String[] reorderLogFiles(String[] logs) {
        int pos = logs.length - 1;
        for (int i = logs.length - 1; i >= 0; i--) {
            char c = logs[i].charAt(logs[i].indexOf(" ") + 1);
            if (c >= 48 && c <= 57) {
                if(pos == i) {
                    pos--;
                    continue;
                }
                String temp = logs[pos];
                logs[pos] = logs[i];
                logs[i] = temp;
                pos--;
                i++;
            }
        }
        Arrays.sort(logs, 0, pos + 1,
                Comparator.comparing(a -> a.substring(a.indexOf(" "))));
        return logs;
    }
}