package LeetCode;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;
import java.text.DecimalFormat;

public class RemoveDuplicates {
	public static void main(String[] args) throws Exception {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(1);
        node1.next = node2;
        ListNode node3 = new ListNode(1);
        node2.next = node3;
        ListNode node4 = new ListNode(1);
        node3.next = node4;  
        
        printLinkedList(node1);
        
        ListNode headDelete = deleteDuplicates(node1);
        
        printLinkedList(headDelete);
    }
	
	
	
	
	
	public static ListNode deleteDuplicates(ListNode head) {
		// Iterative method
		 ListNode current = null;
		 if (head != null)
		 {
			 current = head.next;
		 }
		 ListNode previous = head;
		 ListNode next = null;
		 
		 while (current != null)
		 {
			 next = current.next;
			 
			 if (previous != null)
			 {
				 if (previous.val == current.val)
				 {
					 previous.next = next;
				 }
				 else
				 {
					 previous = current;
				 }
			 }
			 
			 current = next;
		 }
		 
		 return head;
		
    }
	
	

	 
	 static class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) 
	      { 
	    	  val = x; 
	      }
	 }
	 
	 public static void printLinkedList(ListNode head) {
			while (head != null)
			{
				System.out.print(head.val + " ");
				head = head.next;
			}
	        
	}
}
	
  
//Definition for singly-linked list.


