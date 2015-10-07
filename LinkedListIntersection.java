package LeetCode;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;
import java.text.DecimalFormat;

public class LinkedListIntersection {
	public static void main(String[] args) throws Exception {
        ListNode node1 = new ListNode(5);
        ListNode node2 = new ListNode(7);
        node1.next = node2;
        ListNode node3 = new ListNode(8);
        node2.next = node3;
        ListNode node4 = new ListNode(9);
        node3.next = node4;   
        
        ListNode node5 = new ListNode(9);
        node5.next = node2;
        
        
        System.out.println("Hello man ");
        
        System.out.println(getIntersectionNode(node1, node5).val);
        

    }
	
	public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		
		//Get count of the first linked list
		ListNode iterA = headA;
		int countA = 0;
		while (iterA != null)
		{
			countA++;
			iterA = iterA.next;
		}
		while (iterA != null)
		{
			countA++;
			iterA = iterA.next;
		}
		
		//Get count of the first linked list
		ListNode iterB = headB;
		int countB = 0;
		while (iterB != null)
		{
			countB++;
			iterB = iterB.next;
		}
		
		
		
		int iterInit = Math.abs(countA - countB);
		//System.out.println("Hello man " + iterInit + " " + countA + " " + countB);
		
		
		iterA = headA;
		iterB = headB;
		
		if (countA > countB)
		{
			for (int i=0; i<iterInit; i++)
			{
				iterA = iterA.next;
			}
		}
		else
		{
			for (int i=0; i<iterInit; i++)
			{
				iterB = iterB.next;
			}
		}
		
		while (iterA != null && iterB != null )
		{
			if (iterA == iterB)
			{
				return iterA;
			}
			iterA = iterA.next;
			iterB = iterB.next;
		}
		
		
		return null;
				
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


