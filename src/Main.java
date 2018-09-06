import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 功能描述：每层节点向右连接-非完全二叉树（迭代和递归）
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */
public class Main
{

    public static void main(String args[])
    {
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(3);
        treeNode.left.left = new TreeNode(4);
        treeNode.right.right = new TreeNode(5);
        System.out.println(new Main().serialize(treeNode));
    }

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