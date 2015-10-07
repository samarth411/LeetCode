package LeetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class PermutationsInteger {

    public static void main(String args[]) throws Exception
    {
        int[] nums = new int[]{1,2};
    	
        List<List<Integer>> perms = permute(nums);

        printPermutations(perms);
        
    }
    
    public static List<List<Integer>> permute(int[] nums) {
    	
    	int ite = 0;
    	return getPermutations(nums, ite);
    	
    }
    
    public static List<List<Integer>> getPermutations(int[] nums, int ite) {
    	List<List<Integer>> perms = new ArrayList<List<Integer>>();
    	
    	if (ite == (nums.length - 1))
    	{
    		List<Integer> perm = new ArrayList<Integer>();
    		perm.add(nums[ite]);
    		perms.add(perm);
    	}
    	else
    	{
    		List<List<Integer>> permsRecur = getPermutations(nums, ite+1); 
    		for (List<Integer> perm : permsRecur)
    		{
    			// Insert nums[ite] at every position of the permutation
    			List<Integer> permNew = new ArrayList<Integer>();
    			permNew.add(nums[ite]);
    			permNew.addAll(perm);
    			perms.add(permNew);
    			
    			permNew = new ArrayList<Integer>();
    			for (int i=1; i<=perm.size(); i++)
    			{
    				permNew.addAll(perm.subList(0, i));
    				permNew.add(nums[ite]);
    				if (i != perm.size())
    				{
    					permNew.addAll(perm.subList(i, perm.size()));
    				}
    			}
    			perms.add(permNew);
    			
    		}
    	}
    	
    	return perms;
    	
    }

    static void printPermutations(List<List<Integer>> perms)
    {
    	//System.out.println("Size first " + perms.size());
    	for (List<Integer> perm : perms)
		{
    		//System.out.println("Size second " + perms.size());
    		System.out.println();
    		for (Integer i: perm)
    		{
    			System.out.print(i + " ");
    		}	
		}
    }
}
