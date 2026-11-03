class Solution {
    public String mergeAlternately(String word1, String word2) {
       StringBuilder word=new StringBuilder();
       int i=0;
       while(i<word1.length()&&i<word2.length()){
        word.append(word1.charAt(i));
        word.append(word2.charAt(i));
        i++;
       }
       while(i<word1.length()){
        word.append(word1.charAt(i));
        i++;
       }
       while(i<word2.length()){
        word.append(word2.charAt(i));
        i++;
       }
    
        return word.toString();
    }
    
}