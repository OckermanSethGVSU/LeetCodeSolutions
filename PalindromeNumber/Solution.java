import java.math.BigInteger;
class Solution {
    public boolean isPalindrome(int x) {

        // bool to work with; default false
        boolean is = false;

        // change x to a string
        String reversed = Integer.toString(x);

        // if the string is length one it has to be a palindrome
        if (reversed.length() == 1) {
            is = true;
        }

        // execute logic
        else {
            // a string to add reversed original to
            String temp = "";
            // if it contains a negative, it can't be a palindrome so just return
            if (!reversed.contains("-")) {
                // reverse it
                for (int i = reversed.length() - 1; i >= 0; --i) {
                    temp += reversed.charAt(i);
                }

                // use biginteger to avoid overflow
                BigInteger reversednum = new BigInteger(temp);
                BigInteger targetnum = new BigInteger(Integer.toString(x));
                // if reversed is equal to the targetnum the number is a palindrome
                if (reversednum.equals(targetnum)) {
                    is = true;
                }
            }
        }
        return is;
    }
}
