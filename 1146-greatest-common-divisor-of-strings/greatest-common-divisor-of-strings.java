class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if(!(str1+str2).equals(str2+str1))
            return "";
        return str1.substring(0,gcd(str1.length(),str2.length()));    
    }
    private static int gcd(int str1,int str2){
            return str2==0?str1:gcd(str2,str1%str2);
    }
}