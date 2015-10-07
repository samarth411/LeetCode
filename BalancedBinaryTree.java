package LeetCode;

public class BalancedBinaryTree {
	
	 public static void main(String args[]) throws Exception
	 {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(3);
        root.right = new TreeNode(4);
        root.right.left = new TreeNode(6);
        System.out.println(isBalanced(root));

	 }
	
	public static boolean isBalanced(TreeNode root) {
		
		int height = getHeight (root);
		
		if (height == -1)
		{
			return false;
		}
		else
		{
			return true;
		}
		
	}
	
	public static int getHeight(TreeNode root)
    {
        if (root == null)
        {
            return 0;
        }
        else
        {
            int leftHeight = getHeight(root.left);
            if (leftHeight == -1)
            {
                return -1;
            }
            int rightHeight = getHeight(root.right);
            if (rightHeight == -1)
            {
                return -1;
            }
            
            if (Math.abs(leftHeight - rightHeight) > 1)
            {
            	return -1;
            }

            return (1 + Math.max(leftHeight, rightHeight));
        }
    }
}



 class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
 }