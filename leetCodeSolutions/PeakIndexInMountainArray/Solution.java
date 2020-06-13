// O(n) one pass solution
class Solution {
    public int peakIndexInMountainArray(int[] A) {
        int i = 0; 
        // go till it decreases 
        while (A[i] < A[i + 1]){
            ++i;
        }
        return i;
    }
}
