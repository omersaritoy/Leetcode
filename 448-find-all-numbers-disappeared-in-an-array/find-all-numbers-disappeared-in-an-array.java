class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int[] temp = new int[nums.length + 1];
        for (int num : nums) {
            if (temp[num] == 0) {
                temp[num] = 1;
            }
        }
        List<Integer> list=new ArrayList<>();
        for(int i = 1; i <= nums.length; i++){
            if(temp[i] == 0)
                list.add(i);
        }

        return list;
    }
}