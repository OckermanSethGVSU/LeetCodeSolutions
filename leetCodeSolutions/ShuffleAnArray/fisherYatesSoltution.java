// fisher yates solution
class Solution {
    
    // an unshuffled array
    private int[] original;
    
    // the array to be shuffled
    private int[] ar;
    
    // random object to actally make it random
    Random rand = new Random();
    
    // gets random number in range and making sure its past the min value by adding it
    private int range(int min, int max){
        return rand.nextInt(max - min) + min;
    }
    
    // swap function 
    private void swap(int i, int j){
        int temp = ar[i];
        ar[i] = ar[j];
        ar[j] = temp;
    }
    
    /**
    *constructor that creates basic two arrrays for the class to work with
    */
    public Solution(int[] nums) {
        original = nums;
        ar = nums.clone();
    }
    
    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        ar = original;
        original = original.clone();
        return original;
    }
    
    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        for(int i = 0; i < ar.length; ++i){
            swap(i,range(i,ar.length));
        }
        return ar;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */
