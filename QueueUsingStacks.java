package LeetCode;

import java.util.Stack;

import LeetCode.LevelOrderTraversal.TreeNode;

public class QueueUsingStacks {
	
	 static Stack<Integer> stack1 = new Stack<Integer>();
	 static Stack<Integer> stack2 = new Stack<Integer>();
	
	 public static void main(String args[]) throws Exception
	 {	    
		 push(1);
		 push(2);
		 System.out.println(peek());
		 push(3);
		 System.out.println(peek());
		
		/* push(2);
		 System.out.println(peek());
		 pop();
		 push(3);
		 push(4);
		 push(5);
		 pop();
		 pop();
		 System.out.println(peek());
		 */
		 
		 
	 }
	 
	 
	   // Push element x to the back of queue.
	    public static void push(int x) {
	        // Make the dequeue operation costly 
	    	// The enqueue operation should not be made costly
	    	stack1.push(x);
	    }

	    // Removes the element from in front of queue.
	    public static void pop() {
	    	// Trannsfer all elements from the elements from stack1 to stack2
	    	if (stack2.isEmpty())
	    	{
		    	while(!stack1.isEmpty())
		    	{
		    		int element = stack1.pop();
		    		stack2.push(element);
		    	}
	    	}
	    	stack2.pop();
	    }

	    // Get the front element.
	    public static int peek() {
	    	if (stack2.isEmpty())
	    	{
	    		// Trannsfer all elements from the elements from stack1 to stack2
		    	while(!stack1.isEmpty())
		    	{
		    		int element = stack1.pop();
		    		stack2.push(element);
		    	}
	    	}	    	
	    	return stack2.peek();
	    }

	    // Return whether the queue is empty.
	    public static boolean empty() {
	    	if (stack1.isEmpty() && stack2.isEmpty())
	    	{
	    		return true;
	    	}
	    	else
	    	{
	    		return false;
	    	}
	    	
	    }
	 
}
