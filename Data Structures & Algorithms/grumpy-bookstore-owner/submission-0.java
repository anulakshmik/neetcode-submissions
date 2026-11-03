class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int l=0,base=0,extra=0,maxExtra=0;
        for(int r=0;r<grumpy.length;r++){
            if(grumpy[r]==0){
                base+=customers[r];
            }
            else{
                extra+=customers[r];
            }
            while(r-l+1>minutes){
                if(grumpy[l]==1){
                extra-=customers[l];
                }
                l++;
            }
            maxExtra=Math.max(extra,maxExtra);
        }
        return base+maxExtra;
        
    }
}