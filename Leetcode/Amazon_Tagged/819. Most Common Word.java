//https://leetcode.com/problems/most-common-word/

class Solution {
    public String mostCommonWord(String p, String[] banned) {

        HashSet<String> set = new HashSet();

        for (int i = 0; i < banned.length; i++) {
            set.add(banned[i]);
        }

        HashMap<String, Integer> map = new HashMap();

        p = p.toLowerCase();
        int max = 0;
        String ans = "";
        String temp = "";
        for (int i = 0; i < p.length(); i++) {

            int range = p.charAt(i) - '0';
            if (range > 48 && range < 75) {
                // is a letter
                temp += p.charAt(i);
            } else {
                if (temp.length() != 0) {
                    if (!set.contains(temp)) {
                        if (map.containsKey(temp)) {
                            int num = map.get(temp);
                            if (num > max) {
                                max = num;
                                ans = temp;
                            }
                            map.put(temp, num + 1);
                        } else {
                            map.put(temp, 1);
                            if (max == 0) {
                                ans = temp;
                            }
                        }
                    }
                    temp = "";
                }
            }

        }

        if (temp.length() != 0) {
            if (!set.contains(temp)) {
                if (map.containsKey(temp)) {
                    int num = map.get(temp);
                    if (num > max) {
                        max = num;
                        ans = temp;
                    }
                } else {
                    map.put(temp, 1);
                    if (max == 0) {
                        ans = temp;
                    }
                }
            }
        }

        return ans;

    }
}