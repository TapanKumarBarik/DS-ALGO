/*
 * Problem Description
 * Write a program to input an integer T and then for each test case input two
 * integers A and B in two different lines and then print T lines containing
 * Least Common Multiple (LCM) of two given 2 numbers A and B.
 * 
 * LCM of two integers is the smallest positive integer divisible by both.
 * 
 * 
 * Problem Constraints
 * 1 <= T <= 1000
 * 
 * 1 <= A,B <= 1000
 * 
 * 
 * 
 * Input Format
 * The first line contains T which means number of test cases.
 * 
 * Next 2T lines contains input A and B for each testcase.
 * First line of each testcase contain an integer A and second line of the
 * testcase contains input B.
 * 
 * 
 * 
 * Output Format
 * 
 * 
 * T lines each containing an integer representing LCM of A & B.
 * 
 * 
 * 
 * Example Input
 * Input 1:
 * 3
 * 2
 * 3
 * 9
 * 6
 * 2
 * 6
 * 
 * 
 * Example Output
 * Output 1:
 * 6
 * 18
 * 6
 * 
 * 
 * Example Explanation
 * Explanation:
 * 
 * In first testcase 6 is the smallest positive integer which is divisible by
 * both 2 (2 * 3 = 6) and 3 (3 * 2 = 6).
 * In second testcase 18 is the smallest positive integer which is divisible by
 * both 9 (9 * 2 = 18) and 6 (6 * 3 = 18).
 * In third testcase 6 is the smallest positive integer which is divisible by
 * both 2 (2 * 3 = 6) and 6 (6 * 1 = 6).
 * 
 * 
 */

import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int j = 0; j < t; j++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int G = 1;
            for (int i = 1; i <= Math.min(A, B); i++) {
                if (A % i == 0 && B % i == 0) {
                    G = i;
                }
            }
            int L = (A * B) / G;
            System.out.println(L);
        }
    }
}