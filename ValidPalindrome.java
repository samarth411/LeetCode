package LeetCode;

	public class ValidPalindrome {
		
		 public static void main(String args[]) throws Exception
		 {
			 
			 System.out.println(isPalindrome("mam"));
			 System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
			 System.out.println(isPalindrome("race a car"));
		 }
		 
		 public static boolean isPalindrome(String s) {
			 
			 boolean isPalindrome = true;
			 int start = 0;
			 int end = s.length() - 1;
			 
			 s = s.toLowerCase();
			 
			 while (start < end)
			 {
				 //System.out.println("Wassup 1");
				 
				 
				 
				 if (!Character.isLetterOrDigit(s.charAt(start)))
				 {
					 start++;
				 }
				 else if (!Character.isLetterOrDigit(s.charAt(end)))
				 {
					 end--;
				 }
				 else
				 {
					 //System.out.println("Wassup 2");
					 if (!(s.charAt(start) == s.charAt(end)))
					 {
						 //System.out.println(s.charAt(start)+ " " + s.charAt(end));
						 isPalindrome = false;
						 break;
					 }
					 start++;
					 end--;
				 }
			 }
			 return isPalindrome;
		 }
		 
		
}
