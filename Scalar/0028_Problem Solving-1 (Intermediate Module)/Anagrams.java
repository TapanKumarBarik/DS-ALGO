import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * Problem Description
 * Given an array A of N strings, return all groups of strings that are
 * anagrams.
 * 
 * Represent a group by a list of integers representing the index(1-based) in
 * the original list. Look at the sample case for clarification.
 * 
 * NOTE: Anagram is a word, phrase, or name formed by rearranging the letters,
 * such as 'spar', formed from 'rasp'.
 * 
 * 
 * 
 * Problem Constraints
 * 1 <= N <= 104
 * 
 * 1 <= |A[i]| <= 104
 * 
 * Each string consists only of lowercase characters.
 * 
 * The sum of the length of all the strings doesn't exceed 107
 * 
 * 
 * 
 * Input Format
 * The first and only argument is an integer array A.
 * 
 * 
 * 
 * Output Format
 * Return a two-dimensional array where each row describes a group.
 * 
 * Note:
 * 
 * Ordering of the result :
 * You should not change the relative ordering of the strings within the group
 * suppose within a group containing A[i] and A[j], A[i] comes before A[j] if i
 * < j.
 * 
 * 
 * 
 * Example Input
 * Input 1:
 * 
 * A = [cat, dog, god, tca]
 * Input 2:
 * 
 * A = [rat, tar, art]
 * 
 * 
 * Example Output
 * Output 1:
 * 
 * [ [1, 4],
 * [2, 3] ]
 * Output 2:
 * 
 * [ [1, 2, 3] ]
 * 
 * 
 * Example Explanation
 * Explanation 1:
 * 
 * "cat" and "tca" are anagrams which correspond to index 1 and 4 and "dog" and
 * "god" are another set of anagrams which correspond to index 2 and 3.
 * The indices are 1 based ( the first element has index 1 instead of index 0).
 * Explanation 2:
 * 
 * All three strings are anagrams.
 */

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<ArrayList<Integer>> anagrams(final List<String> A) {

        HashMap<String, ArrayList<Integer>> map = new HashMap<String, ArrayList<Integer>>();

        int n = A.size();

        for (int i = 0; i < n; i++) {

            char[] arr = A.get(i).toCharArray();
            Arrays.sort(arr);
            String str = String.valueOf(arr);

            if (map.containsKey(str)) {
                ArrayList<Integer> temp = map.get(str);
                temp.add(i + 1);
                map.put(str, new ArrayList(temp));
            } else {
                ArrayList<Integer> temp = new ArrayList();
                temp.add(i + 1);
                map.put(str, new ArrayList(temp));
            }
        }

        //
        // iterate map
        ArrayList<ArrayList<Integer>> list = new ArrayList();
        for (Map.Entry<String, ArrayList<Integer>> m : map.entrySet()) {
            list.add(m.getValue());
        }

        return list;
    }
}
