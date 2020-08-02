class Solution {
    /*
    * One pass approach; this approach is based around the idea that you could only potentially have a bigger area with     * a smaller x if the height of one of the walls was higher. So, only move the shorter wall until you have covered
    * the entrie area; O(n)
    */
    public int maxArea(int[] height) {
        // deal with edge cases
        if(height == null || height.length == 0) return 0;
        // pointer for left end of array and right end of array
        int p1 = 0;
        int p2 = height.length - 1;
        // var to hold area
        int maxArea = 0;
        // keep going until they overlap
        while(p1 < p2){
            // area is equal to distance between left and right wall * the shorter wall height
            int area = (p2 - p1) * Math.min(height[p1],height[p2]);
            // if it is greater, make it max
            if(area > maxArea) maxArea = area;
            
            // advance the shorter wall inward
            if(height[p1] < height[p2]) ++p1;
            else --p2;
        }
        return maxArea;
    }
}
