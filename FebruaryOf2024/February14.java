package FebruaryOf2024;

public class February14 {
    /*
     * https://leetcode.com/problems/plus-one
     */
    public static void main(String[] args) {
        int[] digs = {9,8,7,6,5,4,3,2,1,0}; 
        int[] dig = plusOne(digs);
        
        for (int i = 0; i < dig.length; i++) {
            System.out.print(dig[i]);
        }
    }
    public static int[] plusOne(int[] digits) {
        int number = 0;
        
        for (int digit : digits) {
            number = number * 10 + digit;
        }
        
        number++; //add one to digits' number

        //We can find how many digits a number has this way "(int) Math.log10(number) + 1"
        int[] oneAddedArray = new int[(int) Math.log10(number) + 1];
        for (int i = oneAddedArray.length - 1; i >= 0; i--) {
            oneAddedArray[i] = number % 10;
            number /= 10;
        }

        return oneAddedArray;
    }
}
