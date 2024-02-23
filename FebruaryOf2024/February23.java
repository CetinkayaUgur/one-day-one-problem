package FebruaryOf2024;

import java.util.HashSet;

public class February23 {
    /*
     * https://leetcode.com/problems/first-letter-to-appear-twice/submissions/1184294452/
     */
    public char repeatedCharacter(String s) {
        HashSet<Character> charSet = new HashSet<>(); // We keep the every char in this hashset
        for (int i = 0; i < s.length(); i++) { // We look at all iterations of the given s string
            if (charSet.contains(s.charAt(i))){ // If current char already exist in charset we return it
                return s.charAt(i);
            } else { // If current char doesn't exist in hashset we add it in 
            charSet.add(s.charAt(i));
            }
        }
        return 0; // To avoid errors we coded this line so its never return 0 
    }
}
