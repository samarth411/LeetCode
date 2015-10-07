package LeetCode;

public class PlusOne {
	
	 public static void main(String args[]) throws Exception
	 {
		int[] a = {1,2,3,4};
		int[] b = {9,9,9};
		System.out.println(print(plusOne(a)));
		System.out.println(print(plusOne(b)));
        
	 }
	 
	 
	 private static String print(int[] arr) {
		String result = "";
		
		for (int i=0; i<arr.length; i++)
		{
			result = result + arr[i];
		
			
		}
		return result;
	}


	public static int[] plusOne(int[] digits) {
	     // check if all are 9
		boolean allNine = true;
		for (int i=0; i<digits.length; i++)
		{
			if (digits[i] != 9)
			{
				allNine = false;
				break;
			}
		}
		if (allNine == true)
		{
			int[] result = new int[digits.length+1];
			result[0] = 1;
			for (int i=1; i<result.length; i++)
			{
				result[i] = 0;
			}
			return result;
		}
		
		
		int[] result = new int[digits.length];
		int carry = 1;
		
		for (int i=result.length-1; i>=0; i--)
		{
			if (carry == 1 )
			{
				if (digits[i] == 9)
				{
					result[i] = 0;
				}
				else
				{
					result[i] = digits[i] + 1;
					carry = 0;
				}
			}
			else
			{
				result[i] = digits[i];
			}
	
		}
		
		return result;

		
	 }
	
	
}
