/*
 * Given a binary string A. It is allowed to do at most one swap between any 0
 * and 1. Find and return the length of the longest consecutive 1’s that can be
 * achieved.
 * 
 * 
 * Input Format
 * 
 * The only argument given is string A.
 * Output Format
 * 
 * Return the length of the longest consecutive 1’s that can be achieved.
 * Constraints
 * 
 * 1 <= length of string <= 1000000
 * A contains only characters 0 and 1.
 * For Example
 * 
 * Input 1:
 * A = "111000"
 * Output 1:
 * 3
 * 
 * Input 2:
 * A = "111011101"
 * Output 2:
 * 7
 */

public class Solution {
    public int solve(String A) {

        int totalOne = 0;
        int n = A.length();
        for (int i = 0; i < n; i++) {
            if (A.charAt(i) == '1') {
                totalOne++;
            }
        }

        // find largerst subarray with only one zero;
        int maxCount = 0;
        for (int i = 0; i < n; i++) {
            int count = 0;
            int minZero = 1;
            int j = i;
            while (minZero > -1 && j < n) {
                if (A.charAt(j) == '1') {
                    count++;
                } else {
                    minZero--;
                }
                j++;
            }
            //
            maxCount = Math.max(maxCount, count);
        }

        if (maxCount == totalOne) {
            return maxCount;
        }
        return maxCount + 1;
    }
}
