//https://leetcode.com/problems/median-of-two-sorted-arrays/

class Solution {
    public double findMedianSortedArrays(int[] num1, int[] num2) {
        int n = num1.length;
        int m = num2.length;
        int i = 0;
        int j = 0;
        int k = n + m;
        double ans = 0;
        int[] arr = new int[n + m];
        // takek/2;
        int count = 0;
        while (count <= k / 2) {
            if (i < n || j < m) {
                if (i < n && j < m) {
                    if (num1[i] < num2[j]) {
                        arr[count] = num1[i];
                        i++;
                    } else {
                        arr[count] = num2[j];
                        j++;
                    }
                } else if (i < n) {
                    arr[count] = num1[i];
                    i++;
                } else {
                    arr[count] = num2[j];
                    j++;
                }
            }
            count++;
        }
        if (k % 2 == 0) {
            // even
            ans = ((double) arr[k / 2] + (double) arr[(k / 2) - 1]) / 2;
        } else {
            ans = arr[k / 2];
        }
        return ans;
    }

}

    //

public double findMedianSortedArrays1(int[] nums1, int[] nums2) {
    int index1 = 0;
    int index2 = 0;
    int med1 = 0;
    int med2 = 0;
    for (int i=0; i<=(nums1.length+nums2.length)/2; i++) {
        med1 = med2;
        if (index1 == nums1.length) {
            med2 = nums2[index2];
            index2++;
        } else if (index2 == nums2.length) {
            med2 = nums1[index1];
            index1++;
        } else if (nums1[index1] < nums2[index2] ) {
            med2 = nums1[index1];
            index1++;
        }  else {
            med2 = nums2[index2];
            index2++;
        }
    }

    // the median is the average of two numbers
    if ((nums1.length+nums2.length)%2 == 0) {
        return (float)(med1+med2)/2;
    }

    return med2;
}