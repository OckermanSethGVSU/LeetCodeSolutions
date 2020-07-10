class BruteForceSolution {
    /*
    * start with a purely brute force solution; check each number and then we will go from there
    * should be O(n^2)
    */
    public int maxProfit(int[] prices) {
        // max profit
        int max = 0;
        // go through each possible combo
        for(int i = 0; i < prices.length;++i){
            for(int j = i + 1; j < prices.length; ++j){
                // if the profit is larger than current max, assign it to max
                if(prices[j] - prices[i] > max){
                    max = prices[j] - prices[i]; 
                }
            }
        }
        return max;
    }
}
