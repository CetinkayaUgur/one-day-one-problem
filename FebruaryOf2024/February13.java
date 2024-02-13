package FebruaryOf2024;

import java.util.*;

public class February13 {
    /*
     * https://leetcode.com/problems/length-of-last-word/description/
     */
    public int lengthOfLastWord(String s) {
        String str = s.trim(); //The trim method is used to get rid of spaces at the beginning and end of a text.

        int lengthOfLastWord = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == ' ') {
                break;
            }
            lengthOfLastWord++;
        }
        
        return lengthOfLastWord;
    }
}
