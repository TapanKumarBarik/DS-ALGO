/*
 * Problem Description
 * You are given a 2D integer matrix A, make all the elements in a row or column
 * zero if the A[i][j] = 0. Specifically, make entire ith row and jth column
 * zero.
 * 
 * 
 * 
 * Problem Constraints
 * 1 <= A.size() <= 103
 * 
 * 1 <= A[i].size() <= 103
 * 
 * 0 <= A[i][j] <= 103
 * 
 * 
 * 
 * Input Format
 * First argument is a vector of vector of integers.(2D matrix).
 * 
 * 
 * 
 * Output Format
 * Return a vector of vector after doing required operations.
 * 
 * 
 * 
 * Example Input
 * Input 1:
 * 
 * [1,2,3,4]
 * [5,6,7,0]
 * [9,2,0,4]
 * 
 * 
 * Example Output
 * Output 1:
 * 
 * [1,2,0,0]
 * [0,0,0,0]
 * [0,0,0,0]
 * 
 * 
 * Example Explanation
 * Explanation 1:
 * 
 * A[2][4] = A[3][3] = 0, so make 2nd row, 3rd row, 3rd column and 4th column
 * zero
 */

public class Solution {
    public int[][] solve(int[][] A) {

        int row = A.length;
        int col = A[0].length;
        int flag = 1;

        for (int i = 0; i < row; i++) {

            for (int j = 0; j < col; j++) {

                if (A[i][j] == 0) {
                    if (i == 0) {
                        flag = 0;
                    } else {
                        A[i][0] = 0;
                        A[0][j] = 0;
                    }
                }
            }
        }

        //

        for (int i = row - 1; i >= 0; i--) {

            for (int j = col - 1; j >= 0; j--) {

                if (i == 0 && flag == 0) {
                    A[i][j] = 0;
                }
                if (i != 0 && (A[i][0] == 0 || A[0][j] == 0)) {
                    A[i][j] = 0;
                }
            }
        }

        return A;
    }
}
