class BruteForceSolution {
    /*
    * I am going to start with a brute force approach, literally just check every possible substring
    * make a method to detect if any duplicates exist yet, and then make two nested loops to try every string
    * In theory I am looking at O(n^3)
    */
    public int lengthOfLongestSubstring(String s) {
        // start with -1 to eliminate one edge case
        int maxLen = 0;
        // get a few varibles so it doesn't have to instaniate each time
        int sLen = s.length();
        String temp = new String();
        int tempLen = 0;
        
        // go through each potential string
        for(int i = 0; i < sLen; ++i){
            for(int j = i + 1; j <=sLen; ++j){
                temp = s.substring(i,j);
                 tempLen = temp.length();
                // if the string has no duplicates, and its length is bigger than current, assign it to max len
                if(noDups(temp) && tempLen >= maxLen){
                    maxLen = tempLen;
                }
            }
        }
        
        
        
        return maxLen; 
        
    }   
    // helper function to find duplicates
    public boolean noDups(String s){
        // give us a set for easy lookup
        Set x = new HashSet<Character>();
        // go through each letter
        for(int i = 0; i < s.length(); ++i){
            // if it is already there, must be duplicates
            if(x.contains(s.charAt(i))) return false;
            // otherwise just add it 
            x.add(s.charAt(i));
        }
        // if you made it here, no dups, return true
        return true;
                
    }
}
