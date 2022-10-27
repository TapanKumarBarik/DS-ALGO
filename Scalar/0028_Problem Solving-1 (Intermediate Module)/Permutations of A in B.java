import java.util.Arrays;

/*
 * Problem Description
 * You are given two strings, A and B, of size N and M, respectively.
 * 
 * You have to find the count of all permutations of A present in B as a
 * substring. You can assume a string will have only lowercase letters.
 * 
 * 
 * 
 * Problem Constraints
 * 1 <= N < M <= 105
 * 
 * 
 * 
 * Input Format
 * Given two arguments, A and B of type String.
 * 
 * 
 * 
 * Output Format
 * Return a single integer, i.e., number of permutations of A present in B as a
 * substring.
 * 
 * 
 * 
 * Example Input
 * Input 1:
 * 
 * A = "abc"
 * B = "abcbacabc"
 * Input 2:
 * 
 * A = "aca"
 * B = "acaa"
 * 
 * 
 * Example Output
 * Output 1:
 * 
 * 5
 * Output 2:
 * 
 * 2
 * 
 * 
 * Example Explanation
 * Explanation 1:
 * 
 * Permutations of A that are present in B as substring are:
 * 1. abc
 * 2. cba
 * 3. bac
 * 4. cab
 * 5. abc
 * So ans is 5.
 * Explanation 2:
 * 
 * Permutations of A that are present in B as substring are:
 * 1. aca
 * 2. caa
 */

//sln
public class Solution1 {
    public int solve(String A, String B) {

        int[] arr1 = new int[26];
        int[] arr2 = new int[26];

        int n = A.length();
        for (int i = 0; i < n; i++) {
            arr1[A.charAt(i) - 'a']++;
        }

        int start = 0;
        int m = B.length();
        int count = 0;
        for (int i = 0; i < n; i++) {
            arr2[B.charAt(i) - 'a']++;
        }

        if (checkEqual(arr1, arr2)) {
            count++;
        }

        for (int i = n; i < m; i++) {
            arr2[B.charAt(start) - 'a']--;
            arr2[B.charAt(i) - 'a']++;
            start++;
            if (checkEqual(arr1, arr2)) {
                count++;
            }
        }

        return count;
    }

    boolean checkEqual(int[] arr1, int[] arr2) {
        int n = arr1.length;

        for (int i = 0; i < n; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }
}

// brut force
public class Solution {
    public int solve(String A, String B) {

        int n = A.length();
        int m = B.length();

        if (n > m) {
            return 0;
        }

        int count = 0;
        char[] arr1 = A.toCharArray();
        Arrays.sort(arr1);

        String s1 = String.valueOf(arr1);

        for (int i = 0; i < m - n + 1; i++) {

            char[] temp = new char[n];
            int index = 0;
            for (int j = i; j < i + n; j++) {
                temp[index] = B.charAt(j);
                index++;
            }
            Arrays.sort(temp);
            String s2 = String.valueOf(temp);

            if (s1.equals(s2)) {
                count++;
            }
        }

        return count;
    }
}
