package com.yupi.algorithm.leetcode.tree.trie;

import java.util.HashMap;
import java.util.Map;

/**
 * 功能描述：寻找字典中的最长单词
 * <p>
 * 思路：（1）前缀树（2）快排之后，利用集合，直接依次判断除去最后一位的子串是否在之前的集合中即可
 */

public class LongestWord {

    /* 思路2
    public String longestWord(String[] words) {
        Arrays.sort(words);
        Set<String> set = new HashSet<>();
        String res = words[0];
        for (String word : words) {
            if (word.length() == 1 || set.contains(word.substring(0, word.length() - 1))) {
                set.add(word);
                res = word.length() > res.length() ? word : res;
            }
        }
        return res;
    }*/

    class Node {
        Map<Character, Node> children = new HashMap<>();
        boolean word;
    }

    private Node root = new Node();

    void insert(String word) {
        Node node = root;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (!node.children.containsKey(c)) {
                node.children.put(c, new Node());
            }
            node = node.children.get(c);
        }
        node.word = true;
    }

    boolean query(String word) {
        Node node = root;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (node.children.containsKey(c) && node.children.get(c).word) {
                node = node.children.get(c);
            } else {
                return false;
            }
        }
        return true;
    }

    public String longestWord(String[] words) {
        String res = "";
        for (String word : words) {
            insert(word);
        }
        for (String word : words) {
            if (query(word)) {
                if (word.length() > res.length()) {
                    res = word;
                } else if (word.length() == res.length() && word.compareTo(res) < 0) {
                    res = word;
                }
            }
        }
        return res;
    }

}