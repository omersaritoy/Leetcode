class Solution {
    public int reverseBits(int n) {
        StringBuilder sb = new StringBuilder();

        while (n != 0) {
            sb.append(n % 2);
            n = n / 2;
        }
        while (sb.length() < 32) {
            sb.append('0');
        }
        int res = 0;
        for (int i = 0; i < 32; i++) {
            if (sb.charAt(i) == '1') {
                res += (int) Math.pow(2, 31 - i);
            }
        }


        return res;
    }
}