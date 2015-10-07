package LeetCode;

import java.util.*;

public class MajorityElement {
	
	 public static void main(String args[]) throws Exception
	 {
		int[] arr = new int[]{3, 2, 3};
        System.out.println(majorityElement(arr));

	 }
	 
	 
	 public static int majorityElement(int[] nums) {
		    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	        for (int i=0; i<nums.length; i++)
	        {
	        	if (map.containsKey(nums[i]))
	        	{
	        		int c = map.get(nums[i]);
	        		c++;
	        		map.put(nums[i], c);
	        	}
	        	else
	        	{
	        		map.put(nums[i], 1);
	        	}
	        }
	        
	        int maximum = Integer.MIN_VALUE;
	        int maximumKey = nums[0];
	        for (int key : map.keySet())
	        {
	        	if (map.get(key) > maximum)
	        	{
	        		maximum = map.get(key);
	        		maximumKey = key;
	        	}
	        }
	        
	        return maximumKey;
	        
	 }
	
}