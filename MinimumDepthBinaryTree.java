package LeetCode;

public class MinimumDepthBinaryTree {
	
	 public static void main(String args[]) throws Exception
	 {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(3);
        root.right = new TreeNode(4);
        root.right.left = new TreeNode(6);
        System.out.println(minDepth(root));

	 }
	 
	 
	 public static int minDepth(TreeNode root) {
		if (root == null)
		{
			return 0;
		}
		if (root.left == null && root.right == null)
		{
			return 1;
		}
		
		return (1 + Math.min((root.left != null)?minDepth(root.left):Integer.MAX_VALUE, 
				(root.right!= null)?minDepth(root.right): Integer.MAX_VALUE));
		   
	}
	
}



