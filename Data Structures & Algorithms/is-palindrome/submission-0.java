class Solution {
    public boolean isPalindrome(String s) {
        String r=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        char ch[]=r.toCharArray();
        String st="";
        for(int i=ch.length-1;i>=0;i--){
            st=st+ch[i];
        }
        if(r.equals(st)){
            return true;
        }
        return false;
    }
}
