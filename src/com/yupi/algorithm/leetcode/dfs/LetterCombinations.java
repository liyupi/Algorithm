package com.yupi.algorithm.leetcode.dfs;

import java.util.ArrayList;
import java.util.List;

/**
 * 功能描述：电话号码的字母组合
 * <p>
 * 思路：dfs遍历
 */

public class LetterCombinations {

    private String[] nums = new String[]{"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    List<String> res = new ArrayList<>();

    public List<String> letterCombinations(String digits) {
        if ("".equals(digits)) {
            return res;
        }
        dfs(digits, 0, "");
        return res;
    }

    void dfs(String digits, int pos, String str) {
        if (pos == digits.length()) {
            res.add(str);
            return;
        }
        int num = digits.charAt(pos) - 48;
        for (int i = 0; i < nums[num].length(); i++) {
            dfs(digits, pos + 1, str + nums[num].charAt(i));
        }
    }


}