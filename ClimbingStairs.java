package LeetCode;


public class ClimbingStairs {
	
	 public static void main(String args[]) throws Exception
	 {
        System.out.println(climbStairs(44));

	 }
	 
    public static int climbStairs(int n) {
    	int[] arr = new int[n+1];
    	
    	for (int i=0; i<=n; i++)
    	{
    		arr[i] = -1;
    	}
    	return climbStairsUtil(n, arr);
	}
    
    public static int climbStairsUtil(int n, int[] arr) {
    	if (n == 0)
    	{
    		return 1;
    	}
    	if (n < 0)
    	{
    		return 0;
    	}
    	
    	if (arr[n] != -1)
    	{
    		return arr[n];
    	}
    	else
    	{
    		int temp1 = climbStairsUtil(n-1, arr);
    		int temp2 = climbStairsUtil(n-2, arr);
    		arr[n] = temp1 + temp2;
    	}
    	
    	return arr[n];
	}
	 
	 
}