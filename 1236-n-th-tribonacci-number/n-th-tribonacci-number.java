class Solution {
    public int tribonacci(int n) {
        if(n==0)
            return 0;
        if(n==1 || n==2)
            return 1;
        int v0=0,v1=1,v2=1;
        int result=0;

        for(int i=3;i<=n;i++){
            result=v0+v1+v2;
            v0=v1;
            v1=v2;
            v2=result;
        }
        return result;
    }
}