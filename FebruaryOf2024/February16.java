package FebruaryOf2024;

public class February16 {
    /*
     * https://leetcode.com/problems/running-sum-of-1d-array/description/
     */
    public int[] runningSum(int[] nums) {
        int[] runningSum = nums;            //Since the problem asked us to define a new array as runningSum, we cloned the array
        for (int i = 1; i < runningSum.length; i++) { 
            runningSum[i] += runningSum[i-1];               //We proceed by adding all indices here
        }
        return runningSum;
    }
}
