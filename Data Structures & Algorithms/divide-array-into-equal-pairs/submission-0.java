class Solution {
    public boolean divideArray(int[] nums) {
        Arrays.sort(nums);
        int i=1;
        while(i<nums.length&&nums[i]==nums[i-1]){
           
                i=i+2;
                continue;
            }
        
        if(i==nums.length+1){
            return true;
        }
        return false;
        
    }
}