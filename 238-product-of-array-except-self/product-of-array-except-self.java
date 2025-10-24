class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result=new int[nums.length];
        Arrays.fill(result,1);
        int pref=1,post=1;
        for(int i=0;i<nums.length;i++){
            result[i]=pref;
            pref=nums[i]*pref;
        }
        for(int i=nums.length-1;i>=0;i--){
            result[i]=result[i]*post;
            post=post*nums[i];
        }

        return result;

    }
}