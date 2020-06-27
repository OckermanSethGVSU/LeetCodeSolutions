public class WindowSolution {
    /*
    * based on reading existing solutions, I need to create a window approach, where I eliminate loops by 
    * only using one set and having a artifical window restriction act as what my loops would do
    * Should be O(n)
    */
    public int lengthOfLongestSubstring(String s) {
        // the length of the string so I don't have to do it over and over in a loop
        int sLen = s.length();
        Set<Character> set = new HashSet<Character>();
        // two trackers for my window
        int i = 0;
        int j = 0;
        // the max length of the non dup string
        int maxLen = 0;
        
        // go through each substring but only the ones that won't have duplicates
        while (i < sLen && j < sLen) {
            // if set doesn't already have that char, go through procces 
            if (!set.contains(s.charAt(j))){
                // add it to the set and increment j to increase the window
                set.add(s.charAt(j++));
                // j - i will give us length of current string without need for a substring; assign max to maxLen
                maxLen = Math.max(maxLen, j - i);
            }
            // if it is already there, remove the char at i, and increment i 
            else {
                set.remove(s.charAt(i++));
              
            }
        }
        return maxLen;
    }
}
