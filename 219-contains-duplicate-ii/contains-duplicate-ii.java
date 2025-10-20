class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> set = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int val = nums[i];
            if (set.containsKey(val) && i - set.get(val) <= k) {
                return true;
            }
            set.put(val, i);
        }
        return false;
    }
}