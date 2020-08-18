class Solution {
    /*
    * I had little desire to reinvent the wheel here; using built in library classes
    * I turned the two strings to base 10 ints, added them, and then turned it back into a binary 
    * string
    */
    public String addBinary(String a, String b) {
        return Integer.toBinaryString(Integer.parseInt(a, 2) + Integer.parseInt(b,2));      
    }  
}
