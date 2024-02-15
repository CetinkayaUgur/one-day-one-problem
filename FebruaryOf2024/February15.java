package FebruaryOf2024;

public class February15 {
    /*
     * https://leetcode.com/problems/modify-the-matrix/
     */
    public int[][] modifiedMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        
        // we find the largest numbers in all columns and keep them in an array
        int[] maxValues = new int[n];
        for (int j = 0; j < n; j++) {
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < m; i++) {
                max = Math.max(max, matrix[i][j]);
            }
            maxValues[j] = max;
        }
        
        // We define the new matrix and assign the elements with a value of -1 to the largest element in the column containing that element.
        int[][] answer = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                answer[i][j] = matrix[i][j] == -1 ? maxValues[j] : matrix[i][j];
            }
        }
        
        return answer;
    }
}
