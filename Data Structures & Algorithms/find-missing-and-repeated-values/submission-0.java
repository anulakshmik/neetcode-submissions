class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        HashSet<Integer> set=new HashSet<>();
        int k=0;
        int arr[]=new int[2];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid.length;j++){
                if(!set.add(grid[i][j])){
                    arr[k++]=grid[i][j];
                }
                set.add(grid[i][j]);
            }
        }
        for(int i=1;i<=grid.length*grid.length;i++){
            if(set.add(i)){
                arr[k++]=i;
            }
        }
        return arr;
        
    }
}