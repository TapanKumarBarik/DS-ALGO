/*
 * Problem Description
 * Given a string A of size N, find and return the longest palindromic substring
 * in A.
 * 
 * Substring of string A is A[i...j] where 0 <= i <= j < len(A)
 * 
 * Palindrome string:
 * A string which reads the same backwards. More formally, A is palindrome if
 * reverse(A) = A.
 * 
 * Incase of conflict, return the substring which occurs first ( with the least
 * starting index).
 * 
 * 
 * 
 * Problem Constraints
 * 1 <= N <= 6000
 * 
 * 
 * 
 * Input Format
 * First and only argument is a string A.
 * 
 * 
 * 
 * Output Format
 * Return a string denoting the longest palindromic substring of string A.
 * 
 * 
 * 
 * Example Input
 * A = "aaaabaaa"
 * 
 * 
 * Example Output
 * "aaabaaa"
 * 
 * 
 * Example Explanation
 * We can see that longest palindromic substring is of length 7 and the string
 * is "aaabaaa".
 */

public class Solution {
    public String longestPalindrome(String A) {

        int n = A.length();
        int maxLength = 0;
        String res = "";
        String s2 = "";

        for (int i = 0; i < n; i++) {
            String s1 = isPalindrome(A, i, i);
            if (i + 1 < n) {
                s2 = isPalindrome(A, i, i + 1);
            }
            if (s1.length() > s2.length()) {
                if (s1.length() > maxLength) {
                    res = s1;
                }
            } else if (s2.length() > maxLength) {
                res = s2;
            }
            maxLength = Math.max(s1.length(), Math.max(s2.length(), maxLength));
        }
        return res;

    }

    private String isPalindrome(String s, int i, int j) {

        int n = s.length();
        if (s.charAt(i) != s.charAt(j)) {
            return "";
        }
        while (i >= 0 && j < n) {
            if (s.charAt(i) != s.charAt(j)) {
                break;
            }
            i--;
            j++;
        }

        return s.substring(i + 1, j);
    }
}
