/*
 * Problem Description
 * 
 * Akash likes playing with strings. One day he thought of applying following
 * operations on the string in the given order:
 * 
 * Concatenate the string with itself.
 * Delete all the uppercase letters.
 * Replace each vowel with '#'.
 * You are given a string A of size N consisting of lowercase and uppercase
 * alphabets. Return the resultant string after applying the above operations.
 * 
 * NOTE: 'a' , 'e' , 'i' , 'o' , 'u' are defined as vowels.
 * 
 * 
 * 
 * Problem Constraints
 * 
 * 1<=N<=100000
 * 
 * 
 * Input Format
 * 
 * First argument is a string A of size N.
 * 
 * 
 * 
 * Output Format
 * 
 * Return the resultant string.
 * 
 * 
 * 
 * Example Input
 * 
 * A="AbcaZeoB"
 * 
 * 
 * 
 * Example Output
 * 
 * "bc###bc###"
 * 
 * 
 * 
 * Example Explanation
 * 
 * First concatenate the string with itself so string A becomes
 * "AbcaZeoBAbcaZeoB".
 * Delete all the uppercase letters so string A becomes "bcaeobcaeo".
 * Now replace vowel with '#'.
 * A becomes "bc###bc###".
 * 
 * 
 */

public class Solution {
    public String solve(String A) {

        A += A;
        int n = A.length();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {

            int curr = A.charAt(i) - 'A';

            if (curr < 26) {
                continue;
            }
            if (A.charAt(i) == 'a' ||
                    A.charAt(i) == 'e' ||
                    A.charAt(i) == 'i' ||
                    A.charAt(i) == 'o' ||
                    A.charAt(i) == 'u') {
                sb.append("#");

            } else {
                sb.append(A.charAt(i));
            }
        }

        return sb.toString();
    }
}
