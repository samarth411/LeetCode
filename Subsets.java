package LeetCode;

import java.util.*;

public class Subsets {
	
	 public static void main(String args[]) throws Exception
	 {
		int[] nums = new int[]{1, 2};
		
		List<List<Integer>> res = subsets(nums);
		
		for (List<Integer> r : res)
		{
			for (Integer i : r)
			{
				System.out.print(i);
			}
			System.out.println();
		}
		
	 }
	 
	 
	public static List<List<Integer>> subsets(int[] nums) {
		
		Arrays.sort(nums);
		int iter = (int) Math.pow((double)2, (double)nums.length);
		//System.out.println(iter);
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		
		for (int i=0; i<iter; i++)
		{
			List<Integer> res = new ArrayList<Integer>();
			for (int j=0; j<nums.length; j++)
			{
				if ((i & 1<<j) != 0)
				{
					//System.out.println("Heyyyy " + i + " " + j );
					res.add(nums[j]);
				}
			}
			result.add(res);
		}
		
		return result;
			
	}
	 
	 
	public static void rotate(int[][] matrix) {
	    int n = matrix.length;
	    int[][] dest = new int[n][n];
	    
	    for (int i=0; i<matrix.length; i++)
		{
			 for (int j=0; j<matrix.length; j++)
			 { 
				 dest[j][n-i-1] = matrix[i][j];
			 }
		}
	    
	    for (int i=0; i<matrix.length; i++)
  		{
  			 for (int j=0; j<matrix.length; j++)
  			 { 
  				 matrix[i][j] = dest[i][j] ;
  			 }
  		}
	} 
	
	 
}