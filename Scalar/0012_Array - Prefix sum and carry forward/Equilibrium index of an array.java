/*
 * Problem Description
 * You are given an array A of integers of size N.
 * 
 * Your task is to find the equilibrium index of the given array
 * 
 * The equilibrium index of an array is an index such that the sum of elements
 * at lower indexes is equal to the sum of elements at higher indexes.
 * 
 * NOTE:
 * 
 * Array indexing starts from 0.
 * If there is no equilibrium index then return -1.
 * If there are more than one equilibrium indexes then return the minimum index.
 * 
 * 
 * 
 * Problem Constraints
 * 1 <= N <= 105
 * -105 <= A[i] <= 105
 * 
 * 
 * Input Format
 * First arugment is an array A .
 * 
 * 
 * Output Format
 * Return the equilibrium index of the given array. If no such index is found
 * then return -1.
 * 
 * 
 * Example Input
 * Input 1:
 * A=[-7, 1, 5, 2, -4, 3, 0]
 * Input 2:
 * 
 * A=[1,2,3]
 * 
 * 
 * Example Output
 * Output 1:
 * 3
 * Output 2:
 * 
 * -1
 * 
 * 
 * Example Explanation
 * Explanation 1:
 * 3 is an equilibrium index, because:
 * A[0] + A[1] + A[2] = A[4] + A[5] + A[6]
 * Explanation 1:
 * 
 * There is no such index.
 * 
 * 
 */

public class Solution {
    public int solve(int[] A) {

        int n = A.length;
        int[] left = new int[n];
        int[] right = new int[n];

        // left
        int leftSum = 0;

        for (int i = 0; i < n; i++) {
            leftSum += A[i];
            left[i] = leftSum;
        }

        // right
        int rightSum = 0;

        for (int i = n - 1; i >= 0; i--) {
            rightSum += A[i];
            right[i] = rightSum;
        }

        for (int i = 0; i < n; i++) {
            if (left[i] == right[i]) {
                return i;
            }
        }
        return -1;
    }
}
