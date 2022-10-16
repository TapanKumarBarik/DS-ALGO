import java.util.HashMap;

/*
 * Problem Description
 * Given a string A consisting of lowercase characters.
 * 
 * Check if characters of the given string can be rearranged to form a
 * palindrome.
 * 
 * Return 1 if it is possible to rearrange the characters of the string A such
 * that it becomes a palindrome else return 0.
 * 
 * 
 * 
 * Problem Constraints
 * 1 <= |A| <= 105
 * 
 * A consists only of lower-case characters.
 * 
 * 
 * 
 * Input Format
 * First argument is an string A.
 * 
 * 
 * 
 * Output Format
 * Return 1 if it is possible to rearrange the characters of the string A such
 * that it becomes a palindrome else return 0.
 * 
 * 
 * 
 * Example Input
 * Input 1:
 * 
 * A = "abcde"
 * Input 2:
 * 
 * A = "abbaee"
 * 
 * 
 * Example Output
 * Output 1:
 * 
 * 0
 * Output 2:
 * 
 * 1
 * 
 * 
 * Example Explanation
 * Explanation 1:
 * 
 * No possible rearrangement to make the string palindrome.
 * Explanation 2:
 * 
 * Given string "abbaee" can be rearranged to "aebbea" to form a palindrome.
 * 
 */

public class Solution {
    public int solve(String A) {

        int n = A.length();

        int pos = 1;

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        for (int i = 0; i < n; i++) {

            char curr = A.charAt(i);
            if (map.containsKey(curr)) {
                int freq = map.get(curr);
                map.put(curr, freq + 1);
            } else {
                map.put(curr, 1);
            }
        }

        //

        for (int i = 0; i < n; i++) {

            char curr = A.charAt(i);
            if (map.containsKey(curr)) {
                int freq = map.get(curr);
                if (n % 2 == 0) {
                    if (freq % 2 == 1) {
                        return 0;
                    }
                } else {
                    if (freq % 2 == 1) {
                        pos--;
                        if (pos == -1) {
                            return 0;
                        }
                    }
                }
            }
            map.remove(curr);
        }
        //
        return 1;
    }
}
// yyyzzrrqquuffbb
