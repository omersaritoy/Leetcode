public class Solution {
    public int RomanToInt(string s) {
   Dictionary<char, int> dict = new Dictionary<char, int> {
    { 'I', 1 }, { 'V', 5 },
    { 'X', 10 }, { 'L', 50 },
     { 'C', 100 }, { 'D', 500 },
     { 'M', 1000 } };
    int sum = 0, prev = 0, currentnum = 0;
    foreach (var c in s)
    {
        currentnum = dict[c];
        if (currentnum > prev)
            sum -= 2 * prev;
        sum += currentnum;
        prev= currentnum;
    }
    return sum;


}
}