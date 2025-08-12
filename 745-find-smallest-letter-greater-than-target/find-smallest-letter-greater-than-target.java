class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        boolean[] isChar= new boolean[26];
        for(char c: letters){
            isChar[c-'a']=true;
        }
        for(int i=target-'a'+1;i<26;i++){
            if(isChar[i]) return (char)('a'+i);
        }
        return letters[0];
    }
}