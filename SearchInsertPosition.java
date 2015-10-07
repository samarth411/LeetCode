package LeetCode;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;
import java.text.DecimalFormat;

public class SearchInsertPosition {
	 public static void main(String[] args) throws Exception {

       int[] nums = {1, 3, 5, 6};
       
       System.out.println(searchInsert(nums, 5));
       System.out.println(searchInsert(nums, 2));
       System.out.println(searchInsert(nums, 7)); 
		
    }
	 
	 
   public static int searchInsert(int[] nums, int target) {
	   return  binarySearch(nums,  target,  0, nums.length-1);
   }
	
   public static int binarySearch(int[] nums, int target, int low, int high) {  
	   if (low > high)
	   {
		   return low;
	   }
	   int mid = low + (high - low)/2 ;
	   if (nums[mid] == target)
	   {
		   return mid;
	   }
	   if (nums[mid] > target)
	   {
		   return binarySearch(nums, target, low, mid-1); 
	   }
	   else
	   {
		   return binarySearch(nums, target, mid+1, high);
	   }
	   
   }
	   
	   
	   
	   
	   
	
   
    	
}




   










