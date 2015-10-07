package LeetCode;

import java.util.*;

public class GroupAnagrams {
	
	public static void main(String[] args)
    {
		String[] input = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
		List<List<String>> anagrams = groupAnagrams(input) ;
		
		System.out.println(anagrams.size());
		
		for (List<String> anagram : anagrams)
		{
			for (String l : anagram)
			{
				System.out.print(l);
			}
			System.out.println();
		}
		
			
				
		
    }


public static List<List<String>> groupAnagrams(String[] strs) {
   Map<String, List<String>> map = new HashMap<String, List<String>>();
   List<List<String>> anagrams = new ArrayList<List<String>>();
   
   Arrays.sort(strs);
   
   for (int i=0; i<strs.length; i++)
   {
	   char[] sorted = strs[i].toCharArray();
	   Arrays.sort(sorted);
	   
	   StringBuilder sb = new StringBuilder(sorted.length);
       for (char c : sorted) sb.append(c);
       String s = sb.toString();
	   
	  // System.out.println(s);
	   
	   if (map.containsKey(s))
	   {
		  //Add to the list
		   List<String> l = map.get(s);
		   l.add(strs[i]);
	   }
	   else
	   {
		   List<String> l = new ArrayList<String>();
		   l.add(strs[i]);
		   map.put(s, l);
	   }
   }
   
   //System.out.println(map.keySet().size());
   
   for (String key : map.keySet())
   {
	   anagrams.add(map.get(key));
   }
   
   return anagrams;
        
}
    


static boolean areAnagrams2(String s1, String s2) {

    Character[] s1Array = new Character[s1.length()];
    for (int i = 0; i < s1Array.length; i++)
        s1Array[i] = s1.charAt(i);

    Character[] s2Array = new Character[s2.length()];
    for (int i = 0; i < s2Array.length; i++)
        s2Array[i] = s2.charAt(i);



    Arrays.sort(s1Array, new IgnoreCaseComparator2());
    Arrays.sort(s2Array, new IgnoreCaseComparator2());

    StringBuilder sb = new StringBuilder(s1Array.length);
    for (char c : s1Array) sb.append(c);
    String str1 = sb.toString();

    StringBuilder sb2 = new StringBuilder(s2Array.length);
    for (char c : s2Array) sb2.append(c);
    String str2 = sb2.toString();


    if (str1.compareToIgnoreCase(str2) == 0 )
    {
        return true;
    }
    else
    {
        return false;
    }

}


}


class IgnoreCaseComparator2 implements Comparator<Character>
{
public int compare(Character c1, Character c2)
{
    int cmp = Character.compare(Character.toLowerCase(c1.charValue()), Character.toLowerCase(c2.charValue()));
    return cmp;
}
}