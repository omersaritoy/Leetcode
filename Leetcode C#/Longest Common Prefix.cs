public class Solution {
    public string LongestCommonPrefix(string[] strs) {

    int minLength = strs.Min(e => e.Length);
    string res = strs.First(e => e.Length == minLength);

    foreach (string str in strs)
    {
        for (int j = 0; j < minLength; j++)
        {
            if (str[j] != res[j])
            {
                minLength = j; 
                break;
               
            }
        }
    }
    if (minLength == 0)
        return "";
    return res.Substring(0, minLength);

        }

    }
