package LeetCode;

public class MinimumPathSum {
	
	 public static void main(String[] args) throws Exception {

        int arr[] = {1, 3, 20, 4, 1, 0};
        
        System.out.println(findElement(arr));

	    }

	 public static int minPathSum(int[][] grid) {
	        int[][] sum = new int[grid.length][grid[0].length];
	        
	        for (int i=0; i<grid.length; i++)
			{
	        	sum[i][0] = grid[i][0];
			}
	        
	        for (int j=0; j<grid.length; j++)
			{
	        	sum[0][j] = grid[0][j];
			}
	        
	        return sumUtil(grid, sum);
	        
	        
	 }
	 
	 
	 public static int sumUtil(int[][] grid, int[][] sum) {
		 for (int i=1; i<grid.length; i++)
		 {
			 for (int j=1; j<grid[0].length; j++)
			 {
				 sum[i][j] = grid[i][j] +  Math.min(sum[i-1][j], sum[i][j-1]);
			 }
		 }
		 
		 return sum[grid.length-1][ grid[0].length-1];
	 }
	
}
