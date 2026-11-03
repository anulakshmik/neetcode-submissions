class Solution {
    public int[] productExceptSelf(int[] nums) {
        int preffix=1;
        int n=nums.length;
        int ans[]=new int[n];
        for(int i=0;i<n;i++){
            ans[i]=preffix;
            preffix*=nums[i];
        }
        int suffix=1;
        for(int i=n-1;i>=0;i--){
            ans[i]*=suffix;
            suffix*=nums[i];
        }
        return ans;
        
    }
}  
