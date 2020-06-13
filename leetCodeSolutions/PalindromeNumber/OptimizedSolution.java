
class Solution {
    public boolean isPalindrome(int x) {
        
        int reversedNum = 0;
        // if it is a negative don't work with it or it is a number that ends with zero
        if( x < 0 || (x % 10 == 0 && x != 0)){
            return false;
        }
            
        // go until x is less than the reversed num, meaning you took half
         while( x > reversedNum){
             /* we are advancing by a power of ten each time, so * 10 the origninal number and 
             * add the last digit of x the reversed num and continue
             */
             reversedNum = (reversedNum * 10) + (x % 10);
             x = x/10;
         }
        
        /*
        *if its an even lengthed digit, it will equal, if it is odd, we need to get rid of the last digit
        * of the reverse (last digit will always equal itself) so that they are the same
        */
        return  (x == reversedNum) || (x == reversedNum/10);
    }
}
