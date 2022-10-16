import java.util.HashMap;

/*
 * Problem Description
 * Given an array of integers A, find and return whether the given array
 * contains a non-empty subarray with a sum equal to 0.
 * 
 * If the given array contains a sub-array with sum zero return 1, else return
 * 0.
 * 
 * 
 * 
 * Problem Constraints
 * 1 <= |A| <= 100000
 * 
 * -10^9 <= A[i] <= 10^9
 * 
 * 
 * 
 * Input Format
 * The only argument given is the integer array A.
 * 
 * 
 * 
 * Output Format
 * Return whether the given array contains a subarray with a sum equal to 0.
 * 
 * 
 * 
 * Example Input
 * Input 1:
 * 
 * A = [1, 2, 3, 4, 5]
 * Input 2:
 * 
 * A = [-1, 1]
 * 
 * 
 * Example Output
 * Output 1:
 * 
 * 0
 * Output 2:
 * 
 * 1
 * 
 * 
 * Example Explanation
 * Explanation 1:
 * 
 * No subarray has sum 0.
 * Explanation 2:
 * 
 * The array has sum 0.
 */

public class Solution {
    public int solve(int[] A) {

        int n = A.length;
        long[] pf = new long[n];
        pf[0] = A[0];
        for (int i = 1; i < n; i++) {
            pf[i] = A[i] + pf[i - 1];
            if (pf[i] == 0) {
                return 1;
            }
        }
        HashMap<Long, Integer> map = new HashMap<Long, Integer>();
        for (int i = 0; i < n; i++) {
            long num = pf[i];

            if (map.containsKey(num)) {
                return 1;
            } else {
                map.put(num, i);
            }
        }

        return 0;
    }
}
