class BruteForceSolution {
    /*
    * I am going to start with a brute force approach of simply trying every posible substring
    * it will take O(n^3). O(n^2) for each string, then another O(n) to reverse the string
    */
    public String longestPalindrome(String s) {
        // string to hold the current max
        String max = "";
        // deal with edge cases where it is either empty or one letter
        if(s.length() < 2){
            return s;
        }
        // go through each possible string
        for(int i = 0; i < s.length(); ++i){
            
            for(int j = i + 1; j <= s.length(); ++j){
                // if the reversed substring is equal, its a palindrome 
                if(s.substring(i,j).equals(reverse(s.substring(i,j)))){
                    // if it is greater than the current max's length, it is the new max
                    if(s.substring(i,j).length() > max.length() ){
                        max = s.substring(i,j);
                    }
                }
            }
        }
        // give them back the max
        return max;
    }
    // I need a method to reverse the string; this will take O(n) work
    public String reverse(String input) {
    
    // if there is no string, send it back
    if (input == null) {
        return input;
    }
    // string to return
    String output = "";
    // go from the back of input and put its last character at the front of the new string
    for (int i = input.length() - 1; i >= 0; i--) {
        output = output + input.charAt(i);
    }
 
    return output;
}
}
