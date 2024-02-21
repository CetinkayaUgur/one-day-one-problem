package FebruaryOf2024;

public class February21 {
    /*
     * https://leetcode.com/problems/n-th-tribonacci-number/submissions/1182375465/
     */
    public int tribonacci(int n) {
        int result = 0;
        int a = 0;
        int b = 1;
        int c = 1;

        if (n == 1 || n == 2) return 1;

        for (int i = 3; i <= n; i++) {
            result = a + b + c;

            a = b;
            b = c;
            c = result;
        }

        return result;
    }
}