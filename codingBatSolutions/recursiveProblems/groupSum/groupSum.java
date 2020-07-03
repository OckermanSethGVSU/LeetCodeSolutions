public boolean groupSum(int start, int[] nums, int target) {
  // start with base, if no numbers left, it is either true or false if target is 0
  if(start >= nums.length) return (target == 0);
  
  // either we are going to include start or not include start, and have to go down 
  /// recursively. So make two options to include or not to include
  
  //include
  if(groupSum(start + 1,nums, target - nums[start])) return true;
  
  // don't include
  if(groupSum(start + 1,nums, target)) return true;
  
  // all options have been explored, must not be possible 
  return false;
}
