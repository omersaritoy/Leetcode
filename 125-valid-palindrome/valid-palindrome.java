class Solution {
    public boolean isPalindrome(String s) {
        s= s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        int i=0;
        int j=s.length()-1;
     
        System.out.println(s);
        while(j>=0){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}