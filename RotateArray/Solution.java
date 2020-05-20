class Solution {
    public void rotate(int[] nums, int k) {
        // get the size of hte array
        int size = nums.length;
        // we are gonna use a second array to just insert at the correct index
        int[] correct = new int[size];
        
        // use modulo to wrap the index and insert into the right spot
        for(int i = 0; i < size; ++i){
            int wrappedIndex = (i + k) % size;
            correct[wrappedIndex] = nums[i];
        }
       // copy it back in
        for(int i =0; i < size; ++i){
            nums[i] = correct[i];
        }
    }
}
