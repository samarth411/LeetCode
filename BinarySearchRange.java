package LeetCode;

	public class BinarySearchRange {
		
		 public static void main(String args[]) throws Exception
		 {
			  int[] nums = {5, 7, 7, 8, 8, 10};
		       
			   int [] result =  searchRange(nums, 8) ;
			  
			   System.out.println(result[0] + " " + result[1]);
			   
			   result =  searchRange(nums, 7) ;
			   
			   System.out.println(result[0] + " " + result[1]);
			   
			   result =  searchRange(nums, 11) ;
			   
			   System.out.println(result[0] + " " + result[1]);
			   
			   int[] n = {2, 2};
			   result =  searchRange(n, 2) ;
			   System.out.println(result[0] + " " + result[1]);
		       
		 }
		 
		 
		 public static int[] searchRange(int[] nums, int target) {
			 int start = binarySearchStart(nums,  target,  0,  nums.length-1);
			 int end = binarySearchEnd(nums,  target,  0,  nums.length-1);
			 
			 int[] result = new int[2];
			 result[0] = start;
			 result[1] = end;
			 
			 return result;
			 
		 }
		 
		 public static int binarySearchStart(int[] nums, int target, int low, int high) {  
			   if (low > high)
			   {
				   return -1;
			   }
			   int mid = low + (high - low)/2 ;
			   if (nums[mid] == target)
			   {
				   if (mid == low)
				   {
					   return low;
				   }
				   else if (nums[mid-1] < target)
				   {
					   return mid;
				   }
				   else
				   {
					   return binarySearchStart(nums, target, low, mid-1); 
				   }
			   }
			   if (nums[mid] > target)
			   {
				   return binarySearchStart(nums, target, low, mid-1); 
			   }
			   else
			   {
				   return binarySearchStart(nums, target, mid+1, high);
			   }
		   }
		 
		 public static int binarySearchEnd(int[] nums, int target, int low, int high) {  
			   if (low > high)
			   {
				   return -1;
			   }
			   int mid = low + (high - low)/2 ;
			   if (nums[mid] == target)
			   {
				   if (mid == high)
				   {
					   return mid;
				   }
				   else if (nums[mid+1] > target)
				   {
					   return mid;
				   }
				   else
				   {
					   return binarySearchEnd(nums, target, mid+1, high); 
				   }
			   }
			   if (nums[mid] > target)
			   {
				   return binarySearchEnd(nums, target, low, mid-1); 
			   }
			   else
			   {
				   return binarySearchEnd(nums, target, mid+1, high);
			   }
		   }

}
