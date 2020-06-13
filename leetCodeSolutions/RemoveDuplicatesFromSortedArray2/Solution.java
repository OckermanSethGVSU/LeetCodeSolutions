class Solution {
    public int removeDuplicates(int[] nums) {
        // zero/one length exception
        if(nums.length <= 1) return nums.length;
        
        // tracker for size and current index
        int i = 0;
        
        /*
        * for the first two elements, just advance by incrementing i; at the start they are at the same index's
        * after that only enter if the value at x does not equal the value two behind
        * if they equal, i is not incremented while x moves forward. It will advance till it finds something that
        * doesn't fit. When it finds one, it replaces the element at index i with x and advances i to the next element 
        */
        for(int x: nums){
            if(i < 2 || x != nums[i - 2]){
                nums[i] = x;
                ++i;
            }
        }
        
        // i will equal size, so return 
        return i;
        
    }
}
