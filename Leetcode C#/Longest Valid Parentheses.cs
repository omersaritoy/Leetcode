public class Solution {
    public int LongestValidParentheses(string s) {
            if (s.Length == null)
                return 0;
            Stack<int> Mystack = new Stack<int>();
            int count = 0;
            Mystack.Push(-1);
            for (int i = 0; i < s.Length; i++)
            {
                if (s[i] == '(')
                    Mystack.Push(i);
                else if (s[i]==')')
                {
                    Mystack.Pop();
                    if (Mystack.Count == 0)
                        Mystack.Push(i);
                    count = Math.Max(count, i - Mystack.Peek());
                }
            }

            return count;
    }
}