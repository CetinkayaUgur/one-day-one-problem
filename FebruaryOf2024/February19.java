package FebruaryOf2024;

public class February19 {
    /*
     * https://leetcode.com/problems/fibonacci-number/
     */
    public int fib(int n) {
        int total = 0;
        
        int a = 0; // F(0)
        int b = 1; // F(1)

        if (n == 1) return 1;
        for (int i = 1; i < n; i++) {
            total = a + b;
            a = b;
            b = total;
        }
        return total;
    }
}
