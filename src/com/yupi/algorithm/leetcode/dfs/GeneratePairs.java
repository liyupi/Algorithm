package com.yupi.algorithm.leetcode.dfs;

import java.util.ArrayList;
import java.util.List;

/**
 * 功能描述：括号生成
 * <p>
 * 思路：dfs（或bfs），合法情况剩余左括号数一定小于等于剩余右括号数
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */

public class GeneratePairs {

    List<String> list = new ArrayList<>();

    public void dfs(int left, int right, String s) {
        // 非法情况
        if (left > right) {
            return;
        }
        // 括号用完，添加字符串
        if (left == 0 && right == 0) {
            list.add(s);
        }
        // 如果还有左括号
        if (left > 0) {
            dfs(left - 1, right, s + "(");
        }
        // 只要括号没用完，一定还有右括号
        dfs(left, right - 1, s + ")");
    }

    public List<String> generateParenthesis(int n) {
        dfs(n, n, "");
        return list;
    }

}