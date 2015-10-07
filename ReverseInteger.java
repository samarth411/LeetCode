package LeetCode;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;
import java.text.DecimalFormat;

public class ReverseInteger {
	 public static void main(String[] args) throws Exception {
        
        int A = 1234;
        
        System.out.println(reverse(A));
        
        int B = -123;
        
        System.out.println(reverse(B));
        
        
        
		
    }
	 
    public static int reverse(int n) {
    	String result = "";
    	
    	long nC = n;
    	
    	if (nC == 0)
    	{
    		result = "0";
    	}
    	
    	if (nC < 0)
    	{
    		result = result + "-";
    		
    		String temp = String.valueOf(nC);
    		temp = temp.substring(1);
    		
    		nC = Integer.parseInt(temp);

    	}
    	while (nC != 0)
    	{
    		int digit = (int) (nC % 10);
    		nC = nC/10;
    		result = result + String.valueOf(digit);
    	}
    	
    	long res = Long.parseLong(result);
    	
    	if (res < Integer.MIN_VALUE || res > Integer.MAX_VALUE)
    	{
    		res = (int) 0;
    	}
    	
    	String resString = String.valueOf(res);
    	if (res < 0 )
    	{
    		String resTemp = resString.substring(1);
    		int i=0;
    		for ( i=0; i<resTemp.length(); i++)
    		{
    			if (resTemp.charAt(i) != '0')
    			{
    				break;
    			}
    		}
    		resTemp = resTemp.substring(i);
    		
    		resString = "-"+ resTemp;
    	}
    	else if (res > 0)
    	{
    		int i=0;
    		for ( i=0; i<resString.length(); i++)
    		{
    			if (resString.charAt(i) != '0')
    			{
    				break;
    			}
    		}
    		resString = resString.substring(i);
    	}
    	else
    	{
    		resString = "0";
    	}
    	
    	
    	
    	return Integer.parseInt(resString);
    }
    
    
}




   










