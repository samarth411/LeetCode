/**
 * Created by Samarth on 3/13/2015.
 */

package LeetCode;

import java.util.*;

import LeetCode.LevelOrderTraversal.TreeNode;

public class TreeInorderPostOrder {
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

        
        System.out.println(lca.val);

    }

 

        
        public static TreeNode buildTree(int[] postorder, int[] inorder) {
            
            return constTree(postorder.length-1, postorder, inorder, 0, inorder.length-1);
            
        }
        
        
        public static TreeNode constTree(int postOrderIndex, int[] postOrder, int[] inOrder, int inOrderStart, int inOrderEnd)
        {
            //System.out.println(preOrderIndex);
            if (postOrderIndex > (pos)
            {
                return null;
            }
            
            if (inOrderStart > inOrderEnd)
            {
                return null;
            }
            
            TreeNode root = new TreeNode(preOrder[preOrderIndex]);

            // Find position in in the inorder
            int position = 0;
            for (int i = inOrderStart; i <= inOrderEnd; i++) {
                if (root.val == inOrder[i]) {
                    position = i;
                    break;
                }
            }


                root.left = constTree(preOrderIndex+1, preOrder, inOrder, inOrderStart, position - 1);
                root.right = constTree(preOrderIndex + position + 1 - inOrderStart, preOrder, inOrder, position + 1, inOrderEnd);
            

            //inorderTraversal(root);

            return root;
        }
    
    
    
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
     }
}
