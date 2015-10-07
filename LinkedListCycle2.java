package LeetCode;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;
import java.text.DecimalFormat;

public class LinkedListCycle2 {
	public static void main(String[] args) throws Exception {
        ListNode node1 = new ListNode(5);
        ListNode node2 = new ListNode(7);
        node1.next = node2;
        ListNode node3 = new ListNode(8);
        node2.next = node3;
        ListNode node4 = new ListNode(9);
        node3.next = node4;   
        
        System.out.println(hasCycle(node1));
        

    }
	
	
	
	public static ListNode hasCycle(ListNode head) {
        if (head == null)
        {
        	return null;
        }
		
		ListNode slow = head;
        ListNode fast = head.next;
        
        boolean hasC = false;
        
        while (slow != null && fast != null)
        {
        	if (slow == fast)
        	{
        		hasC = true;
        		return slow;
        		
        	}
        	slow = slow.next;
        	
        	if (fast.next != null)
        	{
        		fast = fast.next.next;
        	}
        	else
        	{
        		fast = null;
        	}
        	
        }
        return null;
        
    }
	
    
	
	
	public static void printLinkedList(ListNode head) {
		while (head != null)
		{
			System.out.print(head.val + " ");
			head = head.next;
		}
        
	}
	
	//Definition for singly-linked list.
	static class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) 
	      { 
	    	  val = x; 
	      }
	 }
	
	 
}


