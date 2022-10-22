import java.util.Arrays;

/*
 * Problem Description
 * Given the array of strings A, you need to find the longest string S, which is
 * the prefix of ALL the strings in the array.
 * 
 * The longest common prefix for a pair of strings S1 and S2 is the longest
 * string S which is the prefix of both S1 and S2.
 * 
 * Example: the longest common prefix of "abcdefgh" and "abcefgh" is "abc".
 * 
 * 
 * 
 * Problem Constraints
 * 0 <= sum of length of all strings <= 1000000
 * 
 * 
 * 
 * Input Format
 * The only argument given is an array of strings A.
 * 
 * 
 * 
 * Output Format
 * Return the longest common prefix of all strings in A.
 * 
 * 
 * 
 * Example Input
 * Input 1:
 * 
 * A = ["abcdefgh", "aefghijk", "abcefgh"]
 * Input 2:
 * 
 * A = ["abab", "ab", "abcd"];
 * 
 * 
 * Example Output
 * Output 1:
 * 
 * "a"
 * Output 2:
 * 
 * "ab"
 * 
 * 
 * Example Explanation
 * Explanation 1:
 * 
 * Longest common prefix of all the strings is "a".
 * Explanation 2:
 * 
 * Longest common prefix of all the strings is "ab".
 */

public class Solution {
    public String longestCommonPrefix(String[] A) {

        int n = A.length;

        Arrays.sort(A);
        String curr1 = A[0];
        String curr2 = A[n - 1];

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < Math.min(curr1.length(), curr2.length()); i++) {
            if (curr1.charAt(i) == curr2.charAt(i)) {
                sb.append(curr1.charAt(i));
            } else {
                break;
            }

        }

        return sb.toString();
    }
}
