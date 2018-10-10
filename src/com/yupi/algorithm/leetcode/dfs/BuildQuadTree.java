package com.yupi.algorithm.leetcode.dfs;

import javax.swing.plaf.basic.BasicButtonUI;

/**
 * 功能描述：构建四叉树
 * <p>
 * 思路：分成四块，递归即可
 *
 * @author Yupi Li
 * @date 2018/10/04 09:37
 */

public class BuildQuadTree {

    public static void main(String[] args) {
        new BuildQuadTree().construct(new int[][]{{1, 1, 1, 1, 0, 0, 0, 0}, {1, 1, 1, 1, 0, 0, 0, 0}, {1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 0, 0, 0, 0}, {1, 1, 1, 1, 0, 0, 0, 0}, {1, 1, 1, 1, 0, 0, 0, 0}, {1, 1, 1, 1, 0, 0, 0, 0}});
    }

    public Node construct(int[][] grid) {
        if (grid.length == 0) {
            return null;
        }
        return construct(grid, 0, grid[0].length, 0, grid.length);
    }

    public Node construct(int[][] grid, int left, int right, int top, int bottom) {
        Node root = new Node();
        int flag = 0;
        boolean first = true;
        boolean isLeaf = true;
        for (int i = top; i < bottom; i++) {
            for (int j = left; j < right; j++) {
                if (first) {
                    flag = grid[i][j];
                    first = false;
                } else {
                    if (grid[i][j] != flag) {
                        isLeaf = false;
                        break;
                    }
                }
            }
            if (!isLeaf) {
                break;
            }
        }
        if (isLeaf) {
            root.isLeaf = true;
            root.val = flag == 1;
            return root;
        }
        int xMiddle = (left + right) / 2;
        int yMiddle = (top + bottom) / 2;
        root.topLeft = construct(grid, left, xMiddle, top, yMiddle);
        root.topRight = construct(grid, xMiddle, right, top, yMiddle);
        root.bottomLeft = construct(grid, left, xMiddle, yMiddle, bottom);
        root.bottomRight = construct(grid, xMiddle, right, yMiddle, bottom);
        root.val = true;
        return root;
    }

    class Node {
        public boolean val;
        public boolean isLeaf;
        public Node topLeft;
        public Node topRight;
        public Node bottomLeft;
        public Node bottomRight;

        public Node() {
        }

        public Node(boolean _val, boolean _isLeaf, Node _topLeft, Node _topRight, Node _bottomLeft, Node _bottomRight) {
            val = _val;
            isLeaf = _isLeaf;
            topLeft = _topLeft;
            topRight = _topRight;
            bottomLeft = _bottomLeft;
            bottomRight = _bottomRight;
        }
    }
}