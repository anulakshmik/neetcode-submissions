class Solution {
    public int countSeniors(String[] details) {
        int count=0;
        for(int i=0;i<details.length;i++){
            
            String cs=details[i];
              String age=""+cs.charAt(11)+cs.charAt(12);
              
              if(Integer.parseInt(age)>60){
                count++;
              }
        
        }
        return count;
        
        
    }
}