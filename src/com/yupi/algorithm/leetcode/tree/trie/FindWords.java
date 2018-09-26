package com.yupi.algorithm.leetcode.tree.trie;

import java.util.*;

/**
 * 功能描述：单词搜索II
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */

public class FindWords {

    private Set<String> res = new HashSet<>();
    private Node root = new Node();
    private int[][] dir = new int[][]{{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    void insert(String str) {
        int len = str.length();
        Node node = root;
        for (int i = 0; i < len; i++) {
            char c = str.charAt(i);
            if (!node.children.containsKey(c)) {
                node.children.put(c, new Node());
            }
            node = node.children.get(c);
        }
        node.word = str;
    }

    void dfs(char[][] board, int x, int y, Node node, boolean[][] visited) {
        visited[x][y] = true;
        if (node.children.containsKey(board[x][y])) {
            String word = node.children.get(board[x][y]).word;
            if (word != null) {
                res.add(word);
            }
            for (int i = 0; i < dir.length; i++) {
                int tempX = x + dir[i][0];
                int tempY = y + dir[i][1];
                if (tempX < board.length && tempX >= 0 && tempY < board[tempX].length && tempY >= 0 && !visited[tempX][tempY]) {
                    dfs(board, tempX, tempY, node.children.get(board[x][y]), visited);
                }
            }
        }
        visited[x][y] = false;
    }

    public List<String> findWords(char[][] board, String[] words) {
        // 建立前缀树
        int len = words.length;
        for (int i = 0; i < len; i++) {
            insert(words[i]);
        }
        boolean[][] visited = new boolean[board.length][board[0].length];
        // dfs遍历
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                dfs(board, i, j, root, visited);
            }
        }
        return new ArrayList<>(res);
    }

    class Node {
        Map<Character, Node> children = new HashMap<>();
        String word;
    }

    public static void main(String[] args) {
        new FindWords().findWords(new char[][]{{'a', 'b'}, {'a', 'a'}}, new String[]{"aba", "baa", "bab", "aaab", "aaa", "aaaa", "aaba"});
    }
}