package com.yupi.algorithm.leetcode.dfs;

import java.util.ArrayList;
import java.util.List;

/**
 * 功能描述：复原ip地址
 * <p>
 * 思路：dfs即可
 */

public class RestoreIPAddress {

    List<String> res = new ArrayList<>();

    public List<String> restoreIpAddresses(String s) {
        if (s.length() < 4 || s.length() > 12) {
            return res;
        }
        dfs(s, 0, 3, "");
        return res;
    }

    void dfs(String s, int pos, int count, String sb) {
        if (count == 0) {
            if (s.length() - pos <= 3) {
                if (s.length() - pos > 1 && s.charAt(pos) == '0') {
                    return;
                }
                int num = Integer.parseInt(s.substring(pos));
                if (num > 255) {
                    return;
                }
                res.add(sb + s.substring(pos));
            }
            return;
        }
        for (int i = 1; i <= 3; i++) {
            if (s.length() - pos - i < count) {
                break;
            }
            String numStr = s.substring(pos, pos + i);
            if (numStr.length() > 1 && numStr.charAt(0) == '0') {
                continue;
            }
            int num = Integer.parseInt(numStr);
            if (num > 255) {
                continue;
            }
            String temp =  sb + numStr + ".";
            dfs(s, pos + i, count - 1, temp);
        }
    }

}