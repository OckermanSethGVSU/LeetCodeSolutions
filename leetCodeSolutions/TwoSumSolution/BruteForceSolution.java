class BruteForceSolution {
    public int[] twoSum(int[] nums, int target) {
        // the array to return 
        int[] solution = new int[2];
        //find the indexes of the desired numbers to create the sum
        for(int i = 0; i < nums.length; ++i){
            for(int j = i + 1; j < nums.length; ++j){
                if(nums[i] + nums[j] == target){
                    solution[0] = i;
                    solution[1] = j;
                }
            }
        }
        return solution;
    }     
}
