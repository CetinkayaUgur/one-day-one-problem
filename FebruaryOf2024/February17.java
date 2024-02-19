package FebruaryOf2024;

public class February17 {
    /*
     * https://leetcode.com/problems/climbing-stairs/
     */
    public int climbStairs(int n) {
        //The solution is very similar to Fibonacci
        if (n == 1) {
            return 1;
        }
        int[] dp = new int[n + 1];
        dp[1] = 1; // if we have 1 steps we only have one way
        dp[2] = 2; // and we have two way 1+1 or 2 for 
        for (int i = 3; i <= n; i++) { // i = 3 because 1 and 2 step stairs' way is known
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}

