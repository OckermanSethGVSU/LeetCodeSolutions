class Solution{
  public boolean canBalance(int[] nums) {
    for(int i = 0; i < nums.length; ++i){
        if(possible(nums,i)) return true;
    }
    return false;
  }

  public boolean possible(int[] nums,int i){
    int left = 0;
    int right = 0;
  
    for(int j = i; j > -1; --j){
      left += nums[j];
    }
    for(int k = i + 1; k < nums.length; ++k){
      right += nums[k];
    }
    return left == right;
  }
}
