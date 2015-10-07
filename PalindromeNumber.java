package LeetCode;

public class PalindromeNumber {
	
	 public static void main(String args[]) throws Exception
	 {
        System.out.println(isPalindrome(1221));
        System.out.println(isPalindrome(1231));
	 }
	
	 public static boolean isPalindrome(int x) {
		 String xy = String.valueOf(x);
		 int low = 0;
		 int high = xy.length() - 1; 
		 boolean isPalindrome = true;
		 
		 while (low <= high)
		 {
			 if (xy.charAt(high) != xy.charAt(low))
			 {
				 isPalindrome = false;
				 break;
			 }
			 high--;
			 low++;
		 }
		 return isPalindrome;
		 
	 }
}
