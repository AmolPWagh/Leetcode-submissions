class Solution {
    public int maxArea(int[] height) {
        int s = 0;
        int e = height.length-1;
        int maxArea =0;
        while(s<e){
            int currArea = Math.min(height[s], height[e])*(e-s);
            maxArea = Math.max(maxArea, currArea);
            if(height[s]<height[e]) s++;
            else e--;
        }
        return maxArea;
    }
}