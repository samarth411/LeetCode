package LeetCode;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;
import java.text.DecimalFormat;

public class ReverseWords {
	 public static void main(String[] args) throws Exception {
       String s = "    a     b     ";       
       System.out.println(reverseWords(s));
    }
	 
	
   public static String reverseWords(String s) {
	   String result = "";
	   String resultTemp = "";
	   String[] words = s.split(" ");
	   
	  
	   
	   System.out.println(words.length);
	   
	   for (int i=words.length-1; i>=0; i-- )
	   {
		   if (!words[i].equals(" "))
		   {
			   //StringBuffer a = new StringBuffer(words[i]);
			   //String r = new String(a.reverse());
			   if (i == 0 )
			   {
				   result = result + words[i].trim(); 
			   }
			   else
			   {
				   result = result + words[i].trim() + " ";
				   
			   }
		   }
		  
		   
	   }
	   return result.trim();
	   
	   
   }
	
    	
}




   










