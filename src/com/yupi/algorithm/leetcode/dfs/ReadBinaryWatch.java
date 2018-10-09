package com.yupi.algorithm.leetcode.dfs;

import java.util.ArrayList;
import java.util.List;

/**
 * 功能描述：二进制手表
 *
 * 思路：回溯，注意每次循环从当前位置开始即可，而不是从0
 *
 * @author Yupi Li
 * @date 2018/10/04 09:37
 */

public class ReadBinaryWatch {

    boolean[] visited = new boolean[10];
    List<String> list = new ArrayList<>();

    void dfs(int num, int hour, int minute, int pos) {
        if (hour > 11 || minute > 59) {
            return;
        }
        if (num == 0) {
            String time = hour + ":" + (minute < 10 ? "0" : "") + minute;
            list.add(time);
            return;
        }
        for (int i = pos; i < 10; i++) {
            if (visited[i]) {
                continue;
            }
            visited[i] = true;
            if (i < 4) {
                dfs(num - 1, hour + (1 << i), minute, i + 1);
            } else {
                dfs(num - 1, hour, minute + (1 << (i - 4)), i + 1);
            }
            visited[i] = false;
        }
    }

    public List<String> readBinaryWatch(int num) {
        dfs(num, 0, 0, 0);
        return list;
    }

}