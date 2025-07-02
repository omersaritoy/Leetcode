class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int maxSum = 0;
        int sum = 0;

        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        maxSum = sum;

        int startIndex=0;
        int endIndex=k;
        while(endIndex<nums.length) {
            sum-=nums[startIndex];
            startIndex++;
            sum+=nums[endIndex];
            endIndex++;
            maxSum = Math.max(maxSum, sum);
        }
        return (double) maxSum / k;
    }
}