class Solution {
    public int minimumDifference(int[] nums, int k) {
       Arrays.sort(nums);
       int minDif=Integer.MAX_VALUE;
       for(int i=0;i<=nums.length-k;i++){
        int diff=nums[i+k-1]-nums[i];
        minDif=Math.min(diff,minDif);

       }
       return minDif;
    }
}