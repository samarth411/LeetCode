package LeetCode;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;
import java.text.DecimalFormat;

public class power {
	 public static void main(String[] args) throws Exception {
		 
		double x = 34.00515;
		int n = -3;
		
		
		System.out.println(myPow(x, n));
		
		
    }
	 
   public static double myPow(double x, int n) {
	   
	   if (n < 0)
	   {
		   n = -1*n;
		   //System.out.println("Hey  " + myPowUtil(x, n));
		   return 1/myPowUtil(x, n);
	   }
	   else
	   {
		   return myPowUtil(x, n);
	   }
   }
   
   public static double myPowUtil(double x, int n)
   {
	   double result = 0.0;
	   if (n == 0)
	   {
		   return 1;
	   }
	   if (n % 2 == 0)
	   {
		   double temp = myPow(x, n/2);
		   result = (temp*temp);
	   }
	   else
	   {
		   double temp = myPow(x, n/2);
		   
		   result = (temp*temp*x);

	   }
	  
	   return result;
	   
   }
	 

 
    
}




   










