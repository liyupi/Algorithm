import java.util.*;

/**
 * 功能描述：数组中两个数的最大异或值
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */

public class Main {

    Set<String> res = new HashSet<>();
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
        node.word = true;
    }

    void dfs(char[][] board, int x, int y, Node node, String str) {
        if (node.word) {
            res.add(str);
            return;
        }
        if (node.children.containsKey(board[x][y])) {
            str += board[x][y];
            for (int i = 0; i < dir.length; i++) {
                int tempX = x + dir[i][0];
                int tempY = y + dir[i][1];
                if (tempX < board.length && tempX >= 0 && tempY < board[tempX].length && tempY >= 0) {
                    dfs(board, tempX, tempY, node.children.get(board[x][y]), str);
                }
            }
        }
    }

    public List<String> findWords(char[][] board, String[] words) {
        int len = words.length;
        for (int i = 0; i < len; i++) {
            insert(words[i]);
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                dfs(board, i, j, root, "");
            }
        }
        return new ArrayList<>(res);
    }

    class Node {
        Map<Character, Node> children = new HashMap<>();
        boolean word;
    }
}