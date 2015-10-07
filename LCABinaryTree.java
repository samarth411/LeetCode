/**
 * Created by Samarth on 3/13/2015.
 */

package LeetCode;

import java.util.*;

import LeetCode.LevelOrderTraversal.TreeNode;

public class LCABinaryTree {
    public static void main(String args[]) throws Exception
    {
       TreeNode root = new TreeNode(1);
       TreeNode node2 = new TreeNode(2);
       TreeNode node3 = new TreeNode(3);
       TreeNode node4 = new TreeNode(4);
       TreeNode node5 = new TreeNode(5);
       TreeNode node6 = new TreeNode(6);
       
        root.left = node2;
        root.left.left = node3;
        root.left.right = node4;
        root.right = node5;
        root.right.left = node6;

        TreeNode lca = lowestCommonAncestor(root, node3, node4);
        
        System.out.println(lca.val);

    }

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode n1, TreeNode n2) {
        
        List<TreeNode> pathN1 = new ArrayList<TreeNode>();
        List<TreeNode> pathN2 = new ArrayList<TreeNode>();
        findPath(root, n1, pathN1);
        findPath(root, n2, pathN2);
        /*for (int value : pathN1)
        {
            System.out.print(value + " ");
        }
        System.out.println();

        for (int value : pathN2)
        {
            System.out.print(value + " ");
        }*/

        // Find the first element between the lists that is not common
        int minPath = (pathN1.size() < pathN2.size()) ? pathN1.size() : pathN2.size();

        int pos = 0;
        for (int i=0; i<minPath; i++)
        {
        	if (i == (minPath-1))
        	{
        		if (pathN1.get(i) == pathN2.get(i))
        		{
        			pos = i;
        			break;
        		}
        	}
            if (pathN1.get(i) != pathN2.get(i))
            {
                pos = i-1;
                break;
            }
        }
        return pathN1.get(pos);
    }

    static boolean findPath(TreeNode root, TreeNode n1, List<TreeNode> pathN1)
    {
        if (root == null)
        {
            return false ;
        }
        pathN1.add(root);
        //System.out.println("Inserting " + root.data);
        if (root == n1)
        {
            return true;
        }
        else
        {
            if ((findPath(root.left, n1, pathN1) == false) && findPath(root.right, n1, pathN1) == false)
            {
                pathN1.remove(root);
                return false;
            }
        }
        return true;
    }
    
    
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
     }
}
