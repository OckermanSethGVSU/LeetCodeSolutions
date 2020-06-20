class Solution {
    /*
    * General idea is to create a sliding window using i. Then once I have the real starting point, take the valid
    * numbers and add them into a new string (until an invalid character is found) for testing. It will come out to 
    * O(n), but I am wasting a lot of time/space by using a new string and having to consantly add to it.
    * I should be able to find a solution that uses only ints or somehow eliminates the second string
    */
    public int myAtoi(String str) {
        // the final answer, stored as a double so we can make sure it stays in bounds
        double result = 0;
        // the index of my place in the string
        int i = 0;
        // keep track of sign
        int posOrNeg = 1;
        // for now we will use another string to hold the answer, I am sure there is a faster way that involves using
        // just ints
        String changed = "";
        
        // handle blank string exception
        if(str.equals("")) return 0;
        
        // get rid of all white space in front
        while(i < str.length() && str.charAt(i) == ' '){
            ++i;
        }
        
        // if i is at the end, it must be blank so return 0 
        if(i == str.length()) return 0;
        
        // if there is a + or a - in index 0, we need to handle it
        if((str.charAt(i) == '+' || str.charAt(i) == '-') && (i < str.length() -1)){
           
            // if its not a number after the +/-, it can't be valid
            if(!Character.isDigit(str.charAt(i + 1))) return 0;
            
            // if it is a plus, do nothing to sign but increment i so it is past the +
            else if(str.charAt(i) == '+'){ 
                ++i;
            }
            // if it is negative, switch the sign and increment i past the - 
            else if(str.charAt(i) == '-'){
                posOrNeg = -1;
                ++i;
            }
        }
        
        // keep going until there are no more valid ints to read in
        while(i < str.length()){
            // if it is a digit, add it to the changed string
            if(Character.isDigit(str.charAt(i))){
                changed += str.charAt(i);
                ++i;
            }
            // if it is not a digit, exit the loop
            else{
                i = str.length() + 5;
            }
            
        }
        
        // if the string is empty, can't be a number; return 0
        if(changed.equals("")) return 0;
        
        // change it to a double and apply sign, now just check if it is in bounds for an int
        result = Double.parseDouble(changed);
        result = result * posOrNeg;
        // handle max and min
	    if (result > Integer.MAX_VALUE)
		    return Integer.MAX_VALUE;
 
	    if (result < Integer.MIN_VALUE)
		    return Integer.MIN_VALUE;
 
        // cast back to an int if it is in bounds, anwser has been found
	    return (int) result;
        
            
    }
}
