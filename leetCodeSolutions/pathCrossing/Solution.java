class Solution {
    /*
    * Basic idea is to add the string equivalent of the cordinates to a hashset
    * if the hashset contains the cordinates, it has already been there
    * otherwise add it and keep going
    */
    public boolean isPathCrossing(String path) {
        // keep track of x and y position 
        int x = 0;
        int y = 0;
        // Hashset to hold cordinates 
        HashSet<String> known = new HashSet<String>();
        // add original
        known.add("0,0");
        // go through each char in the string
        for(int i = 0; i < path.length(); ++i){
            if(path.charAt(i) == 'N') ++x;
            
            else if(path.charAt(i) == 'S') --x;
            
            else if(path.charAt(i) == 'W') --y;
                
            else if(path.charAt(i) == 'E') ++y;
            
            String loc = x + "," + y;
            // if it is already there, return true
            if(known.contains(loc)) return true;
            // otherwise add and keep going
            known.add(loc);
        }
        // no known cordinates were found so return false
        return false;
    }   
}
