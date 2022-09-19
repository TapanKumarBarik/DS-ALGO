
import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        // Take one input from user and print if it is a prime of not

        Scanner scn = new Scanner(System.in);

        System.out.println("Please Enter a number ::");
        int num = scn.nextInt();
        scn.close();

        System.out.println(isPrimeNumber(num));
    }

    private static String isPrimeNumber(int num) {
        if (num == 1)
            return "Not Prime";
        for (int i = 2; i * i <= num; i++) {

            if (num % i == 0) {
                return "Not Prime";
            }
        }
        return "Prime";
    }
}