class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int luc=-1;
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int num:arr){
            if(map.get(num)==num){
                luc=Math.max(luc,num);
                
            }
        }
        return luc;
        
    }
}