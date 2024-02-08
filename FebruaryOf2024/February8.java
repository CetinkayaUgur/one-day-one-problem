package FebruaryOf2024;

import java.util.*;

public class February8 {
    /*
     * https://www.hackerrank.com/challenges/java-loops-i/problem?isFullScreen=true
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + i*n);
        }

        scanner.close();
    }
}
