class Solution {
    public  String convert(String s, int numRows) {
        if (numRows == 1 || numRows >= s.length()) {
            return s;
        }
        int idx = 0, d = 1;

        List<Character>[] rows = getLists(numRows);
        addCharachters(s, numRows, rows, idx, d);
        StringBuilder result = new StringBuilder();
        lastIteration(rows, result);

        return result.toString();
    }

    private static void lastIteration(List<Character>[] rows, StringBuilder result) {
        for (List<Character> row : rows) {
            for (char c : row) {
                result.append(c);
            }
        }
    }

    private static List<Character>[] getLists(int numRows) {
        List<Character>[] rows = new ArrayList[numRows];

        for (int i = 0; i < numRows; i++) {
            rows[i] = new ArrayList<>();
        }
        return rows;
    }

    private static void addCharachters(String s, int numRows, List<Character>[] rows, int idx, int d) {
        for (char c : s.toCharArray()) {
            rows[idx].add(c);
            if (idx == 0) {
                d = 1;
            } else if (idx == numRows - 1) {
                d = -1;
            }
            idx += d;
        }
    }
}