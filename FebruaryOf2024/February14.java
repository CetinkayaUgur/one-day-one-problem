package FebruaryOf2024;

public class February14 {
    /*
     * https://leetcode.com/problems/plus-one
     */
    public int[] plusOne(int[] digits) {
        int number = 0;
        
        for (int i = 0; i < digits.length; i++) {
            number += digits[i]*Math.pow(10, digits.length-1-i);
        }

        number++; //add one to digits number

        int[] oneAddedArray = new int[(int) Math.log10(number) + 1];
        for (int i = oneAddedArray.length - 1; i >= 0; i--) {
            oneAddedArray[i] = number % 10;
            number /= 10;
        }

        return oneAddedArray;
    }
}
