class Solution {
    public int equalPairs(int[][] grid) {
          int length=grid.length;
        int count=0;
        int[][] arr=new int[length][length];
        for(int i=0;i<length;i++){
            for(int j=0;j<length;j++){
                arr[j][i]=grid[i][j];
            }
        }
        for(int i=0;i<length;i++){
            for(int j=0;j<length;j++){
                if(Arrays.equals(grid[i],arr[j])){
                    count=count+1;
                }
            }
        }
        return count;
    }
}