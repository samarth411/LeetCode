package LeetCode;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;
import java.text.DecimalFormat;

public class sqrt {
	 public static void main(String[] args) throws Exception {
        
        int A = 100;
        
        System.out.println(sqrtt(A));
        
        int B = -100;
        
        System.out.println(sqrtt(B));
		
    }
	 
    public static int sqrtt(int n) {
    	
    	if (n == 1)
    		return 1;
    	if (n == -1)
    		return -1;
    	if (n == 0)
    		return 0;
    	
    	boolean isNegative = false;
    	if (n < 0)
    	{
    		isNegative = true;
    	}
    	
    	if (isNegative)
    	{
    		n = -1*n;
    	}
    	
    	int low = 0;
    	int high = n;
    	
    	while (low <= high)
    	{
    		int mid = low + (high - low)/2;
    		
    		long inter = (long)mid*(long)mid;
    		
    		if (inter > n )
    		{
    			high = mid-1;
    		}
    		else if (inter < n)
    		{
    			long inter2 = (long)(mid+1)*(long)(mid+1);
    			if (inter2 >n )
    			{
    				return (mid);
    			}
    			else
    			{
    				low = mid + 1;
    			}
    		}
    		else
    		{
    			if (isNegative)
    			{
    				mid = -1*mid;
    			}
    			return mid;
    		}
    	}
    	
    	
    	return -1;
    	
    }
    
    
}




   










