class Solution {
    public boolean isArraySpecial(int[] nums) {
        int i=1;
        while(i<nums.length){
            if((nums[i-1]%2==0&&nums[i]%2==1)||(nums[i-1]%2==1&&nums[i]%2==0)){
                i++;
            }
        
        else{
            return false;
        }
        }
        return true;
        
    }
}