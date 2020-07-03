public int[] copyEvens(int[] nums, int count) {
  int[] nList = new int[count];
  int insertIndex = 0;
  int len = nums.length;
  int i = 0;
  
  while(insertIndex < count && i < len){
    if(nums[i] % 2 == 0){
      nList[insertIndex] = nums[i];
      ++insertIndex;
      ++i;
    }
    else ++i;
  }
  
  return nList;
}
