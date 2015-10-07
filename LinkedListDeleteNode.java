package LeetCode;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;
import java.text.DecimalFormat;

public class LinkedListDeleteNode {
	public static void main(String[] args) throws Exception {
        ListNode node1 = new ListNode(5);
        ListNode node2 = new ListNode(7);
        node1.next = node2;
        ListNode node3 = new ListNode(8);
        node2.next = node3;
        ListNode node4 = new ListNode(9);
        node3.next = node4;   
        
        printLinkedList(node1);
        
        deleteNode(node2);
        
        printLinkedList(node1);
        
        

    }
	
    public static void deleteNode(ListNode node)     
    {
    	node.val = node.next.val;
    	node.next = node.next.next;
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


