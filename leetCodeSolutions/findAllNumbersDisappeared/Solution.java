class Solution {
    /*
    * The idea is to match the number in a given array to its index in another array
    * scan through and add 1 to that index. Then go through the new array and 
    * anywhere there is a zero that number is missing. This is O(n)
    */
    public List<Integer> findDisappearedNumbers(int[] nums) {
        // handle exception
        if(nums.length == 0) return new ArrayList<>();
        // create an arrayList to add the disappeared numbers to
        List<Integer> x = new ArrayList<>();
        // create a new array to keep track of what numbers show up in og array
        int[] counterA = new int[nums.length + 1];
        // add 1 to the index (the num)
        for(int i = 0; i < nums.length; ++i){
            ++counterA[nums[i]];
        }
        
        // if there were no numbers, the index will be 0, so add it as a disappeared number
        for(int i = 1; i < nums.length + 1; ++i){
            if(counterA[i] == 0) x.add(i);
            
        }
        
        return x;
    }
    
    

}
