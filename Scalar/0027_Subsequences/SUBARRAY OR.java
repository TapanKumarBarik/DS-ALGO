/*
 * Problem Description
 * You are given an array of integers A of size N.
 * 
 * The value of a subarray is defined as BITWISE OR of all elements in it.
 * 
 * Return the sum of value of all subarrays of A % 109 + 7.
 * 
 * 
 * 
 * Problem Constraints
 * 1 <= N <= 105
 * 
 * 1 <= A[i] <= 108
 * 
 * 
 * 
 * Input Format
 * The first argument given is the integer array A.
 * 
 * 
 * 
 * Output Format
 * Return the sum of Value of all subarrays of A % 109 + 7.
 * 
 * 
 * 
 * Example Input
 * Input 1:
 * 
 * A = [1, 2, 3, 4, 5]
 * Input 2:
 * 
 * A = [7, 8, 9, 10]
 * 
 * 
 * Example Output
 * Output 1:
 * 
 * 71
 * Output 2:
 * 
 * 110
 * 
 * 
 * Example Explanation
 * Explanation 1:
 * 
 * Value([1]) = 1
 * Value([1, 2]) = 3
 * Value([1, 2, 3]) = 3
 * Value([1, 2, 3, 4]) = 7
 * Value([1, 2, 3, 4, 5]) = 7
 * Value([2]) = 2
 * Value([2, 3]) = 3
 * Value([2, 3, 4]) = 7
 * Value([2, 3, 4, 5]) = 7
 * Value([3]) = 3
 * Value([3, 4]) = 7
 * Value([3, 4, 5]) = 7
 * Value([4]) = 4
 * Value([4, 5]) = 5
 * Value([5]) = 5
 * Sum of all these values = 71
 * Explanation 2:
 * 
 * Sum of value of all subarray is 110.
 */

public class Solution {
    public int solve(int[] A) {
        long sum = 0;
        int mod = 1000000007;
        int n = A.length;
        for (int i = 0; i < 31; i++) {
            int[] bytes = new int[n];
            for (int j = 0; j < n; j++) {
                bytes[j] = (A[j] >> i) & 1;
            }
            long tempSum = calc(bytes, n, i);
            sum = (sum + tempSum) % mod;
        }
        return (int) (sum + mod) % mod;
    }

    long calc(int[] arr, int n, int j) {
        // when you multiply two int then result will be int
        // so here you need to take totalSubArray long and one parameter will be long as
        // well
        // 1L means converting entire expression as long
        // read java auto type promotion
        long totalSubArray = 1L * n * (n + 1) / 2; // if n is 10^5 then n^2 will be 10^10 will get overflow issue
        int consucativeZero = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                consucativeZero++;
            }
            if (arr[i] == 1) {
                long m = 1L * consucativeZero * (consucativeZero + 1) / 2; // one parameter will be long as well, 1L
                                                                           // means converting entire expression as long
                totalSubArray -= m;
                consucativeZero = 0;
            }
        }
        if (consucativeZero != 0) {
            long m = 1L * consucativeZero * (consucativeZero + 1) / 2;
            totalSubArray -= m;
        }
        return totalSubArray * (int) (Math.pow(2, j));
    }
}