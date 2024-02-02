package FebruaryOf2024;

class February2 {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        else if(strs.length == 1) return strs[0];

        String reference = strs[0];

        for(int i = 0; i < reference.length(); i++) {
            char currentChar = reference.charAt(i);

            for(int j = 1; j < strs.length; j++) {
                if(strs[j].charAt(i) != currentChar) {
                    return reference.substring(0, i);
                }
            }
        }
        return reference;
    }
}