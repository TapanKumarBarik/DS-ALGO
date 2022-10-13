/*
 * Problem Description
 * You're given a read-only array of N integers. Find out if any integer occurs
 * more than N/3 times in the array in linear time and constant additional
 * space.
 * If so, return the integer. If not, return -1.
 * 
 * If there are multiple solutions, return any one.
 * 
 * 
 * 
 * Problem Constraints
 * 1 <= N <= 7*105
 * 1 <= A[i] <= 109
 * 
 * 
 * Input Format
 * The only argument is an integer array A.
 * 
 * 
 * Output Format
 * Return an integer.
 * 
 * 
 * Example Input
 * [1 2 3 1 1]
 * 
 * 
 * Example Output
 * 1
 * 
 * 
 * Example Explanation
 * 1 occurs 3 times which is more than 5/3 times.
 * 
 */

public class Solution {
    public int repeatedNumber(int[] A) {

        int num1 = 0;
        int num2 = 0;
        int vote1 = 0;
        int vote2 = 0;
        int n = A.length;
        int i = 0;

        while (i < n) {

            // second check
            if (num1 == A[i] || num2 == A[i]) {
                if (num1 == A[i]) {
                    vote1++;
                } else {
                    vote2++;
                }
            }
            // First check
            else if (vote1 == 0 || vote2 == 0) {
                if (vote1 == 0) {
                    num1 = A[i];
                    vote1++;
                } else {
                    num2 = A[i];
                    vote2++;
                }
            }

            // last
            else {
                vote1--;
                vote2--;
            }
            i++;
        }

        int count1 = 0;
        int count2 = 0;

        for (i = 0; i < n; i++) {

            if (A[i] == num1) {
                count1++;
            } else if (A[i] == num2) {
                count2++;
            }
        }

        //

        if (count1 > n / 3) {
            return num1;
        }
        if (count2 > n / 3) {
            return num2;
        }

        return -1;
    }
}
