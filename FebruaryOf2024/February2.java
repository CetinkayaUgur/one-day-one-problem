package FebruaryOf2024;

public class February2 {
    /*
     * longestCommonPrefixResult += strs[i].charAt(index);
     */
    public String longestCommonPrefix(String[] strs) {
        String longestCommonPrefixResult = "";
        int index = 0;
        while(true){
            for(int i=0; i<strs.length-1 ; i++){
                if(strs[i].charAt(index)!= strs[i+1].charAt(index)){
                    return longestCommonPrefixResult;
                }
            }
            longestCommonPrefixResult += strs[index].charAt(index);
            index++;
        }
    }
}
