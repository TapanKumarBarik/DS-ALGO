/*
 * Problem Description
 * Given an integer array A containing N distinct integers.
 * 
 * Find the number of unique pairs of integers in the array whose XOR is equal
 * to B.
 * 
 * NOTE:
 * 
 * Pair (a, b) and (b, a) is considered to be the same and should be counted
 * once.
 * 
 * 
 * Problem Constraints
 * 1 <= N <= 105
 * 
 * 1 <= A[i], B <= 107
 * 
 * 
 * 
 * Input Format
 * The first argument is an integer array A.
 * 
 * The second argument is an integer B.
 * 
 * 
 * 
 * Output Format
 * Return a single integer denoting the number of unique pairs of integers in
 * the array A whose XOR is equal to B.
 * 
 * 
 * 
 * Example Input
 * Input 1:
 * 
 * A = [5, 4, 10, 15, 7, 6]
 * B = 5
 * Input 2:
 * 
 * A = [3, 6, 8, 10, 15, 50]
 * B = 5
 * 
 * 
 * Example Output
 * Output 1:
 * 
 * 1
 * Output 2:
 * 
 * 2
 * 
 * 
 * Example Explanation
 * Explanation 1:
 * 
 * (10 ^ 15) = 5
 * Explanation 2:
 * 
 * (3 ^ 6) = 5 and (10 ^ 15) = 5
 */

//Brut force
public class Solution {
    public int solve(int[] A, int B) {

        int n = A.length;

        int count = 0;

        for (int i = 0; i < n; i++) {

            int curr = A[i];
            for (int j = i + 1; j < n; j++) {
                if ((curr ^ A[j]) == B) {
                    count++;
                }
            }
        }

        return count;
    }
}

// optimal
public class Solution {
    public int solve(int[] A, int B) {

        int n = A.length;

        int count = 0;
        HashSet<Integer> set = new HashSet();
        for (int i = 0; i < n; i++) {
            if (set.contains(A[i] ^ B)) {
                count++;
            }
            set.add(A[i]);
        }

        return count;
    }
}
