package FebruaryOf2024;

import java.util.*;

public class February6 {
    public static void main(String[] args) {
        /*
         * https://www.hackerrank.com/challenges/java-string-tokens/problem?isFullScreen=true
         */
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine().trim();
        String[] wordsArray = string.split("[ !,?._'@]+");
        
        if(string.equals("") || string.equals(" ")){
            System.out.println(0);
        }else{
            System.out.println(wordsArray.length);
            for (String word : wordsArray) {
                System.out.println(word);
            }
        }
        
        scanner.close();
    }
}
