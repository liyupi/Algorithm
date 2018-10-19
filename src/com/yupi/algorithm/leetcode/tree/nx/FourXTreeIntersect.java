package com.yupi.algorithm.leetcode.tree.nx;

/**
 * 功能描述：四叉树交集
 *
 * 思路：如果某个区域是叶子且值为真，则直接返回该叶子，否则返回和其比较的叶子（或运算规则）
 * 而无需继续分割
 *
 * @author Yupi Li
 * @date 2018/10/11 09:37
 */

public class FourXTreeIntersect {

    public Node intersect(Node quadTree1, Node quadTree2) {
        if (quadTree1.isLeaf) {
            return quadTree1.val ? quadTree1 : quadTree2;
        }
        if (quadTree2.isLeaf) {
            return quadTree2.val ? quadTree2 : quadTree1;
        }
        Node topLeft = intersect(quadTree1.topLeft, quadTree2.topLeft);
        Node topRight = intersect(quadTree1.topRight, quadTree2.topRight);
        Node bottomLeft = intersect(quadTree1.bottomLeft, quadTree2.bottomLeft);
        Node bottomRight = intersect(quadTree1.bottomRight, quadTree2.bottomRight);
        if (topLeft.val == topRight.val && topRight.val == bottomLeft.val && bottomLeft.val == bottomRight.val &&
                topLeft.isLeaf && topRight.isLeaf && bottomLeft.isLeaf && bottomRight.isLeaf) {
            return new Node(true, true, null, null, null, null);
        }
        return new Node(false, false, topLeft, topRight, bottomLeft, bottomRight);
    }


    // Definition for a QuadTree node.
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