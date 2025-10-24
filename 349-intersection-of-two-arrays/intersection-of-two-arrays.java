class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> list = new HashSet<>();

        for(int i:nums1)
            list.add(i);

        Set<Integer> result =new HashSet<>();
        for(int i:nums2)
            if(list.contains(i))
                result.add(i);

        return result.stream().mapToInt(x->x).toArray();
    }
}