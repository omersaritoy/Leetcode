class Solution {
    public long maximumTripletValue(int[] nums) {
        long maxTriplet=0;
        long maxElement=0,maxDiff=0;

        for(long num:nums) {
            maxTriplet=Math.max(maxTriplet,maxDiff*num);
            maxDiff=Math.max(maxDiff,maxElement-num);
            maxElement=Math.max(maxElement,num);
        }



        return maxTriplet;
    }
}