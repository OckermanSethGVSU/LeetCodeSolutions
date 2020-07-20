class OnePassSolution {
    /*
    * one pass approach, at any time if it is not increasing or decreasing, it cannot be mono-increasing 
    * or mono-decreasing. Check each step if it is no longer possible; O(n) approach
    */
    public boolean isMonotonic(int[] A) {
        boolean increasing = true;
        boolean decreasing = true;
        
        for(int i = 0; i < A.length -1; ++i){
            if(A[i] < A[i+1]) increasing = false;
            if(A[i] > A[i+1]) decreasing = false;
        }
        
        return increasing || decreasing;
    }
    
   
}
