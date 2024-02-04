package FebruaryOf2024;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

class February3 {
    public boolean isValid(String s) {
        /**
         * https://leetcode.com/problems/valid-parentheses/
         */
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> bracketMap = new HashMap<>();
        bracketMap.put(')', '(');
        bracketMap.put('}', '{');
        bracketMap.put(']', '[');

        for (char bracket : s.toCharArray()) {
            if (bracketMap.containsValue(bracket)) {
                stack.push(bracket);
            } else if (bracketMap.containsKey(bracket)) {
                if (stack.isEmpty() || stack.pop() != bracketMap.get(bracket)) {
                    return false;
                }
            } else {
                return false;
            }
        }

        return stack.isEmpty();
    }
}