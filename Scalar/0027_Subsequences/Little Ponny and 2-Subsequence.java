/*
 * Problem Description

Little Ponny has been given a string A, and he wants to find out the lexicographically minimum subsequence from it of size >= 2. Can you help him?

A string a is lexicographically smaller than string b, if the first different letter in a and b is smaller in a. For example, "abc" is lexicographically smaller than "acc" because the first different letter is 'b' and 'c' which is smaller in "abc".

 



Problem Constraints

1 <= |A| <= 105

A only contains lowercase alphabets.



Input Format

The first and the only argument of input contains the string, A.



Output Format

Return a string representing the answer.



Example Input

Input 1:

 A = "abcdsfhjagj" 
Input 2:

 A = "ksdjgha" 


Example Output

Output 1:

 "aa" 
Output 2:

 "da" 


Example Explanation

Explanation 1:

 "aa" is the lexicographically minimum subsequence from A. 
Explanation 2:

 "da" is the lexicographically minimum subsequence from A. 
 */

public class Solution {
    public String solve(String A) {

        char min1 = A.charAt(0);
        int index = 0;
        int n = A.length();
        for (int i = 1; i < n - 1; i++) {
            if (A.charAt(i) < min1) {
                min1 = A.charAt(i);
                index = i;
            }
        }
        char min2 = A.charAt(n - 1);
        int index1 = n - 1;
        for (int i = n - 2; i > index; i--) {
            if (A.charAt(i) < min2) {
                min2 = A.charAt(i);
                index1 = i;
            }
        }
        String ans = "";
        ans += A.charAt(index);
        ans += A.charAt(index1);
        return ans;
    }
}
