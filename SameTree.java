package LeetCode;

public class SameTree {
	
	 public static void main(String args[]) throws Exception
	 {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(3);
        root.right = new TreeNode(4);
        root.right.left = new TreeNode(6);
        
        TreeNode root1 = root;
        
        root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(3);
        root.right = new TreeNode(4);
        root.right.left = new TreeNode(6);
        
        
        System.out.println(isSameTree(root1, root));

	 }
	 
	 
	public static boolean isSameTree(TreeNode p, TreeNode q) {
	        if (p == null && q != null)
	        {
	        	return false;
	        }
	        else if (p != null && q == null)
	        {
	        	return false;
	        }
	        else if (p == null && q == null)
	        {
	        	return true;
	        }
	        else
	        {
	        	return ((p.val == q.val) && isSameTree(p.left, q.left) && isSameTree(p.right, q.right));
	        }
	}
	
	

static class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
 }
}