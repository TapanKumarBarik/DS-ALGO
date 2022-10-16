import java.util.ArrayList;
import java.util.HashMap;

/*
 * Problem Description
 * Given two integer arrays, A and B of size N and M, respectively. Your task is
 * to find all the common elements in both the array.
 * 
 * NOTE:
 * 
 * Each element in the result should appear as many times as it appears in both
 * arrays.
 * The result can be in any order.
 * 
 * 
 * Problem Constraints
 * 1 <= N, M <= 105
 * 
 * 1 <= A[i] <= 109
 * 
 * 
 * 
 * Input Format
 * First argument is an integer array A of size N.
 * 
 * Second argument is an integer array B of size M.
 * 
 * 
 * 
 * Output Format
 * Return an integer array denoting the common elements.
 * 
 * 
 * 
 * Example Input
 * Input 1:
 * 
 * A = [1, 2, 2, 1]
 * B = [2, 3, 1, 2]
 * Input 2:
 * 
 * A = [2, 1, 4, 10]
 * B = [3, 6, 2, 10, 10]
 * 
 * 
 * Example Output
 * Output 1:
 * 
 * [1, 2, 2]
 * Output 2:
 * 
 * [2, 10]
 * 
 * 
 * Example Explanation
 * Explanation 1:
 * 
 * Elements (1, 2, 2) appears in both the array. Note 2 appears twice in both
 * the array.
 * Explantion 2:
 * 
 * Elements (2, 10) appears in both the array.
 * 
 */

public class Solution {
    public int[] solve(int[] A, int[] B) {

        int n = A.length;

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < n; i++) {

            int num = A[i];
            if (map.containsKey(num)) {
                int freq = map.get(num);
                map.put(num, freq + 1);
            } else {
                map.put(num, 1);
            }
        }

        //
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < B.length; i++) {

            int num = B[i];

            if (map.containsKey(num)) {
                int freq = map.get(num);
                if (freq == 1) {
                    map.remove(num);
                } else {
                    map.put(num, freq - 1);
                }
                list.add(num);
            }
        }
        //
        int[] arr = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }

        //
        return arr;
    }
}
