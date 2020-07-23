class Solution {
    /*
    * Two pointer approach; convert char to ascii value int equivlent then add
    * carry the overflow onto the next place. It will be 
    * O(the bigger length's n)
    */
    public String addStrings(String num1, String num2) {
        int p1 = num1.length() - 1;
        int p2 = num2.length() - 1;
        int carry = 0;
        StringBuilder ans = new StringBuilder();
        
        while(p1 >= 0 || p2 >= 0){
            /*
            * get the value at the char at the end of strings; substract '0' (aka 60 in Ascii) to get 
            * them to ascii code
            */
            int x = p1 >= 0 ? num1.charAt(p1) - '0' : 0;
            int y = p2 >= 0 ? num2.charAt(p2) - '0' : 0;
            int val;
            
            // add the two values and add the overflow from last addition
            val = (x + y + carry) % 10;
            
            // calculate overflow if there is any
            carry = (x + y + carry) / 10;
           // add it to the end of the stringBuilder
            ans.append(val); 
            // decrease pointers
            --p1;
            --p2;
        }
        // if there is any overflow left over, add it in
        if(carry!= 0) ans.append(carry);
        
        // we went backwards up till now, reverse and cast
        return ans.reverse().toString();
        
    }

}
