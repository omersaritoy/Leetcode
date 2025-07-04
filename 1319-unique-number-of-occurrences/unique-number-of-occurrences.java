class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();

        for (int j : arr) {
            map.put(j, map.getOrDefault(j, 0) + 1);
        }
        Set<Integer> set = new HashSet<>(map.values());

        return map.size() == set.size();
    }
}