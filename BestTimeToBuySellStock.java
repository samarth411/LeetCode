package LeetCode;


public class BestTimeToBuySellStock {
	
	 public static void main(String args[]) throws Exception
	 {
		 
		int a[] = new int[]{100, 180, 260, 310, 40, 535, 695};
		
        System.out.println(maxProfit(a));

	 }
	 
	 
	 
  public static int maxProfit(int[] prices) {
	
	 if (prices.length == 0)
	 {
		 return 0;
	 }
	  
	
    int minimum = prices[0];
    int maximum = Integer.MIN_VALUE;
    
    boolean findLocalMin = true;
    boolean findLocalMax = false;
    
    int maxProfit = 0;
	  
	for (int i=1; i<prices.length; i++)
  	{
		//System.out.println("hahahahaha prices element " + prices[i]);
		
		if (findLocalMin)
		{
			if (prices[i] < minimum )
	  		{
				//System.out.println("prices element " + prices[i]);
				//System.out.println("minimum " + minimum);
	  			minimum = prices[i];
	  		}
			else
			{ 
				i = i - 1;
				//System.out.println("Minimum found " + minimum);
				//Minimum has been found
				findLocalMin = false;
				findLocalMax = true;
			}
		}
		else if (findLocalMax)
		{
			if (prices[i] > maximum )
	  		{
	  			maximum = prices[i];
	  			
	  			if (i == (prices.length - 1))
	  			{
	  				//System.out.println("maximum found " + maximum);
	  				//Maximum has been found
					findLocalMin = true;
					findLocalMax = false;
					maxProfit += (maximum - minimum);
					minimum = Integer.MAX_VALUE;
				    maximum = Integer.MIN_VALUE;
	  			}
	  				
	  			
	  		}
			else
			{
				i = i - 1;
				//System.out.println("maximum found " + maximum);
				//Maximum has been found
				findLocalMin = true;
				findLocalMax = false;
				maxProfit += (maximum - minimum);
				
				minimum = Integer.MAX_VALUE;
			    maximum = Integer.MIN_VALUE;
				
			}
		}
  	}
	
	return maxProfit;
	  
  }
	  
}