/*
 * Given two strings A and B, find if A is a subsequence of B.
 * 
 * Return "YES" if A is a subsequence of B, else return "NO".
 * 
 * 
 * Input Format
 * 
 * The first argument given is the string A.
 * The second argument given is the string B.
 * Output Format
 * 
 * Return "YES" if A is a subsequence of B, else return "NO".
 * Constraints
 * 
 * 1 <= lenght(A), length(B) <= 100000
 * 'a' <= A[i], B[i] <= 'z'
 * For Example
 * 
 * Input 1:
 * A = "bit"
 * B = "dfbkjijgbbiihbmmt"
 * Output 1:
 * YES
 * 
 * Input 2:
 * A = "apple"
 * B = "appel"
 * Output 2:
 * "NO"
 */

public class Solution {
    public String solve(String A, String B) {

        int n = A.length();
        int m = B.length();
        String no = "NO";
        String yes = "YES";

        if (n > m) {
            return no;
        }

        int i = 0;
        int j = 0;
        String a = "";

        while (i < n && j < m) {

            if (A.charAt(i) == B.charAt(j)) {
                a = a + B.charAt(j);
                i++;
                j++;
            } else {
                j++;
            }

        }

        if (A.equals(a) == false) {
            return no;
        }

        return yes;
    }
}
