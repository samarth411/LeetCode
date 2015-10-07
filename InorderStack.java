package LeetCode;

import java.util.*;

/**
 * Created by Samarth on 3/13/2015.
 */
public class InorderStack {
    public static void main(String args[]) throws Exception
    {
        /*TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right = new TreeNode(5);
        root.right.left = new TreeNode(6); */

        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(5);
        

        List<Integer> result = inorderTraversal(root);
        
        for (int a : result)
        {
        	System.out.print(a + " ");	
        }
        
    }
    
    public static List<Integer> inorderTraversal(TreeNode root) {
    	List<Integer> result = new ArrayList<Integer>();
    	Stack<TreeNode> stack = new Stack<TreeNode>();
    	return inorderStack(root, stack, result);
    	
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
  
    static class TreeNode
    {
        public Integer data;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(int data)
        {
            this.data = data;
        }
    }
    
}





