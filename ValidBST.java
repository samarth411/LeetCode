package LeetCode;

public class ValidBST {
	
	 public static void main(String args[]) throws Exception
	 {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(3);
        root.right = new TreeNode(4);
        root.right.left = new TreeNode(6);
        System.out.println(isValidBST(root));

	 }
	 
	 
	 public static boolean isValidBST(TreeNode root) {
		 long min = Long.MIN_VALUE;
		 long max = Long.MAX_VALUE;
		 
		 //System.out.println(min);
		 //System.out.println(max);
		 return isValidUtil(root, min, max) ;
	 }
	 
	 
	 public static boolean isValidUtil(TreeNode root, long min, long max) {
		 if (root == null)
		 {
			 return true;
		 }
		 if (root.val < min || root.val > max)
		 {
			 return false;
		 }
		 else
		 {
			 return (isValidUtil(root.left, min, root.val-1)  && isValidUtil( root.right, root.val-1, max)); 
		 }
	 }
	
	
	static class TreeNode {
	    int val;
	    TreeNode left;
	    TreeNode right;
	    TreeNode(int x) { val = x; }
	 }
}



 