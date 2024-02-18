package FebruaryOf2024;

public class February18 {
    /*
     * https://leetcode.com/problems/search-insert-position/description/
     */
    public int searchInsert(int[] nums, int target) {
        int head = 0;
        int tail = nums.length - 1;
        while (head <= tail) {
            int mid = head + (tail - head) / 2;
            
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                head = mid + 1;
            } else {
                tail = mid - 1;
            }
        }
        return nums.length;
    }
}

