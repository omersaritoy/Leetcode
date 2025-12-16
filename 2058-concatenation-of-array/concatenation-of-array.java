class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[2*nums.length];
        int len=0;

        for(int i=0;i<ans.length;i++){
            ans[i]=nums[len++];
            if(len==nums.length){
                len=0;
            }
        }


        return ans;
    }
}