package com.yupi.algorithm.leetcode.stack;

import java.util.Stack;

/**
 * 功能描述：棒球比赛
 *
 * 思路：用栈来记录得分的变化
 *
 */

public class CallPoints {

    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();
        for (String s : ops) {
            if (s.equals("C")) {
                stack.pop();   //删除上一轮得分
            } else if (s.equals("+")) {
                int one = stack.pop();
                int two = stack.pop();
                stack.push(two);
                stack.push(one);
                stack.push(one + two);   //本轮得分等于前两轮得分相加
            } else if (s.equals("D")) {
                int one = stack.peek();
                stack.push(2 * one);      //本轮得分等于前一轮得分的两倍
            } else {
                int points = Integer.parseInt(s);
                stack.push(points);    //保存本轮得分
            }
        }

        //计算总分
        int sum = 0;
        while (!stack.isEmpty()) {
            sum += stack.pop();
        }
        return sum;
    }

}