/*
 * Problem Description
 * Given an array with N objects colored red, white, or blue, sort them so that
 * objects of the same color are adjacent, with the colors in the order red,
 * white, and blue.
 * 
 * We will use the integers 0, 1, and 2 to represent red, white, and blue,
 * respectively.
 * 
 * Note: Using the library sort function is not allowed.
 * 
 * 
 * 
 * Problem Constraints
 * 1 <= N <= 1000000
 * 0 <= A[i] <= 2
 * 
 * 
 * Input Format
 * First and only argument of input contains an integer array A.
 * 
 * 
 * Output Format
 * Return an integer array in asked order
 * 
 * 
 * Example Input
 * Input 1 :
 * A = [0 1 2 0 1 2]
 * Input 2:
 * 
 * A = [0]
 * 
 * 
 * Example Output
 * Output 1:
 * [0 0 1 1 2 2]
 * Output 2:
 * 
 * [0]
 * 
 * 
 * Example Explanation
 * Explanation 1:
 * [0 0 1 1 2 2] is the required order.
 * 
 * 
 */
public class Solution {
    public int[] sortColors(int[] A) {

        int zeroCount = 0;
        int oneCount = 0;
        int twoCount = 0;
        int n = A.length;

        for (int i = 0; i < n; i++) {

            if (A[i] == 0) {
                zeroCount++;
            } else if (A[i] == 1) {
                oneCount++;
            } else {
                twoCount++;
            }
        }

        for (int i = 0; i < zeroCount; i++) {
            A[i] = 0;
        }
        for (int i = zeroCount; i < zeroCount + oneCount; i++) {
            A[i] = 1;
        }
        for (int i = zeroCount + oneCount; i < n; i++) {
            A[i] = 2;
        }
        return A;
    }
}
