import java.util.Arrays;

/*
 * Given an array of integers A and an integer B. Find and return the maximum
 * value of | s1 - s2 |
 * 
 * where s1 = sum of any subset of size B, s2 = sum of elements of A - sum of
 * elemets of s1
 * 
 * Note |x| denotes the absolute value of x.
 * 
 * 
 * Input Format
 * 
 * The arguments given are the integer array A and integer B.
 * Output Format
 * 
 * Return the maximum value of | s1 - s2 |.
 * Constraints
 * 
 * 1 <= B < length of the array <= 100000
 * 1 <= A[i] <= 10^5
 * For Example
 * 
 * Input 1:
 * A = [1, 2, 3, 4, 5]
 * B = 2
 * Output 1:
 * 9
 * 
 * Input 2:
 * A = [5, 17, 100, 11]
 * B = 3
 * Output 2:
 * 123
 */

public class Solution {
    public int solve(int[] A, int B) {
        Arrays.sort(A);
        int sum = 0;
        int minSum = 0;
        int maxSum = 0;
        int n = A.length;

        // sum
        for (int i = 0; i < n; i++) {
            sum += A[i];
        }
        // min sum
        for (int i = 0; i < B; i++) {
            minSum += A[i];
        }

        // maxSum
        for (int i = n - 1; i > n - 1 - B; i--) {
            maxSum += A[i];
        }

        int num1 = Math.abs(minSum - (sum - minSum));
        int num2 = Math.abs(maxSum - (sum - maxSum));

        return Math.max(num1, num2);
    }
}
