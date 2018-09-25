package com.yupi.algorithm.leetcode.tree.trie;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 功能描述：单词替换
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */

public class ReplaceWords {

    Node root = new Node();

    public String replaceWords(List<String> dict, String sentence) {
        for (String s : dict) {
            insert(s);
        }
        String[] strings = sentence.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strings.length; i++) {
            sb.append(search(strings[i])+" ");
        }
        return sb.deleteCharAt(sb.length() - 1).toString();
    }

    public void insert(String str) {
        int len = str.length();
        Node node = root;
        for (int i = 0; i < len; i++) {
            char c = str.charAt(i);
            if (node.children.containsKey(c)) {
            } else {
                Node temp = new Node();
                node.children.put(c, temp);
            }
            node = node.children.get(c);
        }
        node.word = true;
    }

    public String search(String str) {
        int len = str.length();
        Node node = root;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {
            char c = str.charAt(i);
            if (!node.children.containsKey(c)) {
                return str;
            }
            node = node.children.get(c);
            sb.append(c);
            if (node.word) {
                return sb.toString();
            }
        }
        return str;
    }

    class Node {
        Map<Character, Node> children = new HashMap<>();
        boolean word;
    }

}