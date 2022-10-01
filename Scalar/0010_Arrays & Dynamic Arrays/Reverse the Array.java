/*
 * Problem Description
 * You are given a constant array A.
 * 
 * You are required to return another array which is the reversed form of the
 * input array.
 * 
 * 
 * 
 * Problem Constraints
 * 1 <= A.size() <= 10000
 * 
 * 1 <= A[i] <= 10000
 * 
 * 
 * 
 * Input Format
 * First argument is a constant array A.
 * 
 * 
 * 
 * Output Format
 * Return an integer array.
 * 
 * 
 * 
 * Example Input
 * Input 1:
 * 
 * A = [1,2,3,2,1]
 * Input 2:
 * 
 * A = [1,1,10]
 * 
 * 
 * Example Output
 * Output 1:
 * 
 * [1,2,3,2,1]
 * Output 2:
 * 
 * [10,1,1]
 * 
 * 
 * Example Explanation
 * Explanation 1:
 * 
 * Reversed form of input array is same as original array
 * Explanation 2:
 * 
 * Clearly, Reverse of [1,1,10] is [10,1,1]
 */

public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] solve(final int[] A) {

        int i = 0;
        int n = A.length - 1;

        while (i < n) {
            swap(A, i, n);
            i++;
            n--;
        }
        return A;
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
