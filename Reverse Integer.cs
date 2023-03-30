public class Solution {
    public int Reverse(int x) {
        
        long reverse=0;
        for(int i=0;x!=0;i++){
            int temp=x%10;
            reverse=reverse*10+temp;
            x=x/10;
        }
        if(reverse >= -2147483648 && reverse <=  2147483647)
            return (int)reverse;      

        return 0;
    }
}