package FebruaryOf2024;

import java.util.*;

public class February5 {
    /*
     * https://www.hackerrank.com/challenges/java-anagrams/problem?isFullScreen=true
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        
        System.out.println(isAnagram(a,b));

        scanner.close();
    }
    
    public static String isAnagram(String a, String b){
        String firstString = a.toLowerCase();
        String secondString = b.toLowerCase();
        
        Hashtable<Character, Integer> firstStringHashtable = createFrequencyMap(firstString);
        Hashtable<Character, Integer> secondStringHashtable = createFrequencyMap(secondString);
        
        if (firstStringHashtable.equals(secondStringHashtable)) return "Anagrams";
        else return "Not Anagrams";
    }
    
    private static Hashtable<Character, Integer> createFrequencyMap(String str) {
        Hashtable<Character, Integer> frequencyMap = new Hashtable<>();

        for (char c : str.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);//we found frequency of any char in 'str' 
        }

        return frequencyMap;
    }
}
