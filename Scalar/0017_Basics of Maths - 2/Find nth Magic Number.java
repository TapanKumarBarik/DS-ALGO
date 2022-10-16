/*
 * Problem Description
Given an integer A, find and return the Ath magic number.

A magic number is defined as a number that can be expressed as a power of 5 or a sum of unique powers of 5.

First few magic numbers are 5, 25, 30(5 + 25), 125, 130(125 + 5), ….



Problem Constraints
1 <= A <= 5000



Input Format
The only argument given is integer A.



Output Format
Return the Ath magic number.



Example Input
Example Input 1:

 A = 3
Example Input 2:

 A = 10


Example Output
Example Output 1:

 30
Example Output 2:

 650


Example Explanation
Explanation 1:

 Magic Numbers in increasing order are [5, 25, 30, 125, 130, ...]
 3rd element in this is 30
Explanation 2:

 In the sequence shown in explanation 1, 10th element will be 650.

 */
//***************************************************8 */
/*
 * public class Solution {
    public int solve(int A) {
        // int ans = 0;
        // int x = 1;
        // while(n > 0) {
        //     x *= 5;
        //     if(n%2 == 1)   {
        //          ans += x;
        //     }
        //     n /= 2;
        // }
        // return ans;

        //******************************88
        int ans=0;
        int index=1;

        while(A!=0){
            int curr=(A&1);
           if(curr!=0){
                ans+=(int)Math.pow(5,index);
           }
            index++;
            A=A>>1;
        }
        return ans;
    }
}

 */

public class Solution {
    public int solve(int A) {
        int ans = 0;
        int x = 1;
        while (n > 0) {
            x *= 5;
            if (n % 2 == 1) {
                ans += x;
            }
            n /= 2;
        }
        return ans;
    }
}

////////////////////////////////////////////////////////

public class NthMagicNumber {
    public static void main(String[] args) {
        int n = 1;
        System.out.print(n + " :");
        printN(n);
        n++;
        System.out.println("**************************");
        System.out.print(n + " :");
        printN(n);
        n++;
        System.out.println("**************************");
        System.out.print(n + " :");
        printN(n);
        n++;
        System.out.println("**************************");
        System.out.print(n + " :");
        printN(n);
        n++;
        System.out.println("**************************");
        System.out.print(n + " :");
        printN(n);
        n++;
        System.out.println("**************************");
        System.out.print(n + " :");
        printN(n);
        n++;
        System.out.println("**************************");

    }

    private static void printN(int n) {
        int ans = 0;
        int x = 1;
        while (n > 0) {
            x *= 5;
            if (n % 2 == 1) {
                ans += x;
            }
            n /= 2;
        }
        System.out.println(ans);// ans;
    }
}
