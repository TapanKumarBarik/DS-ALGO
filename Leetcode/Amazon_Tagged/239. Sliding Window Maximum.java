//https://leetcode.com/problems/sliding-window-maximum

import java.util.Collections;
import java.util.PriorityQueue;

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());

        for (int i = 0; i < k; i++) {
            pq.add(nums[i]);
        }
        int n = nums.length;
        int[] arr = new int[n - k + 1];
        int index = 1;
        arr[0] = pq.peek();

        int i = 0;

        for (int j = k; j < n; j++) {

            pq.remove(nums[i]);
            i++;
            pq.add(nums[j]);

            arr[index] = pq.peek();
            index++;

        }

        return arr;
    }
}