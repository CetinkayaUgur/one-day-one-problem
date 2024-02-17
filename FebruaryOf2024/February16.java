package FebruaryOf2024;

public class February16 {
    /*
     * https://leetcode.com/problems/running-sum-of-1d-array/description/
     */
    public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) { 
            nums[i] += nums[i-1];               //
        }
        nums[nums.length-1] += nums[nums.length-2];
        return nums;
    }
}
