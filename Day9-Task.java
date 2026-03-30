class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1 || s.length() <= numRows)
            return s;
        StringBuilder res = new StringBuilder();
        int n = s.length();
        int cycle = 2 * (numRows - 1);
        for (int row = 0; row < numRows; row++) {
            for (int j = row; j < n; j += cycle) {
                res.append(s.charAt(j));
                int diagonal = j + cycle - 2 * row;
                if (row != 0 && row != numRows - 1 && diagonal < n) {
                    res.append(s.charAt(diagonal));
                }
            }
        }
        return res.toString();
    }
}
