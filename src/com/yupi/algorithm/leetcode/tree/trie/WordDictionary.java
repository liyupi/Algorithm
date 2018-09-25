package com.yupi.algorithm.leetcode.tree.trie;

import java.util.HashMap;
import java.util.Map;

/**
 * 功能描述：添加和搜索单词
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */

public class WordDictionary {

    Node root = new Node();

    /**
     * Initialize your data structure here.
     */
    public WordDictionary() {

    }

    /**
     * Adds a word into the data structure.
     */
    public void addWord(String word) {
        int len = word.length();
        Node node = root;
        for (int i = 0; i < len; i++) {
            char c = word.charAt(i);
            if (!node.children.containsKey(c)) {
                Node temp = new Node();
                node.children.put(c, temp);
            }
            node = node.children.get(c);
        }
        node.word = true;
    }

    /**
     * Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter.
     */
    public boolean search(String word) {
        return search(word, root);
    }

    private boolean search(String word, Node root) {
        int len = word.length();
        Node node = root;
        for (int i = 0; i < len; i++) {
            char c = word.charAt(i);
            if (c == '.') {
                for (Map.Entry<Character, Node> entry : node.children.entrySet()) {
                    if (search(word.substring(i + 1), entry.getValue())) {
                        return true;
                    }
                }
                return false;
            } else {
                if (!node.children.containsKey(c)) {
                    return false;
                }
                node = node.children.get(c);
            }
        }
        return node.word;
    }

    class Node {
        Map<Character, Node> children = new HashMap<>();
        boolean word;
    }

}