class Solution {
    // O(n)
    public int findDuplicate(int[] nums) {
        // set for speed
        Set<Integer> knownInts = new HashSet<>();
        for(int i = 0; i < nums.length; ++i){
            // if it is already there, its a dup, return it
            if(knownInts.contains(nums[i])){
                return nums[i];
            }
            else{
                // otherwise it is currently unique, add it to the hashset
                knownInts.add(nums[i]);
            }
        }
        // it must not have a repeat, return -1 to indicate that 
        return -1;
    }
}
