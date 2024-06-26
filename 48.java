// LeetCode 48 Rotate imgae
// Reference: https://leetcode.com/problems/rotate-image/solutions/18879/ac-java-in-place-solution-with-explanation-easy-to-understand/?envType=featured-list&envId=top-interview-questions?envType=featured-list&envId=top-interview-questions

class Solution {
    public void rotate(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++){
            for (int j = i; j < matrix[0].length; j++){
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;

            }
        }

        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix.length / 2; j++){
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length - 1 - j];
                matrix[i][matrix.length - 1 - j] = temp;
            }
        }
    }
}