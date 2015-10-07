package LeetCode;


public class BestTimeToBuySellStock2 {
	
	 public static void main(String args[]) throws Exception
	 {
		 
		int a[] = new int[]{100, 180, 260, 310, 40, 535, 695};
		
        System.out.println(maxProfit(a));

	 }
	 
	 
	 
  public static int maxProfit(int[] prices) {
	  
    int minimum = Integer.MAX_VALUE;
	int maxDifference = 0;
	  
	for (int i=0; i<prices.length; i++)
  	{
  		if (prices[i] < minimum )
  		{
  			minimum = prices[i];
  		}
  		if ((prices[i] - minimum) > maxDifference)
  		{
  			maxDifference = (prices[i] - minimum);
  		}
  	}
	
	return maxDifference;
	  
  }
	  
}