package LeetCode;

public class MaximumSubArray {

}



/**
 * Created by Samarth on 3/9/2015.
 */
public class Kadane {
    public static void main(String args[]) throws Exception
    {
        int input[] = {-8, 3, -2, 4, -10};

        System.out.println(maxSum(input));

    }

    static int maxSum(int input[])
    {
        // All are negative, return the least
        boolean allNegative = true;
        int minimum = input[0];
        for (int i=0; i<input.length; i++) {
            if (input[i] > 0) {
                allNegative = false;
                break;
            } else {
                if (input[i] < minimum) {
                    minimum = input[i];
                }
            }
        }
        if (allNegative == true)
        {
            return minimum;
        }
        else
        {
            int maxSum = 0;
            int sumEnding = 0;
            for (int i=0; i<input.length; i++)
            {
                sumEnding += input[i];
                if (sumEnding < 0)
                {
                    sumEnding = 0 ;
                }
                if (sumEnding> maxSum)
                {
                    maxSum = sumEnding;
                }
            }
            return maxSum;
        }
    }

}
