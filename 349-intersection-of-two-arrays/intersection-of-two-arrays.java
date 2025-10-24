class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums1) {
            set.add(num);
        }
        Set<Integer> list = new HashSet<>();
        for (int num : nums2) {
            if (set.contains(num)) {
                list.add(num);
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}