class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        List<List<Integer>> res = new ArrayList<>();
        Set<Integer> n1 = new HashSet<>();
        Set<Integer> n2 = new HashSet<>();

        Arrays.stream(nums1).forEach(n1::add);
        Arrays.stream(nums2).forEach(n2::add);

        for (int n : nums2) {
            if (n1.contains(n)) {
                n1.remove(n);
                n2.remove(n);
            }
        }

        res.add(new ArrayList<>(n1));
        res.add(new ArrayList<>(n2));

        return res;
    }
}