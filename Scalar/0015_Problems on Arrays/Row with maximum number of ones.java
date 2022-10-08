/*
 * Problem Description
 * 
 * Given a binary sorted matrix A of size N x N. Find the row with the maximum
 * number of 1.
 * 
 * NOTE:
 * 
 * If two rows have the maximum number of 1 then return the row which has a
 * lower index.
 * Rows are numbered from top to bottom and columns are numbered from left to
 * right.
 * Assume 0-based indexing.
 * Assume each row to be sorted by values.
 * Expected time complexity is O(rows).
 * 
 * 
 * Problem Constraints
 * 
 * 1 <= N <= 1000
 * 
 * 0 <= A[i] <= 1
 * 
 * 
 * 
 * Input Format
 * 
 * The only argument given is the integer matrix A.
 * 
 * 
 * 
 * Output Format
 * 
 * Return the row with the maximum number of 1.
 * 
 * 
 * 
 * Example Input
 * 
 * Input 1:
 * 
 * A = [ [0, 1, 1]
 * [0, 0, 1]
 * [0, 1, 1] ]
 * Input 2:
 * 
 * A = [ [0, 0, 0, 0]
 * [0, 1, 1, 1] ]
 * 
 * 
 * Example Output
 * 
 * Output 1:
 * 
 * 0
 * Output 2:
 * 
 * 1
 * 
 * 
 * Example Explanation
 * 
 * Explanation 1:
 * 
 * Row 0 has maximum number of 1s.
 * Explanation 2:
 * 
 * Row 1 has maximum number of 1s.
 * 
 */

public class Solution {
    public int solve(int[][] A) {

        int count = 0;
        int row = 0;
        int maxCount = 0;
        int n = A.length;
        int m = A[0].length;
        int i = 0;
        int j = m - 1;

        while (i < n && j >= 0) {
            if (A[i][j] == 1) {
                j--;
                count++;
            } else {
                i++;
            }
            if (maxCount < count) {
                maxCount = count;
                row = i;
            }
        }
        return row;
    }
}
