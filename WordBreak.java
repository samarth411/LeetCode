package LeetCode;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;
import java.text.DecimalFormat;

public class WordBreak {
	 public static void main(String[] args) throws Exception {
		 
		String s = "aaaaaaa";
		
		Set<String> dict = new HashSet<String>();
        
		dict.add("aaaa");
		dict.add("aaa");
		
		System.out.println(wordBreak(s, dict));
		System.out.println(wordBreak("hh", dict));
		
		
    }
	 
   public static boolean wordBreak(String s, Set<String> wordDict) {
	    Map<String, Boolean> result = new HashMap<String, Boolean>();
	    return wordBreakUtil(s, wordDict, result);
   }
   
   public static boolean wordBreakUtil(String s, Set<String> wordDict, Map<String, Boolean> result) {
	    if (result.get(s) != null)
	    {
	    	return result.get(s);
	    }
	    
	    if (s.length() == 0)
	    {
	    	return true;
	    }
	    for (int i=0; i<s.length(); i++)
	    {
	    	String first = s.substring(0, i+1);
	    	
	    	if (wordDict.contains(first))
	    	{
	    		//System.out.println("Reached here " + first);
	    		if ( wordBreakUtil(s.substring(i+1), wordDict, result) == true)
	    		{
	    			result.put(s.substring(i+1), true);
	    			return result.get(s.substring(i+1));
	    		}
	    	}
	    	
	    }
	    result.put(s, false);
	    return result.get(s);
  }
  
   
   
	 
    
}




   










