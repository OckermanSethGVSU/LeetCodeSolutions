class Solution {
    /**
    @param n the number of steps in the stair case
    * This is a slight switch from the brute force approach of trying every combination at each step
    * In this approach, it tries it, but only if it has not been tried before to store it in an array;       
    * if it has been tried before, it returns the known value from the array
    * this should be O(n)
    **/
    public int climbStairs(int n) {
        // create an array to hold each possibilty on each step
        int[] memo = new int[n];
        return numberOfWays(0,n,memo);
    }
    /**
    @param i the current step we are on
    @param n the number of total steps to traverse
    @param memo the array with already computed values
    **/
    
    public int numberOfWays(int i, int n,int[] memo){
        // if we are past the final step, there are no steps left to take 
        if (i > n) return 0;
        
        // if we are on the final step, we can only take one more step
        if (i == n) return 1;
        
        // if the value at the current step is known (not 0) return it to avoid recalculating
        if(memo[i] > 0) return memo[i];
        
        // if it is not known, find it recurisvely and store it 
        memo[i] = numberOfWays(i + 1,n, memo) + numberOfWays(i + 2,n,memo);
        
        // return the value of this step 
        return memo[i];
    }
}
