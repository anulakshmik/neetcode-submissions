class Solution {
    public boolean isPalindrome(String s) {
       
        String s1=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        String st="";
        for(int i=s1.length()-1;i>=0;i--){
            st=st+s1.charAt(i);
        }
        if(st.equals(s1)){
            return true;
        }
        return false;
    }
}
