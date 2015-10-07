package LeetCode;

import java.io.IOException;
import java.util.*;

/**
 * Created by Samarth on 3/22/2015.
 */
public class MoveZeroes {
    public static void main(String[] args) throws IOException {
    	
    	int a[] = new int[]{0,1,0,3,2};
    	
    	moveZeroes(a);
    	
    	for (int i=0; i<a.length; i++)
    	{
    		System.out.print(a[i]);
    	}
    }
    
    
    public static void moveZeroes(int[] nums) {
    	int slowIter = 0;
    	int fastIter = 0;
    	
    	while (fastIter < nums.length)
    	{
    		if (nums[slowIter] != 0 && nums[fastIter] != 0)
    		{
    			slowIter++;
    			fastIter++;
    		}
    		else if (nums[fastIter] == 0)    	
    		{
    			fastIter++;
    		}
    		else
    		{
    			//swap slow iter and fast iter
        		int temp = nums[slowIter];
        		nums[slowIter] = nums[fastIter];
        		nums[fastIter] = temp;
        		slowIter++;
    			fastIter++;
    		}    		
    	}
    }
}
