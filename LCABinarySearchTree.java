package LeetCode;

public class LCABinarySearchTree {
	
	 public static void main(String args[]) throws Exception
	 {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(3);
        root.right = new TreeNode(4);
        root.right.left = new TreeNode(6);
        //ystem.out.println(isBalanced(root));

	 }
	
	 public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
	        if (root == null)
	        {
	            return null;
	        }
	        if (root.val < p.val && root.val < q.val)
	        {
	            return lowestCommonAncestor( root.right, p, q) ;
	        }
	        else if (root.val > p.val && root.val > q.val )
	        {
	            return lowestCommonAncestor( root.left, p, q) ;
	        }
	        
	        return root;
	        
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