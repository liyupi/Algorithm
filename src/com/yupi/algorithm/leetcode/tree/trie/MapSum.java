package com.yupi.algorithm.leetcode.tree.trie;

import java.util.HashMap;
import java.util.Map;

/**
 * 功能描述：寻找带某前缀的字符串的值总和
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */

public class MapSum {

    class Node {
        Map<Character, Node> children = new HashMap<>();
        int val;
    }

    private Node root = new Node();

    /**
     * Initialize your data structure here.
     */
    public MapSum() {
    }

    public void insert(String key, int val) {
        int len = key.length();
        Node node = root;
        for (int i = 0; i < len; i++) {
            char c = key.charAt(i);
            if (!node.children.containsKey(c)) {
                Node temp = new Node();
                node.children.put(c, temp);
            }
            node = node.children.get(c);
        }
        node.val = val;
    }

    public int sum(String prefix) {
        int len = prefix.length();
        Node node = root;
        for (int i = 0; i < len; i++) {
            char c = prefix.charAt(i);
            if (!node.children.containsKey(c)) {
                return 0;
            } else {
                node = node.children.get(c);
            }
        }
        return getSum(node);
    }

    public int getSum(Node node) {
        int sum = node.val;
        for (Map.Entry<Character, Node> child : node.children.entrySet()) {
            sum += getSum(child.getValue());
        }
        return sum;
    }
}