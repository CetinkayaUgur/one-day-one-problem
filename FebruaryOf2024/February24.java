package FebruaryOf2024;

import java.util.HashMap;

public class February24 {
    /*
     * https://leetcode.com/problems/first-unique-character-in-a-string/description/
     */
    public int firstUniqChar(String s) {
        HashMap <Character, Integer> frequencyMap = new HashMap<>();

        // It is a loop that calculates the frequencies of characters in a string
        for (char c : s.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0)+1);
        }

        // We find the first char that is never repeated
        for (int i = 0; i < s.length(); i++) {
            if (frequencyMap.get(s.charAt(i)) == 1) return i;
        }

        // Return -1 if all char is repeated
        return -1;
    }
}
