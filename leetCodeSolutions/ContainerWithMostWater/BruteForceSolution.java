class Solution {
    /*
    * This is a brute force approach. I am just going to try every solution and find the max
    * This will take O(n^2) work. I am sure there is a faster way but this is a start 
    */ 
    public int maxArea(int[] height) {
        // get length so I don't need to keep checking it
        int length = height.length;
        // area for each iteration
        int area = 0;
        // max area seen so far
        int max = 0;
        // go through every combo
        for(int i = 0; i < length; ++i){
            for(int j = 1; j < length; ++j){
                // area is the x * y; so difference betweeen i and j * the shorter wall b/c otherwise the water would 
                // overflow 
                area = (j - i) * (Math.min(height[i],height[j]));
                // if it is greater, it is now the new max
                if(area > max) max = area;
            }
        }
        // spit back out the max
        return max;
    }
}
