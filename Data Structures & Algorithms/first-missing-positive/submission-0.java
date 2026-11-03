class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        
        for(int num:nums){
            set.add(num);
        }
        int current=1;
        while(set.contains(current)){
            current++;
        }
        return current;
        
    }
}