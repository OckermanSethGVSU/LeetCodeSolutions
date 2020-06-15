class Solution {
    /*
    * This is a somewhat brute force approach. The idea is get them into one sorted array with O(n) work, then sort them
    * with O(log(n))
    * then just find the median by checking length to be even or odd and using some simple math to see where 
    * the median would fall
    * overall would be O(nlog(n)) which isn't too bad. I am sure there is a faster way to do it however
    * if I could somehow avoid actually scanning it into another array, I could eliminate most the work
    */
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // get the size of the first and second array and use it to determine the size of the array for copying
        int n1Size = nums1.length;
        int n2Size = nums2.length;
        int combSize = n1Size + n2Size;
        int[] comb = new int[combSize];
        
        // the index of where I want it inserted in combined array
        int insertIndex = 0;
        
        // b/c I use two (non-nested) loops to combine it, I need a tracker for the index of the second loop
        int j = 0;
        
        //  put the first list into the combined
        for(insertIndex = 0; insertIndex < n1Size; ++insertIndex){
            comb[insertIndex] = nums1[insertIndex];
        }
        
        // put the second list into the combined 
        for(j = 0; j < n2Size; ++insertIndex){
            comb[insertIndex] = nums2[j];
            ++j;
        }
        
        // use built in sort
        Arrays.sort(comb);
        
        // if the array has an odd length, the median can be found just by accessing the num at half the length
        if(combSize % 2 != 0){
            return comb[combSize/2];
        }
        // otherwise, it is even; get the two mid elements and get their average 
        return ((double)(comb[combSize/2] + comb[combSize/2  -1])) /2;
        
    }
}
