class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        HashSet<String> dna=new HashSet<>();
        HashSet<String> set=new HashSet<>();
        for(int i=0;i<=s.length()-10;i++){
            String st=s.substring(i,i+10);
            if(!set.contains(st)){
                set.add(st);
            }
            else{
                dna.add(st);
            }
            

        }
        return new ArrayList<>(dna);

    }
}
