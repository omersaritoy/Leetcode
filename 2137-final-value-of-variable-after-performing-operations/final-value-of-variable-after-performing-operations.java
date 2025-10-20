class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x= 0;
        for(String opString: operations){
            if(opString.contains("+")){
                x++;
            }else{
                x--;
            }
        }
        return x;
    }
}