package LeetCode;

import java.io.IOException;

public class LongestCommonPrefix {
    public static void main(String[] args) throws IOException {
    	
    	String[] strs = new String[2];
    	//strs[0] = "samarth";
    	//strs[1] = "sam";
    	//strs[2] = "sa";
    	
    	strs[0] = "a";
    	strs[1] = "b";
    	
    	System.out.println(longestCommonPrefix(strs));
    	
    }
    
    public static String longestCommonPrefix(String[] strs) {    	
	    	
    	int minLength = Integer.MAX_VALUE;
    	String minLengthString = "";
    	for (int i=0; i< strs.length; i++)
    	{
    		minLength = Math.min(minLength, strs[i].length());
    		minLengthString = strs[i];
    	}
    	
    	//System.out.println(minLengthString);
    	
    	boolean breakString = false;
    	
    	int i;
    	for (i=0; i< minLength; i++)
    	{
    		//System.out.println("Hell " + minLengthString.charAt(i));
    		
    		for (int j=0; j< strs.length; j++)
    		{
    			if (minLengthString.charAt(i) != strs[j].charAt(i))
    			{
    				//System.out.println(minLengthString.charAt(i) + " Hey " + strs[j].charAt(i) );
    				breakString = true;
    				break;
    			}
    		}
    		if (breakString)
    		{
    			break;
    		}
    	}
    	//System.out.println("Print i " + i);
    	
    	i = i - 1;
    	if (i == -1)
    	{
    		return "";
    	}
		return minLengthString.substring(0, i+1);
    }
}

