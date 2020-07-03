public int[] copyEvens(int[] nums, int count) {
  // new array to copy things to over
  int[] nList = new int[count];
  // index to insert in new list
  int insertIndex = 0;
  // len of list so I don't have to check each iteration
  int len = nums.length;
  // general postion tracker
  int i = 0;
  
  // go through list until either all evens are inserted or we are at the end of the list
  while(insertIndex < count && i < len){
    // if it is even, insert and move the insert index forward and move to the next element in the original list
    if(nums[i] % 2 == 0){
      nList[insertIndex] = nums[i];
      ++insertIndex;
      ++i;
    }
    // otherwise, just move forward to the next element in the original list
    else ++i;
  }
  
  return nList;
}
