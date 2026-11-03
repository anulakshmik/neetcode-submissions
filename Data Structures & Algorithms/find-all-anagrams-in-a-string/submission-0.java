class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list=new ArrayList<>();
        
        
        
        char[] c=p.toCharArray();
        Arrays.sort(c);
        int l=0;
        int r=p.length();
        while(r<=s.length()){
            String st=s.substring(l,r);
            char[] c1=st.toCharArray();
            Arrays.sort(c1);
            if(Arrays.equals(c1,c)){
                list.add(l);
            }
            l++;
            r++;
        }

return list;


    }
}
