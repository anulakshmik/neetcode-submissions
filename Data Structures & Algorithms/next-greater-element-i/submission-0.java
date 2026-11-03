class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] nums3=new int[nums1.length];
        
        for(int i=0;i<nums1.length;i++){
            
            int j=0;
            while(j<nums2.length){
                if(nums1[i]!=nums2[j]){
                    j++;
                }
                else{
                    break;
                }
            }
            nums3[i]=-1;
            for(int p=j+1;p<nums2.length;p++){
                if(nums2[p]>nums1[i]){
                    nums3[i]=nums2[p];
                    break;
                }
            }
            
        }
       return nums3; 
    }
}