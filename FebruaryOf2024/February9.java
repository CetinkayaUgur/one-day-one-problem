package FebruaryOf2024;

import java.util.*;;

public class February9 {
    /*
     * https://www.hackerrank.com/challenges/java-if-else/problem?isFullScreen=true
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n % 2 == 1) System.out.println("Weird");
        else if (n % 2 == 0 & n >= 2 & n <= 5) System.out.println("Not Weird");
        else if (n % 2 == 0 & n >= 6 & n <= 20) System.out.println("Weird");
        else if (n % 2 == 0 & n > 20) System.out.println("Not Weird");

        scanner.close();
    }
}
