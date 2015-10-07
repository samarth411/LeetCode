package LeetCode;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;
import java.text.DecimalFormat;

public class WordBreak2 {
	 public static void main(String[] args) throws Exception {
		 
		String s = "catsanddog";
		 
		
		Set<String> dict = new HashSet<String>();
        
		dict.add("cat");
		dict.add("cats");
		dict.add("and");
		dict.add("sand");
		dict.add("dog");
		
		System.out.println(wordBreak(s, dict));
		
		
    }
	 
   public static List<String> wordBreak(String s, Set<String> wordDict) {
	    Map<String, List<String>> result = new HashMap<String, List<String>>();
	    return wordBreakUtil(s, wordDict, result);
   }
   
   public static List<String> wordBreakUtil(String s, Set<String> wordDict, Map<String, List<String>> result) {
	    List<String> ress= result.get(s);
	    if (ress != null)
	    {
	    	return ress;
	    }
	    
	    if (s.length() == 0)
	    {
	    	return new ArrayList<String>();
	    }
	    List<String> resultList = new ArrayList<String>();
	    for (int i=0; i<s.length(); i++)
	    {
	    	String first = s.substring(0, i+1);
	    	
	    	if (wordDict.contains(first))
	    	{
	    		List<String> tempResult = wordBreakUtil(s.substring(i+1), wordDict, result);
	    		
	    		if (tempResult.isEmpty())
	    		{
	    			resultList.add(first);
	    		}
	    		else
	    		{
	    			for (String temp: tempResult)
		    		{
		    			//System.out.println("Hey2 " + first);
		    			String tem = first + " " + temp;
		    			resultList.add(tem);
		    		}
	    		}
	    		
	    		
	    	
	    	}
	    	
	    }
	    result.put(s, resultList);
	    return resultList;
  }
  
   
   
	 
    
}




   










