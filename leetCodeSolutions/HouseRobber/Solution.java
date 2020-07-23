class Solution {
    // use dynamic programming for speed
    // solution will compare different possible totals at each step of the way 
    // and chose max. Will be O(n)
    public int rob(int[] nums) {
        // handle exceptions
        if(nums.length == 0 || nums == null) return 0;
        if(nums.length == 1) return nums[0];
        
        // create an array to hold potential totals at each step
        int[] runningTotal = new int[nums.length];
        
        // put first two elements into the array; they always need to be considered
        // to start the algorithm
        runningTotal[0] = nums[0];
        runningTotal[1] = Math.max(nums[0],nums[1]);
        
        // at each element, the running total is equal to the max of the running
        // total two steps ago + the current house or the running total from one 
        // step ago
        for(int i = 2; i < nums.length; i++){
            runningTotal[i] = Math.max(runningTotal[i -1],(runningTotal[i-2] + nums[i]));
        }
        
        // return result
        return runningTotal[nums.length -1];
    
       
    }
    
}
