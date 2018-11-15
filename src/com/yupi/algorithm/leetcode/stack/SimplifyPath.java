package com.yupi.algorithm.leetcode.stack;

import java.util.Stack;

/**
 * 功能描述：简化路径
 * <p>
 * 思路：利用栈存储每个有效路径名即可
 */

public class SimplifyPath {

    public String simplifyPath(String path) {
        if ("".equals(path)) {
            return "";
        }
        Stack<String> stack = new Stack<>();
        String[] words = path.split("/");
        for (String word : words) {
            switch (word) {
                case "..":
                    if (!stack.isEmpty()) {
                        stack.pop();
                    }
                    break;
                case ".":
                    break;
                case "":
                    break;
                default:
                    stack.push(word);
            }
        }
        if (stack.size() == 0) {
            return "/";
        }
        StringBuilder sb = new StringBuilder();
        for (String s : stack) {
            sb.append("/").append(s);
        }
        return sb.toString();
    }
/*
    public static void main(String[] args){
        new Main().simplifyPath("/a/./b/..//../c/");
    }*/
}