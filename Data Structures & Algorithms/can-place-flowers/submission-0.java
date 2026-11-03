class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int no=flowerbed.length;
        int count=0;
        
        
        for(int i=0;i<no;i++){
            if((i==0||flowerbed[i-1]==0)&&flowerbed[i]==0&&(i==no-1||flowerbed[i+1]==0)){
                flowerbed[i]=1;
                count++;
            }
        }
          
            if(count>=n){
                return true;
            }
            return false;
        }

        
    }
