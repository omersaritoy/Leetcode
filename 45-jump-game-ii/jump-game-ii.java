class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        int jumpCount = 0;
        int farthest = 0;
        int jumpEnd = 0;

        for (int i = 0; i < n - 1; i++) {
            int reachable = i + nums[i];
            if (reachable > farthest) {
                farthest = reachable;
            }
            if (i == jumpEnd) {
                jumpCount++;
                jumpEnd = farthest;
                if (jumpEnd >= n - 1)
                    break;
            }

        }
        return jumpCount;
    }
}