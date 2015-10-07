package LeetCode;

import java.util.*;

public class ContainerMostWater {
	
	 public static void main(String args[]) throws Exception
	 {
		int[] arr = new int[]{3, 2, 3};
        //System.out.println(majorityElement(arr));
	 }
	 

	 public static int maxArea(int[] height) {
         int start = 0;
         int end = height.length - 1;
         int max = (end - start) * Math.min(height[start], height[end]);
         
         while (start < end)
         {
        	
        	 if (height[start] < height[end])
        	 {
        		 start++;
        	 }
        	 else 
        	 {
        		 end--;
        	 }
        	 
        	 max = Math.max(max, (end - start) * Math.min(height[start], height[end]));
         }
         
         return max;
     }
	 
	 
	
	
}