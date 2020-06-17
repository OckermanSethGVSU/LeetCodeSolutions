class Solution {
    /*
    * Slighty faster approach, I am going to keep them sorted while I insert them into a new array to get rid of log(n)       
    * work; should be O(n) in total
    */
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // get the size of the first and second array and use it to determine the size of the array for copying
        int n1Size = nums1.length;
        int n2Size = nums2.length;
        int combSize = n1Size + n2Size;
        int[] comb = new int[combSize];
        
        // a tracker for where I am in the combined array; and the two pre-existing arrays
        int insert = 0;
        int i = 0;
        int j = 0;
        
        // go until one array is finished
        while(i < n1Size && j < n2Size){
            
            // if num in first array is less than num in second insert
            if(nums1[i] < nums2[j]) comb[insert++] = nums1[i++];
            
            // otherwise put the other one in the combined array
            else comb[insert++] = nums2[j++];
        }
        
        // second array is fully intergrated; insert the rest of the first
        while(i < n1Size) comb[insert++] = nums1[i++];
        
        // first array is fully intergrated; insert the rest of the second
        while(j < n2Size) comb[insert++] = nums2[j++];
        
        // to find the median in an odd length sorted arrray, just find the middle element 
        if(combSize % 2 != 0){
            return comb[combSize/2];
        }
        
        // otherwise, it is even; get the two mid elements and get their average 
        return ((double)(comb[combSize/2] + comb[combSize/2  -1])) /2;
        
    }
}
