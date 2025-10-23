class Solution {
    public List<String> summaryRanges(int[] nums) {
         List<String> result = new ArrayList<>();
        if (nums.length == 0) {
            return result;
        }

        int i = 0;
        while (i < nums.length) {
            int start = nums[i];
            int end = i;
            int temp=start;
            while (end + 1 < nums.length) {

                if (temp+1 == nums[end+1]) {
                    temp=nums[end+1];
                    end++;
                }
                else
                    break;
            }
            if(start == nums[end]) {
                result.add(nums[i] + "");
            }
            else
                result.add(start + "->" + nums[end]);
            i = end + 1;

        }
        return result;
    }
}