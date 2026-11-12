class Solution {
    public boolean isMonotonic(int[] nums) {
       int i=1;
       
            while(i<nums.length&&nums[i]>=nums[i-1]){
                i++;
            }
            int j=1;
            while(j<nums.length&&nums[j]<=nums[j-1]){
                j++;
            }
            if(i==nums.length||j==nums.length){
                return true;
            }
            return false;
        }
        
    }
