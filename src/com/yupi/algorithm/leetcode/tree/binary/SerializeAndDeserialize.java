package com.yupi.algorithm.leetcode.tree.binary;

/**
 * 功能描述：序列化与反序列化（先序）
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */
public class SerializeAndDeserialize
{

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null) {
            return "#";
        }
        return String.valueOf(root.val) + "," + serialize(root.left) + "," + serialize(root.right);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String[] data,int[] index) {
        if (index[0] >= data.length) {
            return null;
        }
        if ("#".equals(data[index[0]])) {
            index[0]++;
            return null;
        }
        TreeNode root = new TreeNode(Integer.valueOf(data[index[0]++]));
        root.left = deserialize(data,index);
        root.right = deserialize(data,index);
        return root;
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] dataArray = data.split(",");
        return deserialize(dataArray,new int[]{0});
    }

    public static class TreeNode
    {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x)
        {
            val = x;
        }
    }


}