class Solution {
    public int arrangeCoins(int n) {
        // how many rows can it go
        int rows = 0;
        
        // run until all coins have been considered
        for(int i = 1; i <= n; ++i){
            
            // if there are enough coins for the curret row, add 1 to possible rows and subtract the nessarry coins
            if(n >= i){
                ++rows;
                n -= i;
            }
        }
        return rows;
    }
}
