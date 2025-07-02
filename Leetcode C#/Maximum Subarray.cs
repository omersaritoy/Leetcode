public class Solution {
    public int MaxSubArray(int[] nums) {
        int sum=0;
        int maxsum=nums[0];
        int size=nums.Length;
        for(int i=0;i<size;i++){
            sum+=nums[i];
            if(nums[i]>sum)
                sum=nums[i];
            if(sum>maxsum)
                maxsum=sum;    
        }
        return maxsum;
        }
}