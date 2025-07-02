public class Solution {
    public int LengthOfLastWord(string s) {
        string[] str=s.Split(' ');
        for(int i=str.Length-1;i>=0;i--)
        {
            if(str[i].Length!=0)
            {
                return str[i].Length;
            }
        }   
        return 0;

    }   
}