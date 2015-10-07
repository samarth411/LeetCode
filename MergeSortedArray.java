package LeetCode;

	public class MergeSortedArray {
		
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
		 
		 public void merge(int[] nums1, int m, int[] nums2, int n) 
		 {
			 int resultIndex = m + n - 1;
			 
			 while (m >=1 && n >=1)
			 {
				 if (nums1[m-1] >= nums2[n-1])
				 {
					 nums1[resultIndex] = nums1[m-1];
					 m--;
				 }
				 else
				 {
					 nums1[resultIndex] = nums1[n-1];
					 n--;
				 }
				 resultIndex--;
			 }
			 
			 while (m >=1)
			 {
				 nums1[resultIndex] = nums1[m-1];
				 m--;
				 resultIndex--;
			 }
			 while (n >=1)
			 {
				 System.out.println("Reached here man !!! ");
				 nums1[resultIndex] = nums1[n-1];
				 n--;
				 resultIndex--;
			 }	 
		 }
		 
		

}
