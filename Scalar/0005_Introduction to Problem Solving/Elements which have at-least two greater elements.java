/*
 * Problem Description
 * 
 * You are given an array of distinct integers A, you have to find and return
 * all elements in array which have at-least two greater elements than
 * themselves.
 * 
 * NOTE: The result should have the order in which they are present in the
 * original array.
 * 
 * 
 * 
 * Problem Constraints
 * 
 * 3 <= |A| <= 105
 * 
 * -109 <= A[i] <= 109
 * 
 * 
 * 
 * Input Format
 * 
 * First and only argument is an integer array A.
 * 
 * 
 * 
 * Output Format
 * 
 * Return an integer array containing the elements of A which have at-least two
 * greater elements than themselves in A.
 * 
 * 
 * 
 * Example Input
 * 
 * Input 1:
 * 
 * A = [1, 2, 3, 4, 5]
 * Input 2:
 * 
 * A = [11, 17, 100, 5]
 * 
 * 
 * Example Output
 * 
 * Output 1:
 * 
 * [1, 2, 3]
 * Output 2:
 * 
 * [11, 5]
 * 
 * 
 * Example Explanation
 * 
 * Explanation 1:
 * 
 * Number of elements greater than 1: 4
 * Number of elements greater than 2: 3
 * Number of elements greater than 3: 2
 * Number of elements greater than 4: 1
 * Number of elements greater than 5: 0
 * Elements 1, 2 and 3 have atleast 2 elements strictly greater than themselves.
 * Explanation 2:
 * 
 * Number of elements greater than 11: 2
 * Number of elements greater than 17: 1
 * Number of elements greater than 100: 0
 * Number of elements greater than 5: 3
 * Elements 5 and 11 have atleast 2 elements strictly greater than themselves.
 * 
 * 
 * See Expected Output
 */

public class Solution {
    public int[] solve(int[] A) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int n = A.length;
        int[] arr = new int[n - 2];
        int index = 0;
        for (int i = 0; i < n; i++) {
            max1 = Math.max(max1, A[i]);
        }
        for (int i = 0; i < n; i++) {
            if (A[i] != max1) {
                max2 = Math.max(max2, A[i]);
            }
        }
        for (int i = 0; i < n; i++) {
            if (A[i] != max1 && A[i] != max2) {
                arr[index] = A[i];
                index++;
            }
        }

        return arr;
    }
}
