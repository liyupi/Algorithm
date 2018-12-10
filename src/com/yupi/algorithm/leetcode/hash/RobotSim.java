package com.yupi.algorithm.leetcode.hash;

import java.util.HashSet;
import java.util.Set;

/**
 * 功能描述：模拟行走机器人
 * 思路：利用set存储障碍物，设计键为x,y，每次行走前判断当前坐标是否在障碍物中，若无，则行走
 */

public class RobotSim {

    public int robotSim(int[] commands, int[][] obstacles) {
        if (commands.length == 0) {
            return 0;
        }
        int[][] dirs = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int dir = 0;
        int x = 0;
        int y = 0;
        int res = 0;
        Set<String> obs = new HashSet<>();
        for (int i = 0; i < obstacles.length; i++) {
            obs.add(obstacles[i][0] + "," + obstacles[i][1]);
        }
        for (int i = 0; i < commands.length; i++) {
            switch (commands[i]) {
                case -2:
                    dir = (dir + 3) % 4;
                    break;
                case -1:
                    dir = (dir + 1) % 4;
                    break;
                default:
                    for (int j = 0; j < commands[i]; j++) {
                        if (!obs.contains((x + dirs[dir][0]) + "," + (y + dirs[dir][1]))) {
                            x += dirs[dir][0];
                            y += dirs[dir][1];
                            res = Math.max(x * x + y * y, res);
                        } else {
                            break;
                        }
                    }
            }
        }
        return res;
    }
}