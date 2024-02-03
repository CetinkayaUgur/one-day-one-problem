package FebruaryOf2024;

class February3 {
    public boolean isValid(String s) {
        /**
         * https://leetcode.com/problems/valid-parentheses/
         */
        char[] str = new char[s.length()];

        for (int i = 0; i < s.length() - 1; i++) {
            str[i] = s.charAt(i);
            if (str.charAt(i) == '(' & str.charAt(i + 1) == ')' | str.charAt(i) == '[' & str.charAt(i + 1) == ']'
                    | str.charAt(i) == '{' & str.charAt(i + 1) == '}') {
                str.charAt(i) = null;
                i++;
            }
        }
        if (str[i] != null)
            return false;
    }
}