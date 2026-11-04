class Solution {
    public String minWindow(String s, String t) {
       int[] freq=new int[128];
       int l=0,count=0,start=0,minLen=Integer.MAX_VALUE;
       for(int i=0;i<t.length();i++){
        freq[t.charAt(i)]++;
       }
       for(int r=0;r<s.length();r++){
        char ch=s.charAt(r);
        if(freq[ch]>0){
            count++;
        }
        freq[ch]--;
        while(count==t.length()){
            if(r-l+1<minLen){
                minLen=r-l+1;
                start=l;
            }
            char left=s.charAt(l);
            freq[left]++;
            if(freq[left]>0){
                count--;
            }
            l++;

        }
       }
       if(minLen==Integer.MAX_VALUE){
        return "";
       }
       return s.substring(start,start+minLen);
    }
}