import java.util.HashMap;

/*
 * Problem Description
 * Given an array A of N integers.
 * 
 * Find the largest continuous sequence in a array which sums to zero.
 * 
 * 
 * 
 * Problem Constraints
 * 1 <= N <= 106
 * 
 * -107 <= A[i] <= 107
 * 
 * 
 * 
 * Input Format
 * Single argument which is an integer array A.
 * 
 * 
 * 
 * Output Format
 * Return an array denoting the longest continuous sequence with total sum of
 * zero.
 * 
 * NOTE : If there are multiple correct answers, return the sequence which
 * occurs first in the array.
 * 
 * 
 * 
 * Example Input
 * A = [1,2,-2,4,-4]
 * 
 * 
 * Example Output
 * [2,-2,4,-4]
 * 
 * 
 * Example Explanation
 * [2,-2,4,-4] is the longest sequence with total sum of zero.
 * 
 */

public class Solution {
    public int[] lszero(int[] A) {

        int n = A.length;
        int[] pf = new int[n];
        pf[0] = A[0];

        for (int i = 1; i < n; i++) {
            pf[i] = pf[i - 1] + A[i];
        }
        //
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int maxAns = 0;
        int start = 0;
        for (int i = 0; i < n; i++) {
            int num = pf[i];
            if (num == 0) {
                maxAns = i + 1;
                start = 0;
            }
            // map
            else {
                if (map.containsKey(num)) {
                    if (i - map.get(num) > maxAns) {
                        maxAns = i - map.get(num);
                        start = map.get(num) + 1;
                    }
                } else {
                    map.put(num, i);
                }
            }
        }
        //
        int[] arr = new int[maxAns];
        int index = 0;
        for (int i = start; i < start + arr.length; i++) {
            arr[index] = A[i];
            index++;
        }
        return arr;
    }
}
