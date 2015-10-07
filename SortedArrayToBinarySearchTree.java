package LeetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import LeetCode.InorderStack.TreeNode;

public class SortedArrayToBinarySearchTree {
	
	 public static void main(String args[]) throws Exception
	 {	 
		int[] arr = new int[]{1, 2, 3, 4, 5};  
        TreeNode root = sortedArrayToBST(arr) ;
       
        List<Integer> result = inorderTraversal(root);
        for (int a : result)
        {
        	System.out.print(a + " ");	
        }
        
	 }
	 
	 
	 public static TreeNode sortedArrayToBST(int[] nums) {
		 
		 if (nums.length == 0)
		 {
			 return null;
		 }
		 
		 int start = 0;
		 int end = nums.length - 1;
		
		 return sortedArrayToBSTUtil(nums, start, end);
		 
	 }
	 
	 
	 public static TreeNode sortedArrayToBSTUtil(int[] nums, int start, int end) {
		 
		 if (start > end)
		 {
			 return null;
		 }
		 
		 int mid = (start + (end - start)/2);
		 int ele = nums[mid];
		 
		 TreeNode root = new TreeNode(ele);
		 
		
	      root.left = sortedArrayToBSTUtil(nums, start, mid - 1);
	      root.right = sortedArrayToBSTUtil(nums, mid + 1, end);
		 
		 

		 return root;
		 
		 
	 }
	 
	 
	 static List<Integer> inorderStack(TreeNode root, Stack stack, List<Integer> result)
	    {
	        boolean traversalComplete = false;
	        while (traversalComplete != true)
	        {
	            if (root != null)
	            {
	                stack.push(root);
	                root = root.left;
	            }
	            else
	            {
	            	if (stack.isEmpty())
	            	{
	            		traversalComplete = true;
	            	}
	            	else
	            	{
	            		 TreeNode popNode = (TreeNode)stack.pop();
	                     //System.out.println("Hey " + popNode.data);
	                     result.add(popNode.data);
	                     root = popNode.right;
	            	}
	                //stack.push(root);
	                //if (root != null)
	                //{
	                	//System.out.println("Hey bbb " + root.data);
	                //}
	            }
	            //if (stack.isEmpty())
	            //{
	            	//traversalComplete = true;
	            //}
	        }
	        return result;
	    }
	 
	 
  
  
  public static List<Integer> inorderTraversal(TreeNode root) {
  	List<Integer> result = new ArrayList<Integer>();
  	Stack<TreeNode> stack = new Stack<TreeNode>();
  	return inorderStack(root, stack, result);
  	
  }

	
}



