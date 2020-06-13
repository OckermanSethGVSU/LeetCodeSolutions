class Solution {
    public boolean isMonotonic(int[] A) {
        // if one of the helper methods is true, it must be true
        return (decreasing(A) || increasing(A));
    }
    
   // check if the numbers are decreasing, if one is bigger, it must be false
    public boolean decreasing(int[] A){
            for(int i = 0; i < A.length -1; ++i){
                if(A[i] > A[i +1 ]){
                    return false;
                }
                
            }
        return true;
    }
    
   // check if the numbers are increasing, if one is smaller, it must be false
    public boolean increasing(int[] A){
            for(int i = 0; i < A.length -1; ++i){
                if(A[i] < A[i +1 ]){
                   return false;
                }
                
            }
        return true;
    } 
}
