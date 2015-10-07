package LeetCode;

public class PathSum {
	
	 public static void main(String args[]) throws Exception
	 {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(3);
        root.right = new TreeNode(4);
        root.right.left = new TreeNode(6);
        System.out.println(hasPathSum(root, 6 ));
        System.out.println(hasPathSum(root, 20 ));
        System.out.println(hasPathSum(null, 0 ));
        
        
        root = new TreeNode(1);
        root.left = new TreeNode(2);
        
        System.out.println(hasPathSum(root, 1 ));
        
	 }
	 
	public static boolean hasPathSum(TreeNode root, int sum) {
		if (root == null)
		{
			return false;
		}
		else
		{
			return hasPathSum2(root, sum) ;
		} 
	}
	
	public static boolean hasPathSum2(TreeNode root, int sum) {
		
		
		boolean result = true;
		
		if ( root == null)
		{
			if (sum == 0)
			{
				result = true;
			}
			else
			{
				result = false;
			}
		}
		
		else
		{
			if (root.left != null && root.right != null)
			{
				result = (hasPathSum2(root.left, (sum - root.val)) || hasPathSum2(root.right, (sum - root.val)));
			}
			else if (root.left != null)
			{
				//System.out.println("Reached here man " + (sum - root.val));
				result = (hasPathSum2(root.left, (sum - root.val)));
			}
			else if (root.right != null)
			{
				result = (hasPathSum2(root.right, (sum - root.val)));
			}
			else
			{
				if ((sum - root.val) == 0)
				{
					result = true;
				}
				else
				{
					result = false;
				}
			}
			
		}
		
		return result;
	}
	
	
	 
	static class TreeNode {
		    int val;
		    TreeNode left;
		    TreeNode right;
		    TreeNode(int x) { val = x; }
		 }
}


