public class Solution {
    public string AddStrings(string val1, string val2) {
        if(val1.Length>val2.Length)
            val2= val2.PadLeft(val1.Length, '0');
        else if(val2.Length>val1.Length)
            val1= val1.PadLeft(val2.Length, '0');

        var sb=new StringBuilder();
        int carry= 0;

        for(int i = val1.Length-1; i >= 0; i--)
        {
            var firstVal=int.Parse(val1[i].ToString());
            var secondVal=int.Parse(val2[i].ToString());

            int sum = firstVal + secondVal + carry;
            carry=sum>9 ? 1 : 0;
            sum = sum % 10;
            sb.Insert(0, sum);
        }
        if (carry > 0)
            sb.Insert(0, 1);
        return sb.ToString();
    }
}