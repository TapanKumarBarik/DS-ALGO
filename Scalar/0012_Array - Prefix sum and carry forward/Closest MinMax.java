/*
 * Problem Description
 * Given an array A, find the size of the smallest subarray such that it
 * contains at least one occurrence of the maximum value of the array
 * 
 * and at least one occurrence of the minimum value of the array.
 * 
 * 
 * 
 * Problem Constraints
 * 1 <= |A| <= 2000
 * 
 * 
 * 
 * Input Format
 * First and only argument is vector A
 * 
 * 
 * 
 * Output Format
 * Return the length of the smallest subarray which has at least one occurrence
 * of minimum and maximum element of the array
 * 
 * 
 * 
 * Example Input
 * Input 1:
 * 
 * A = [1, 3]
 * Input 2:
 * 
 * A = [2]
 * 
 * 
 * Example Output
 * Output 1:
 * 
 * 2
 * Output 2:
 * 
 * 1
 * 
 * 
 * Example Explanation
 * Explanation 1:
 * 
 * Only choice is to take both elements.
 * Explanation 2:
 * 
 * Take the whole array.
 * 
 * 
 */

public class Solution {
    public int solve(int[] A) {
        int n = A.length;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            min = Math.min(min, A[i]);
            max = Math.max(max, A[i]);
        }
        if (max == min)
            return 1;
        int ans = n;
        for (int i = 0; i < n; i++) {
            if (A[i] == max) {
                int count = 1;
                for (int j = i + 1; j < n; j++) {
                    count++;
                    if (A[j] == min) {
                        ans = Math.min(ans, count);
                        break;
                    }
                }
            }
            // min
            if (A[i] == min) {
                int count = 1;
                for (int j = i + 1; j < n; j++) {
                    count++;
                    if (A[j] == max) {
                        ans = Math.min(ans, count);
                        break;
                    }
                }
            }
        }
        return ans;
    }
}
