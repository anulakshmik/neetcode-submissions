class Solution {
    public int minimumRecolors(String blocks, int k) {
        int p=0,minCount=Integer.MAX_VALUE;
        int l=0,count=0;
       for(int i=0;i<k;i++){
        if(blocks.charAt(i)=='W'){
            count++;
        }
       }
       minCount=Math.min(count,minCount);
       for(int r=k;r<blocks.length();r++){
        if(blocks.charAt(l)=='W'){
            count--;
            
        }
        if(blocks.charAt(r)=='W'){
            count++;

        }
        l++;
        minCount=Math.min(count,minCount);
       }
       return minCount;

        }
        
    }
