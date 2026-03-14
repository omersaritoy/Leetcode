class Solution {
        public int findContentChildren(int[] g, int[] s) {
        int count=0;

        int gIndex=0;
        int sIndex=0;
        Arrays.sort(g);
        Arrays.sort(s);
        while(gIndex<g.length&&sIndex<s.length){
            if(g[gIndex]<=s[sIndex]){
                count++;
                gIndex++;
                sIndex++;
            }
            else if(g[gIndex]>s[sIndex]){
                sIndex++;
            }
            else
                gIndex++;
        }
        return count;
        }
}