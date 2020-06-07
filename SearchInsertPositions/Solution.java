class Solution {
    public int searchInsert(int[] nums, int target) {
        // index to insert if there is no perfect match
        int indTarget = 0;
        
        // loop to check where it should fall
        for(int i = 0; i < nums.length; ++i){
            // if perfect match, return and end operation
            if(nums[i] == target){
                return i;
            }
            // see if target is greater than then number, it needs to be put after the last one it is greater than
            // increment index until the num[i]  > target
            else{
                if(target > nums[i]) ++indTarget; 
            }
       }
        return indTarget;
    }
}
