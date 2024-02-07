package FebruaryOf2024;

import java.util.*;;

public class February7 {
    /*
     * https://www.hackerrank.com/challenges/java-strings-introduction/problem?isFullScreen=true
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String A = scanner.nextLine();
        A = A.substring(0, 1).toUpperCase() + A.substring(1);
        String B = scanner.nextLine();
        B = B.substring(0, 1).toUpperCase() + B.substring(1);

        //first line
        System.out.println(A.length() + B.length());

        //second line
        if (A.compareTo(B) <= 0) {
            System.out.println("No");
        }else {
            System.out.println("Yes");
        }

        //last line
        System.out.println(A +" "+ B);

        scanner.close();
    }
}
