package LeetCode;


import java.util.*;

public class TwoSum {
	
	 public static void main(String args[]) throws Exception
	 {
		int[] arr = new int[]{0, 4, 3, 0};
		int[] indices = twoSum(arr, 0);
		
		System.out.println(indices[0] + " " + indices[1]);
		
		
	 }
	 
	 public static int[] twoSum(int[] nums, int target) {
		 Map<Integer, Integer> dict = new HashMap<Integer, Integer>();
		 int[] arr = new int[2];
		 
		 for (int i=0; i<nums.length; i++)
		 {
			 if (dict.containsKey(nums[i]))
			 {
				 int index1 = dict.get(nums[i]);
				 int index2 = i+1;
				 arr[0] = index1;
				 arr[1] = index2;
			 }
			 else
			 {
				 dict.put(target - nums[i], i+1);
			 }
		 }
		 
		 return arr;
	 }
		 
		 /*
		 
		 
		 int[] copy = new int[nums.length];
		 wrapper[] wrapp = new wrapper[nums.length];
		 
		 for (int i=0; i<nums.length; i++)
		 {
			 wrapper wrap = new wrapper(i, nums[i]);
			 wrapp[i] = wrap;
		 }
		 
		 Arrays.sort(wrapp, new WrapperComparator());
		 int low = 0;
		 int high = nums.length - 1;
		 int[] arr = new int[2];
		 while (low < high)
		 {
			 if ((wrapp[low].value + wrapp[high].value) > target)
			 {
				 high--;
			 }
			 else if ((wrapp[low].value + wrapp[high].value) < target)
			 {
				 low++;
			 } 
			 else
			 {
				 //System.out.print(low + " " + high);
				 // find low in original
				 /*int temp = 0;
				 for( int i=0; i<nums.length; i++)
				 {
					 if (nums[i] == copy[low])
					 {
						 temp = i;
						 break;
					 }
				 }
				 arr[0] = temp + 1;
				 
				 temp = 0;
				 for( int i=0; i<nums.length; i++)
				 {
					 if (nums[i] == copy[high])
					 {
						 temp = i;
						 break;
					 }
				 }
				 arr[1] = temp + 1;
				 
				 arr[0] = wrapp[low].index + 1;
				 arr[1] = wrapp[high].index + 1;
				 
				 int min = Math.min(arr[0], arr[1]);
				 int max = Math.max(arr[0], arr[1]);
				 
				 arr[0] = min;
				 arr[1] = max;
				 return arr;
			 }
		 }
		 return arr;
	 }  */
	 
	 
	
	  
		

	
}

class WrapperComparator implements Comparator<wrapper>
{
    public int compare(wrapper h1, wrapper h2)
    {
    	int cmp = 0;
    	
    	if (h1.value < h2.value)
    	{
    		return -1;
    	}
    	if (h1.value > h2.value)
    	{
    		return 1;
    	}
    	else
    	{
    		if (h1.index < h2.index)
	     	{
	     		return -1;
	     	}
	     	if (h1.index > h2.index)
	     	{
	     		return 1;
	     	}
    	}
    	
    	return cmp;
    }
}

	 
 class wrapper {
     public int value;
     public int index;
     public wrapper(int index, int value)
     {
         this.index = index;
     	 this.value = value;
     }
 }
