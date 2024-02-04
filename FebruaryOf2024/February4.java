package FebruaryOf2024;

import java.util.Scanner;

public class February4 {
    /*
     * https://www.hackerrank.com/challenges/java-string-reverse/problem?isFullScreen=true
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        boolean key = true;

        for (int i = 0; i < str.length()/2; i++) {
            if (str.charAt(i) != str.charAt(str.length()-1-i)){
                System.out.println("No");
                key = false;
                break;
            }
        }
        if (key) {
            System.out.println("Yes");            
        }
    }
}
