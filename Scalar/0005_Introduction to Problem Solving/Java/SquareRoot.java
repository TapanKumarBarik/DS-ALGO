package Java;

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a perfect sqaure: ");
        int num = scn.nextInt();
        scn.close();

        System.out.println(findSqaureRoot(num));
    }

    private static int findSqaureRoot(int num) {

        int start = 0;
        int end = num;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (mid * mid == num)
                return mid;

            else if (mid * mid > num) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        return -1;
    }
}
