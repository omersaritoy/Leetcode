class Solution {
        public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        s="";
        for (int i = words.length-1; i >=0; i--) {
            if(i==0)
                s+=words[i];
            else
                s+=words[i]+" ";

        }
        return s;
    }
}