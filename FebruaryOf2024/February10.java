package FebruaryOf2024;

import java.util.*;

public class February10 {
    /*
     * https://www.hackerrank.com/challenges/java-stdin-stdout/problem?isFullScreen=true
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        double doubleNumber = Double.parseDouble(scanner.nextLine());
        String string = scanner.nextLine();
        
        System.out.println("String: " + string);
        System.out.println("Double: " + doubleNumber);
        System.out.println("Int: "+ number);
        
        scanner.close();
    }
}
