class Solution {
    public int removeDuplicates(int[] nums) {
        /*
        * General idea: using two pointers
        * move until j doesn't match i, then replace i + 1 with j
        * i will also serve as a size tracker though it will be one short b/c zero index
        */
        
        // empty list exception
        if(nums.length == 0) return 0;
        
        // pointers to detect duplicates
        int i = 0;
        int j = 1;
        
        // go through the list and replace duplicates
        for(j = 1; j < nums.length; ++j){
            if(nums[i] != nums[j]){
                // move i forward one to replace duplicate
                ++i;
                nums[i] = nums[j]; 
                
            }
        }
        // i will be one short of size; add one
        return i + 1;
        
    }
}
