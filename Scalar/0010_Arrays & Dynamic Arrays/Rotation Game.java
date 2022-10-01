
/**
 * Problem Description
 * Given an integer array A of size N and an integer B, you have to print the
 * same array after rotating it B times towards the right.
 * 
 * 
 * Problem Constraints
 * 1 <= N <= 106
 * 1 <= A[i] <=108
 * 1 <= B <= 109
 * 
 * 
 * Input Format
 * There are 2 lines in the input
 * 
 * Line 1: The first number is the size N of the array A. Then N numbers follow
 * which indicate the elements in the array A.
 * 
 * Line 2: A single integer B.
 * 
 * 
 * Output Format
 * Print array A after rotating it B times towards the right.
 * 
 * 
 * Example Input
 * Input 1 :
 * 4 1 2 3 4
 * 2
 * 
 * 
 * Example Output
 * Output 1 :
 * 3 4 1 2
 * 
 * 
 * Example Explanation
 * Example 1 :
 * 
 * N = 4, A = [1, 2, 3, 4] and B = 2.
 * 
 * Rotate towards the right 2 times - [1, 2, 3, 4] => [4, 1, 2, 3] => [3, 4, 1,
 * 2]
 * 
 * Final array = [3, 4, 1, 2]
 */

import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int b = scn.nextInt();

        b = b % n;

        reverse(arr, 0, n - 1);
        reverse(arr, 0, b - 1);
        reverse(arr, b, n - 1);

        for (int num : arr) {
            System.out.print(num);
            System.out.print(" ");
        }
    }

    private static void reverse(int[] arr, int i, int j) {

        while (i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}