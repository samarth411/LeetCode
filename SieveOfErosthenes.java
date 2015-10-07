package LeetCode;

public class SieveOfErosthenes {

	 public static void main(String[] args) throws Exception {

        int n = 7;
        System.out.println(countPrimes(n));
			
	}
	 	 
	 public static int countPrimes(int n) {
	     boolean[] primes = new boolean[n];	 
	     
	     for (int i=2; i<n ; i++)
	     {
	    	 primes[i] = true;
	     }
	     
	     for (int i=2; i<= (Math.sqrt(n)); i++)
	     {
	    	 if (primes[i])
	    	 {
	    		 markPrimes(i,n, primes);
	    	 }
	     }
	     
	     int count = 0;
	     
	     for (int i=2; i<n ; i++)
	     {
	    	  if (primes[i])
	    	  {
	    		  count++;
	    	  }
	     }
	     
	     return count;
	     
		 
	 }
	 
	 public static void markPrimes(int i, int n, boolean[] primes) 
	 {
		 int num = i*i;
		 while (num < n)
		 {
			 primes[num] = false;
			 num += i;
		 }
	 }
	 
	 
	 
	 
	 
}
