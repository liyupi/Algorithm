import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 功能描述：二叉树的深度（自顶向下和自底向上）
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */
public class Main
{
    public class TreeNode
    {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x)
        {
            val = x;
        }
    }


    /**
     * 自底向上
     **/
    public int maxDepth(TreeNode root) {
        if (root == null){
            return 0;
        }
        int x = maxDepth(root.left);
        int y = maxDepth(root.right);
        return Math.max(x,y)+1;
    }

    /**
     * 自顶向下
     **/
    int answer = 0;
    public int getMaxDepth(TreeNode root,int depth){
        if (root == null){
            if (depth>answer){
                answer = depth;
            }
            return depth;
        }
        getMaxDepth(root.left,depth+1);
        getMaxDepth(root.right,depth+1);
        return answer;
    }

    public static void main(String args[])
    {

    }
}