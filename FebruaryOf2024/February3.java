package FebruaryOf2024;

class February3 {
    public boolean isValid(String s) {
        /**
         * https://leetcode.com/problems/valid-parentheses/
         */
        char[] str = new char[s.length()];

        for (int i = 0; i < s.length() - 1; i++) {
            str[i] = s.charAt(i);
            if (s.charAt(i) == '(' & s.charAt(i + 1) == ')' | s.charAt(i) == '[' & s.charAt(i + 1) == ']' | s.charAt(i) == '{' & s.charAt(i + 1) == '}') {
                str[i] = 'n';
                i++;
            }
        }
        if (str[0] != 'n') return false;
        return true;
    }
}