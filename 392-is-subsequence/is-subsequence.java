class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.isEmpty())
            return true;

        int count = 0;

        for (int i = 0; i < t.length(); i++) {
            if (count < s.length() && s.charAt(count) == t.charAt(i)) {
                count++;
            }
        }

        return count == s.length();
    }
}