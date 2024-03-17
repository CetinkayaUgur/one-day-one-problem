package MarchOf2024;

public class March4 {
    /*
     * https://leetcode.com/problems/add-binary/submissions/1206646818/
     */
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;

        // Iterate through both strings, starting from the rightmost digits
        while (i >= 0 || j >= 0 || carry > 0) {
            int digitA = i >= 0 ? Character.getNumericValue(a.charAt(i)) : 0;
            int digitB = j >= 0 ? Character.getNumericValue(b.charAt(j)) : 0;
            int sum = digitA + digitB + carry;

            // Add the current digit based on the sum
            sb.append(sum % 2);
            carry = sum / 2; // Carry over for the next digit

            i--;
            j--;
        }

        // Reverse the resulting string to get the correct order
        return sb.reverse().toString();
    }
}
