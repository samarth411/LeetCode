package LeetCode;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;
import java.text.DecimalFormat;

public class GrayCode {
	 public static void main(String[] args) throws Exception {

        
        int n =3 ;
        List<Integer> res =  grayCode( n);
        
        for (int i: res)
        {
        	System.out.print(i + " ");
        }
        
		
    }
	 
   public static List<Integer> grayCode(int n) {
	   List<Integer> res = new ArrayList<Integer>();
	   List<String> numStrings= grayCodeUtil(n);
	   
	   for (String temp : numStrings)
	   {
		  // System.out.println("Result " + temp);
		   int value = getIntValue(temp);
		   res.add(value);
	   }
	   
	   return res;
	   
	        
	 }
   
   public static int getIntValue(String num)
   {
	   //System.out.println("Number is " + num);
	   int mult = 1;
	   int value = 0;
	   for (int i=num.length()-1; i>=0; i--)
	   {
		   int digit = num.charAt(i) - 48;
		   
		   //System.out.println("digit is " + digit);
		   
		   
		   value = value + digit*mult;
		   
		   mult = mult*2;
	   }
	   
	   return value;
   }
   
   public static List<String> grayCodeUtil(int n)
   {
	   List<String> result = new ArrayList<String>();
	   if (n == 0)
	   {
		   result.add("0");
		   return result;
	   }
	   if (n == 1)
	   {
		   result.add("0");
		   result.add("1");
	   }
	   else
	   {
		   List<String> forwardResult = grayCodeUtil(n-1);
		   List<String> reverseResult = new ArrayList<String>(forwardResult);
		   
		   Collections.reverse(reverseResult);
		   
		   List<String> forMod = new ArrayList<String>();
		   List<String> revMod = new ArrayList<String>();
		   
		   for (String f : forwardResult)
		   {
			   String temp = "0" + f;
			   forMod.add(temp);
		   }
		   for (String f : reverseResult)
		   {
			   String temp = "1" + f;
			   revMod.add(temp);
		   }
		   
		   result.addAll(forMod);
		   result.addAll(revMod);
		   
	   }
	   
	   return result;
	   
   }
	 
    	
}




   










