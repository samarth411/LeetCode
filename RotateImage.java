package LeetCode;


public class RotateImage {
	
	 public static void main(String args[]) throws Exception
	 {
		int[][] image = new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		
		//Rotate image
		 rotate(image);
		 
		 for (int i=0; i<image.length; i++)
		 {
			 for (int j=0; j<image.length; j++)
			 { 
				 System.out.print(image[i][j]);
			 }
		 }
		
	 }
	 
	 
	public static void rotate(int[][] matrix) {
	    int n = matrix.length;
	    int[][] dest = new int[n][n];
	    
	    for (int i=0; i<matrix.length; i++)
		{
			 for (int j=0; j<matrix.length; j++)
			 { 
				 dest[j][n-i-1] = matrix[i][j];
			 }
		}
	    
	    for (int i=0; i<matrix.length; i++)
  		{
  			 for (int j=0; j<matrix.length; j++)
  			 { 
  				 matrix[i][j] = dest[i][j] ;
  			 }
  		}
	} 
	
	 
}