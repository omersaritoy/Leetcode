class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        if (strs == null || strs.length == 0)
            return "";

        String prefix = strs[0];
        int prefLen = prefix.length();
        for (int i = 1; i < strs.length; i++) {
            String cur = strs[i];
            while(prefLen>cur.length()||!prefix.equals(cur.substring(0, prefLen))) {
                prefLen--;
                if(prefLen==0)
                    return "";
                prefix=prefix.substring(0, prefLen);
            }
        }
        return prefix;
    }
}