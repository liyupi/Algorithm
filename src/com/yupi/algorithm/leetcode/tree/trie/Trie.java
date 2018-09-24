package com.yupi.algorithm.leetcode.tree.trie;

import java.util.HashMap;
import java.util.Map;

/**
 * 功能描述：前缀树实现（map集合）
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */

public class Trie {

    class Node {
        Map<Character, Node> children = new HashMap<>();
        boolean word = false;
    }

    Node root = new Node();

    /**
     * Initialize your data structure here.
     */
    public Trie() {
    }

    /**
     * Inserts a word into the trie.
     */
    public void insert(String word) {
        int len = word.length();
        Node node = root;
        for (int i = 0; i < len; i++) {
            char c = word.charAt(i);
            if (node.children.containsKey(c)) {
                node = node.children.get(c);
            } else {
                Node temp = new Node();
                node.children.put(c,temp);
                node = temp;
            }
        }
        node.word = true;
    }

    /**
     * Returns if the word is in the trie.
     */
    public boolean search(String word) {
        int len = word.length();
        Node node = root;
        for (int i = 0; i < len; i++) {
            char c = word.charAt(i);
            if (!node.children.containsKey(c)) {
                return false;
            }
            node = node.children.get(c);
        }
        return node.word;
    }

    /**
     * Returns if there is any word in the trie that starts with the given prefix.
     */
    public boolean startsWith(String prefix) {
        int len = prefix.length();
        Node node = root;
        for (int i = 0; i < len; i++) {
            char c = prefix.charAt(i);
            if (!node.children.containsKey(c)) {
                return false;
            }
            node = node.children.get(c);
        }
        return true;
    }
}
