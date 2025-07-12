class Solution {
    public void rotate(int[] nums, int k) {
        int length = nums.length;
        k=k%length;
        int[] rotated = new int[length];
        for(int i=0;i<length;i++){
            rotated[(i+k)%length]=nums[i];
        }
        System.arraycopy(rotated, 0, nums, 0, length);
    }
}