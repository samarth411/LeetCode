package LeetCode;


public class PowerOfTwo {
	
	 public static void main(String args[]) throws Exception
	 {
        System.out.println(isPowerOfTwo(2));
        System.out.println(isPowerOfTwo(8));

	 }
	 
	 public static boolean isPowerOfTwo(int n) {
        if (n == 0)
        {
        	return false;
        }
        else
        {
            if ( (n & (n-1)) == 0)
            {
            	return true;
            }
            else
            {
            	return false;
            }
        }
	        
	 }
	 
	 
}