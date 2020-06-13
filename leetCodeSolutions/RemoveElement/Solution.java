class Solution {
    public int removeElement(int[] nums, int val) {
        // tracker
        int i = 0;
        
        /*
        * each time it equals, advance j; one j does not equal, copy the num at j to the num at i 
        * and move i forward
        */
        for(int j = 0; j < nums.length; ++j){
            if(nums[j] != val){
                nums[i] = nums[j];
                ++i;
            }
        }
        // i will be the size of the array
        return i;
    }
}
