class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int total=duration;
        for (int i=1;i<timeSeries.length;i++) {
            int attack=Math.min(timeSeries[i]-timeSeries[i-1],duration);
            total+=attack;
        }
        return total;
    }
}