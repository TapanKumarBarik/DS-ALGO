//https://leetcode.com/problems/longest-substring-without-repeating-characters/

class Solution {
    public int lengthOfLongestSubstring(String s) {

        int res = 0;

        HashSet<Character> map = new HashSet();

        int n = s.length();
        int i = 0;
        int j = 0;

        while (i < n) {

            char curr = s.charAt(i);
            if (!map.contains(curr)) {

                map.add(curr);
                res = Math.max(res, map.size());
                i++;
            } else {
                map.remove(s.charAt(j));
                j++;

            }

        }

        return res;
    }
}