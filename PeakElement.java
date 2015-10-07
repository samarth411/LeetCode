package LeetCode;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;
import java.text.DecimalFormat;

public class PeakElement {
	 public static void main(String[] args) throws Exception {

        int arr[] = {1, 3, 20, 4, 1, 0};
        
        System.out.println(findElement(arr));
        
		
    }
	 
    public static int findPeakElement(int[] nums) {
        int index = 0;
        if (nums.length == 1)
        {
        	return 0;
        }
        
    	for (int i=0; i<nums.length; i++)
        {
    		if (i == 0)
    		{
    				
    			if (nums[0] > nums[1])
    			{
    				return 0;
    			}
    		}
    		else if ( i == (nums.length - 1))
    		{
    			if (nums[nums.length - 1] > nums[nums.length - 2])
    			{
    				return (nums.length - 1);
    			}
    		}
    		else
    		{
    			if (nums[i] > nums[i-1] && nums[i] > nums[i+1])
    			{
    				return i;
    			}
    		}
        	
        }
    	return index;
    }
    
    public static int findElement(int[] nums) {
    	
    	return findElement(nums, 0, nums.length);
    	
    }
    
    public static int findElement(int[] nums, int low, int high) {
    	
    	int index = 0;
    	
    	if (low == 0 && high == 0)
    	{
    		return 0;
    	}
    	
    	int mid = low + (high - low)/2 ;
    	
    	if (mid == 0 && nums[mid] > nums[mid+1])
    	{
    		return mid;
    	}
    	
    	if (mid == (nums.length-1) && nums[mid] > nums[mid-1])
    	{
    		return mid;
    	}
    	
    	
    	if (mid > 0 && nums[mid] > nums[mid-1] && nums[mid] > nums[mid+1])
		{
			return mid;
		}
    	
    	else if (nums[mid] < nums[mid-1])
    	{
    		index = findElement(nums, low, mid - 1);
    	}
    	else if (nums[mid] < nums[mid+1])
    	{
    		index = findElement(nums, mid+1, high);
    	}
    	
    	return index;
    }
    	
}




   










