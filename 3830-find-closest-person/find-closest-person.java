class Solution {
    public int findClosest(int x, int y, int z) {
              int res=0;
        if (Math.abs(x - z) == Math.abs(z - y))
            res=0;
        if (Math.abs(x - z) < Math.abs(z - y))
            res=1;
        if (Math.abs(x - z) > Math.abs(z - y))
            res=2;
        return res;
    }
}