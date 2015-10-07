package LeetCode;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;
import java.text.DecimalFormat;

public class MergeLinkedLists {
	public static void main(String[] args) throws Exception {
        ListNode node1 = new ListNode(5);
        ListNode node2 = new ListNode(7);
        node1.next = node2;
        ListNode node3 = new ListNode(8);
        node2.next = node3;
        ListNode node4 = new ListNode(9);
        node3.next = node4;   
        
        ListNode node5 = new ListNode(1);
        ListNode node6 = new ListNode(2);
        node5.next = node6;
        ListNode node7 = new ListNode(10);
        node6.next = node7;
        ListNode node8 = new ListNode(12);
        node7.next = node8;  
        
        
        
        printLinkedList( mergeTwoLists(node1, node5));
        

    }
	
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    	ListNode iter1 = l1;
    	ListNode iter2 = l2;
    	
    	ListNode head = null;
    	
    	if (iter1 != null && iter2 != null)
    	{
    		if (iter1.val <= iter2.val )
    		{
    			head = new ListNode(iter1.val);
    			iter1 = iter1.next;
    		}
    		else 
    		{
    			head = new ListNode(iter2.val);
    			iter2 = iter2.next;
    		}
    	}
    	else if (iter1 == null && iter2 != null)
    	{
    		
			head = new ListNode(iter2.val);
			iter2 = iter2.next;
    	}
    	
    	else if (iter1 != null && iter2 == null)
    	{
    		
			head = new ListNode(iter1.val);
			iter1 = iter1.next;
    	}
    	
    	ListNode curr = head;
    	
    	while (iter1 != null && iter2 != null)
    	{
    		if (iter1.val <= iter2.val )
    		{
    			ListNode newNode = new ListNode(iter1.val);
    			curr.next = newNode;
    			iter1 = iter1.next;
    		}
    		else 
    		{
    			ListNode newNode = new ListNode(iter2.val);
    			curr.next = newNode;
    			iter2 = iter2.next;
    		}
    		curr = curr.next;
    	}
    	while (iter1 != null)
    	{
    		ListNode newNode = new ListNode(iter1.val);
			curr.next = newNode;
			iter1 = iter1.next;
			curr = curr.next;
    	}
    	while (iter2 != null)
    	{
    		ListNode newNode = new ListNode(iter2.val);
			curr.next = newNode;
			iter2 = iter2.next;
			curr = curr.next;
    	}
    	
    	return head;
        
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

class ListNode {
      int val;
      ListNode next;
      ListNode(int x) 
      { 
    	  val = x; 
      }
 }
