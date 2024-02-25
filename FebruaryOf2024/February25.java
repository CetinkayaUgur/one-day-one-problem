package FebruaryOf2024;

import java.util.HashMap;

public class February25 {
    /*
     * https://leetcode.com/problems/ransom-note/
     */
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> magazineMap = new HashMap<>();
        
        for (char c : magazine.toCharArray()) {
            magazineMap.put(c, magazineMap.getOrDefault(c, 0) + 1);
        }

        for (char c : ransomNote.toCharArray()) {
            if (!magazineMap.containsKey(c) || magazineMap.get(c) == 0) {
                return false;
            } else {
                magazineMap.put(c, magazineMap.get(c) - 1);
            }
        }

        return true;
    }
}
