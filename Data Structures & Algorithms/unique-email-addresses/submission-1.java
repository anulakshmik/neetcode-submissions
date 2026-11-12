class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> set=new HashSet<>();
        for(String st:emails){
            String str="";
            int ind=st.indexOf('@');
            for(int i=0;i<ind;i++){
                if(st.charAt(i)=='+'){
                break;
            }
                if(st.charAt(i)!='.'){
                str+=st.charAt(i);
            }
             
            }
           str+=st.substring(ind);
                
            
            set.add(str);
        }

            
            
        
        return set.size();
        
    }
}
