/**
 * 功能描述：二叉树是否对称（递归）
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */
public class Main
{
    public static void main(String args[])
    {
        StringBuilder stringBuilder = new StringBuilder("AAB");
        System.out.println(stringBuilder.reverse());
        System.out.println(stringBuilder);
    }

    public boolean isSymmetric(TreeNode root)
    {
        if (root == null){
            return true;
        }
        return isSymmetric(root.left,root.right);
    }

    private boolean isSymmetric(TreeNode left, TreeNode right)
    {
        if (left == null && right == null)
        {
            return true;
        }
        if (left == null || right == null)
        {
            return false;
        }
        return left.val==right.val&&isSymmetric(left.left,right.right)&&isSymmetric(left.right,right.left);
    }

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
}