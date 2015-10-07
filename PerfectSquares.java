package LeetCode;

public class PerfectSquares {
	
	 public static void main(String args[]) throws Exception
	 {
		System.out.println(numSquares(47));
		System.out.println(numSquares(13));
	 }
	 
	 public static int numSquares(int n) {
		 int[] arr = new int[n+1];
		 for (int i=0; i<arr.length; i++)
		 {
			 arr[i] = Integer.MAX_VALUE;
		 }
		 
		 for (int i=0; i<=n; i++)
		 {
			 int j = 1;
			 while (n - i*i)
			 
		 }
		 
		 return numSquares(n, arr);
	 }
	 
	 public static int numSquares(int n, int[] arr) {
		//System.out.println("Calling numSquares " + n);
		 int count = Integer.MAX_VALUE;
		 int i = 1 ;
		 if (n == 0)
		 {
			 return 0;
		 }
		 
		 if (arr[n] != -1)
		 {
			 return arr[n];
		 }
		 
		 while ((n - i*i) >= 0)
		 {
			 int temp = numSquares(n - i*i) + 1;
			 if (temp < count)
			 {
				 count = temp;
			 }
			 i = i + 1;
		 }
		 arr[n] = count;
		 return count; 
	 }

	
}
