import java.util.Arrays;

class Solution {
    public int findGCD(int[] nums) {
        int min=Arrays.stream(nums).min().getAsInt();
        int max=Arrays.stream(nums).max().getAsInt();

        return gcd(min,max);

    }
    private static int gcd(int a,int b){
        if(b==0)
            return a;
        return gcd(b,a%b);
    }
}