class Solution {
    public int trap(int[] height) {
        int res=0;
        
        int n=height.length;
        for(int i=0;i<n;i++){
            int rightmax=height[i],leftmax=height[i];
            for(int j=0;j<i;j++){
            
                leftmax=Math.max(height[j],leftmax);
            }
            for(int j=i+1;j<n;j++){
                
                    rightmax=Math.max(height[j],rightmax);
                }
                res+=Math.min(leftmax,rightmax)-height[i];
            }
            return res;
        }
        
        
        
    }

