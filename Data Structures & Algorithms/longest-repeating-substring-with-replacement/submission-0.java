class Solution {
    public int characterReplacement(String s, int k) {
        int n=s.length();
        int[] count=new int[26];
        int left=0;
        int maxFre=0;
        int maxlen=0;
        for(int right=0;right<n;right++){
            char c=s.charAt(right);
            count[c-'A']++;
            maxFre=Math.max(maxFre,count[c-'A']);
            if((right-left+1)-maxFre>k){
                count[s.charAt(left)-'A']--;
                left++;
            }
            maxlen=Math.max(maxlen,right-left+1);
        }
        return maxlen;
        
        
    }
}
