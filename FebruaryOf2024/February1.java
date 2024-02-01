package FebruaryOf2024;
class February1 {
    /*
     * https://leetcode.com/problems/palindrome-number/
     */
    public boolean isPalindrome(int x) {
        int number = x;
        String strNumber = Integer.toString(number);

        for(int i=0; i<strNumber.length()/2; i++){
            if(strNumber.charAt(i) != strNumber.charAt(strNumber.length()-i-1)) return false;
        }

        return true;
    }
}