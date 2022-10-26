import java.util.Arrays;

/*
 * Problem Description
 * Given an integer array, A of size N.
 * You have to find all possible non-empty subsequences of the array of numbers
 * and then, for each subsequence, find the difference between the largest and
 * smallest numbers in that subsequence. Then add up all the differences to get
 * the number.
 * 
 * As the number may be large, output the number modulo 1e9 + 7 (1000000007).
 * 
 * NOTE: Subsequence can be non-contiguous.
 * 
 * 
 * 
 * Problem Constraints
 * 1 <= N <= 10000
 * 
 * 1<= A[i] <=1000
 * 
 * 
 * 
 * Input Format
 * First argument is an integer array A.
 * 
 * 
 * 
 * Output Format
 * Return an integer denoting the output.
 * 
 * 
 * 
 * Example Input
 * Input 1:
 * 
 * A = [1, 2]
 * Input 2:
 * 
 * A = [1]
 * 
 * 
 * Example Output
 * Output 1:
 * 
 * 1
 * Output 2:
 * 
 * 0
 * 
 * 
 * Example Explanation
 * Explanation 1:
 * 
 * All possible non-empty subsets are:
 * [1] largest-smallest = 1 - 1 = 0
 * [2] largest-smallest = 2 - 2 = 0
 * [1 2] largest-smallest = 2 - 1 = 1
 * Sum of the differences = 0 + 0 + 1 = 1
 * So, the resultant number is 1
 * Explanation 2:
 * 
 * Only 1 subsequence of 1 element is formed.
 * 
 */

public class Solution {
    public int solve(int[] A) {

        int mod = 1000000007;

        Arrays.sort(A);
        int n = A.length;
        long res = 0;

        // min
        for (int i = 0; i < n; i++) {
            long minn = (long) (1L * A[i] * pow(n - i - 1, mod)) % mod;
            long maxx = (long) (1L * A[n - i - 1] * pow(n - i - 1, mod)) % mod;
            long tempRes = maxx - minn;
            res = (res % mod + tempRes % mod) % mod;
        }

        return (int) (res + mod) % mod;
    }

    public int pow(int B, int C) {
        if (B == 0)
            return 1;
        long x = pow(B / 2, C);
        if (B % 2 == 0) {
            x = (x * x) % C;
        } else {
            x = (((x * x) % C) * 2) % C;
        }
        return (int) ((x + C) % C);
    }
}
