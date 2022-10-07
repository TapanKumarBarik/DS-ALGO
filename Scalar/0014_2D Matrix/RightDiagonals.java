package Scalar;

import java.util.Arrays;

public class RightDiagonals {
    public static void main(String[] args) {
        int[][] arr = { { 11, 22, 33, 44, 55 }, { 66, 77, 88, 99, 10 }, { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 },
                { 21, 22, 23, 24, 25 }, { 26, 27, 28, 29, 30 } };

        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }

        // right to left diagonal

        int n = arr.length;

        for (int i = 0; i < arr[0].length; i++) {
            int row = 0;
            int column = i;
            while (row < n && column >= 0) {
                System.out.print(arr[row][column]);
                System.out.print(" ");
                row++;
                column--;
            }
            System.out.println(" ");
        }

        // last column

        for (int i = 2; i < n; i++) {
            int row = i;
            int column = arr[0].length - 1;
            while (row < n && column >= 0) {
                System.out.print(arr[row][column]);
                System.out.print(" ");
                row++;
                column--;
            }
            System.out.println(" ");
        }
    }
}
/*
 * [11, 22, 33, 44, 55]
 * [66, 77, 88, 99, 10]
 * [11, 12, 13, 14, 15]
 * [16, 17, 18, 19, 20]
 * [21, 22, 23, 24, 25]
 * [26, 27, 28, 29, 30]
 * 11
 * 22 66
 * 33 77 11
 * 44 88 12 16
 * 55 99 13 17 21
 * 15 19 23 27
 * 20 24 28
 * 25 29
 * 30
 */