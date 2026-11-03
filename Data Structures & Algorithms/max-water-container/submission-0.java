class Solution {
    public int maxArea(int[] heights) {
        int n=heights.length;
        int maxcapacity=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int width=j-i;
                int cap=width*Math.min(heights[i],heights[j]);
                maxcapacity=Math.max(cap,maxcapacity);
            }
        }
        return maxcapacity;
        
    }
}
