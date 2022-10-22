/*
 * Problem Description
You are given a string A of size N.

Return the string A after reversing the string word by word.

NOTE:

A sequence of non-space characters constitutes a word.
Your reversed string should not contain leading or trailing spaces, even if it is present in the input string.
If there are multiple spaces between words, reduce them to a single space in the reversed string.


Problem Constraints
1 <= N <= 3 * 105



Input Format
The only argument given is string A.



Output Format
Return the string A after reversing the string word by word.



Example Input
Input 1:
    A = "the sky is blue"
Input 2:
    A = "this is ib"


Example Output
Output 1:
    "blue is sky the"
Output 2:
    "ib is this"    


Example Explanation
Explanation 1:
    We reverse the string word by word so the string becomes "blue is sky the".
Explanation 2:
    We reverse the string word by word so the string becomes "ib is this".

 */

public class Solution {
    public String solve(String A) {
        A = A.trim();
        int n = A.length();

        StringBuilder s = new StringBuilder();
        for (int i = n - 1; i >= 0; i--) {
            s.append(A.charAt(i));
        }
        // reverse word by word
        StringBuilder temp = new StringBuilder();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                sb.append(reverse(temp.toString()));
                temp = new StringBuilder();
                sb.append(" ");
            } else {
                temp.append(s.charAt(i));
            }
        }
        sb.append(reverse(temp.toString()));
        return sb.toString();
    }

    private String reverse(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
