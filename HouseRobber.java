package LeetCode;


public class HouseRobber {
	
	 public static void main(String args[]) throws Exception
	 {
		
		int a[] = new int[] {104,209,137,52,158,67,213,86,141,110,151,127,238,147,169,138,240,185,246,225,147,203,83,83,131,227,54,78,165,180,214,151,111,161,233,147,124,143};
		//int a[] = new int[] {1, 2, 3, 4};
        System.out.println(rob(a));
	 }
	 
	 
	public static int rob(int[] nums) {
		if (nums.length == 0)
		{
			return 0;
		}
		if (nums.length == 1)
		{
			return nums[0];
		}
	    int start = 0;
	    int[] maxProfit = new int[nums.length];
	    
	    for (int i=0; i<maxProfit.length; i++)
	    {
	    	maxProfit[i] = -1;
	    }
	    
		return robUtil(nums, start, maxProfit);
	}
	
	public static int robUtil(int[] nums, int start, int[] maxProfit) {
		if (start > (nums.length-1))
		{
			return 0;
		}
		if (maxProfit[start] != -1)
		{
			return maxProfit[start];
		}
		
		if (start == (nums.length - 1))
		{
			maxProfit[start] = nums[start];
			return nums[start];
		}
		
		if (start == (nums.length - 2))
		{
			maxProfit[start] = Math.max(nums[nums.length-2], nums[nums.length-1]);
			return maxProfit[start];
		}
		else
		{
			//System.out.println("start " + start );
			int value1 = nums[start] + robUtil(nums, start+2, maxProfit);
			int value2 = nums[start+1] + robUtil(nums, start+3, maxProfit);
			maxProfit[start] = Math.max(value1, value2);
			
			return maxProfit[start];
		}
	}
	 
}