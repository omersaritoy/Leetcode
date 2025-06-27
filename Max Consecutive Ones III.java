class Solution {
    public int longestOnes(int[] nums, int k) {
        int index=0;
        int zeroCount=0;
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                zeroCount++;
            }
            while(zeroCount>k){
                if(nums[index]==0){
                    zeroCount--;
                }
                index++;
            }
            max=Math.max(max,i-index+1);
        }
        return max;
    }
}       