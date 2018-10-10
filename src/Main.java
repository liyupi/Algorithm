import com.yupi.algorithm.leetcode.tree.bst.TreeNode;

/**
 * 功能描述：二叉树路径总和III
 *
 * 思路：依次以每个节点为根节点遍历路径和
 *
 * @author Yupi Li
 * @date 2018/10/04 09:37
 */

public class Main {


    public int pathSum(TreeNode root, int sum) {
        if (root == null) {
            return 0;
        }
        int pathNum = getPathSum(root,sum);
        pathNum += pathSum(root.left,sum);
        pathNum += pathSum(root.right,sum);
        return pathNum;
    }

    public int getPathSum(TreeNode root,int sum) {
        if (root == null) {
            return 0;
        }
        int pathNum = 0;
        sum -= root.val;
        if (sum == 0) {
            pathNum++;
        }
        pathNum += getPathSum(root.left,sum);
        pathNum += getPathSum(root.right,sum);
        return pathNum;
    }


    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        node.right = new TreeNode(2);
        node.right.right = new TreeNode(3);
        node.right.right.right = new TreeNode(4);
        node.right.right.right.right = new TreeNode(5);
        new Main().pathSum(node, 3);
    }
}