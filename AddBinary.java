package LeetCode;

	public class AddBinary {
		
		 public static void main(String args[]) throws Exception
		 {
			System.out.println(addBinary("00011", "11"));
			
		 }
		 
		 public static String addBinary(String a, String b) {
			 String result = "";
			 int carry = 0;
			 
			 int aIter = a.length() - 1;
			 int bIter = b.length() - 1;
			
			 
			 while (aIter != -1 && bIter != -1)
			 {
				 int temp1 = a.charAt(aIter) - 48;
				 int temp2 = b.charAt(bIter) - 48;
				 //System.out.println(a.charAt(aIter)-48 + " " + b.charAt(bIter)-48 );
				 //System.out.println("Hey " + temp1 + " "  + temp2);
				 
				 int digit = (carry + (a.charAt(aIter)-48) + (b.charAt(bIter)-48))%2;
				 carry = (carry + (a.charAt(aIter)-48) + (b.charAt(bIter)-48))/2;
				 result = String.valueOf(digit) + result; 
				 aIter--;
				 bIter--;
				 //System.out.println(digit + " " + carry + " " + result );
				
			 }
			 
			 while (aIter != -1 )
			 {
				 int digit = (carry + (a.charAt(aIter)-48) )%2;
				 carry = (carry + (a.charAt(aIter)-48))/2;
				 result = String.valueOf(digit) + result;
				 aIter--;
				 //System.out.println(digit + " " + carry + " " + result );
			 }
			 while (bIter != -1 )
			 {
				 int digit = (carry + (b.charAt(bIter)-48) )%2;
				 carry = (carry + (b.charAt(bIter)-48))/2;
				 result = String.valueOf(digit) + result;
				 bIter--;
				 //System.out.println(digit + " " + carry + " " + result );
			 }
			 
			 if (carry == 1)
			 {
				 result = "1" + result;
			 }
			 
			 return result;
		 }

}
