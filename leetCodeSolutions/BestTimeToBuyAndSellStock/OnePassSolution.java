class OnePassSolution {
    /*
    * One pass solution. Find the min number followed by the highest following peak
    * The idea here is to see if prices[n] is less than the current min, otherwise, just check if the 
    * the profit with the current min is more than the current max
    */
    public int maxProfit(int[] prices) {
        // put it at max possible number so I handle execeptions
        int minPrice = Integer.MAX_VALUE;
        // var to handle profit
        int maxProfit = 0;
        // go through each number
        for(int i = 0; i < prices.length; ++i){
            // if the num at price[i] is less than current min, assign it
            if(minPrice > prices[i] ){
                minPrice = prices[i];
            }
            // otherwise just check if the profit with current min exceeds current max
            else if(prices[i] - minPrice > maxProfit){
                maxProfit = prices[i] - minPrice;
            }
        }
        return maxProfit;
    }
}
