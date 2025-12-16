class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] xAxis=new int[n];
        for (int i = 0; i < n; i++) {
            xAxis[i]=nums[i];
        }
        int[] yAxis=new int[n];
        for(int i=0;i<n;i++){
            yAxis[i]=nums[i+n];
        }
        int[] res=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                res[i]=xAxis[i/2];
            }
            else{
                res[i]=yAxis[i/2];
            }
        }
        return res;
    }
}