/**
 * Created by Samarth on 3/13/2015.
 */

import java.util.*;

public class LevelOrderTraversal {

    public static void main(String args[]) throws Exception
    {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(3);
        root.right = new TreeNode(4);
        root.right.left = new TreeNode(6);

        System.out.println(getHeight(root));

        //System.out.println(isTreeBalanced(root));

        int height = getHeight(root);
        for (int level=1; level<=height; level++)
        {
            // Level Order traversal
            levelOrderTraversal(root, level);
        }
    }

    static int getHeight(TreeNode root)
    {
        if (root == null)
        {
            return 0;
        }
        else
        {
            return (1 + Math.max(getHeight(root.left), getHeight(root.right)));
        }
    }
    
    
    public static List<List<Integer>> levelOrder(TreeNode root) {
    	 
    	 List<List<Integer>> list = new ArrayList<List<Integer>>();
    	 int height = getHeight(root);
         for (int level=1; level<=height; level++)
         {
             // Level Order traversal
             list.add(levelOrderTraversal(root, level));
         }
         return list;
    }

    static List<Integer> levelOrderTraversal(TreeNode root, int level)
    {
    	List<Integer> list = new ArrayList<Integer>();
        if (root == null)
        {
            return null;
        }
        if (level == 1)
        {
            //System.out.println(root.val);
        	list.add(root.val);
        	return list;
        }
        else
        {
            list.addAll(levelOrderTraversal(root.left, level - 1));
            list.addAll(levelOrderTraversal(root.right, level - 1));
        }
        
        return list;
        
    }
    
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
     }

}
