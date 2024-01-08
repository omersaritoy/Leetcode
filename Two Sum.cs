public class Solution {
    public int[] TwoSum(int[] nums, int target) {
        var dic=new Dictionary<int,int>();
        for(int i=0;i<nums.Length;i++){
            var v=target-nums[i];
            if(dic.ContainsValue(v)){
                return new int[]{d.Where(x=>x.Value==v).First().Key,i};
            }
            else
                d.Add(i,nums[i];
        }

    
        return null;
    }
}
