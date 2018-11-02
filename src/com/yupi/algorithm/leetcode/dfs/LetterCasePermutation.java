package com.yupi.algorithm.leetcode.dfs;

import java.util.ArrayList;
import java.util.List;

/**
 * 功能描述：字母大小写全排列
 * 思路：dfs即可
 *
 */

public class LetterCasePermutation {

    private List<String> list = new ArrayList<>();

    void dfs(String s, int pos, String str) {
        if (pos >= s.length()) {
            list.add(str);
            return;
        }
        char c = s.charAt(pos);
        dfs(s, pos + 1, str + c);
        if (Character.isLetter(c)) {
            if (c <= 90) {
                dfs(s, pos + 1, str + (char)(c + 32));
            } else {
                dfs(s, pos + 1, str + (char)(c - 32));
            }
        }
    }

    public List<String> letterCasePermutation(String S) {
        dfs(S, 0, "");
        return list;
    }

}