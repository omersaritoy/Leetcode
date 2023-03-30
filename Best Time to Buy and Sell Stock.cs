public class Solution {
    public int MaxProfit(int[] prices) {
        int max=0;
        int count=0;
        for(int i=0;i<prices.Length-1;i++){
            count+=(prices[i+1]-prices[i]);
            if(count<0)
                count=0;
            if(count>=0&&count>=max)
                max=count;
        }
        return max;
    }
}