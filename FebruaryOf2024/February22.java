package FebruaryOf2024;

import java.util.HashSet;

public class February22 {
    /*
     * https://leetcode.com/problems/contains-duplicate/
     */
    public boolean containsDuplicate(int[] nums) {
        // Creating a hashset to keep number
        HashSet<Integer> set = new HashSet<>();
        
        for (int num : nums) {
            // Number we are looking for is already exist in hashset return true
            if (set.contains(num)) {
                return true;
            }
            // If its not exist then we put it in hashset
            set.add(num);
        }
        
        // Return false if none of numbers repeat
        return false;
    }
}
