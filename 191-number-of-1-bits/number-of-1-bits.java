class Solution {
    public int hammingWeight(int n) {
        List<Integer> binary=new ArrayList<>();

        while(n!=0){
            int temp=n%2;
            binary.add(temp);
            n=n/2;
        }

        return (int) binary.stream().filter(x -> x == 1).count();
    }
}