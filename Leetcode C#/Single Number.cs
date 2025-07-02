public class Solution {
    public int SingleNumber(int[] nums) {
        Array.Sort(nums);
            for (int i = 0; i < nums.Length;)
            {
                if (i != nums.Length - 1)
                {
                    if (nums[i] == nums[i + 1])
                    {
                        i += 2;
                        continue; 
                    }
                    else return nums[i];
                }
                else return nums[nums.Length - 1];
            }
            return -1;
    }
}