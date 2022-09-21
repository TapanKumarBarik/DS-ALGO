/**
 * Problem Description
 * Given two binary strings, return their sum (also a binary string).
 * Example:
 * 
 * a = "100"
 * 
 * b = "11"
 * Return a + b = "111".
 * 
 */

public class Solution {
    public String addBinary(String A, String B) {

        StringBuilder sb = new StringBuilder();
        int n = A.length() - 1;
        int m = B.length() - 1;
        int carry = 0;

        while (n >= 0 && m >= 0) {
            int num = A.charAt(n) - '0';
            num += B.charAt(m) - '0';
            num += carry;
            sb.append(num % 2);
            carry = num / 2;
            n--;
            m--;
        }
        while (n >= 0) {
            int num = A.charAt(n) - '0';
            num += carry;
            sb.append(num % 2);
            carry = num / 2;
            n--;
        }
        while (m >= 0) {
            int num = B.charAt(m) - '0';
            num += carry;
            sb.append(num % 2);
            carry = num / 2;
            m--;
        }

        if (carry != 0) {
            sb.append(carry);
        }
        return sb.reverse().toString();
    }
}

////////////////////////////////////////////////////
// solution 2
public class Solution1 {
    public String addBinary(String A, String B) {

        StringBuilder sb = new StringBuilder();
        int n = A.length() - 1;
        int m = B.length() - 1;
        int carry = 0;

        while (m >= 0 || n >= 0 || carry != 0) {
            int num = 0;
            if (m >= 0) {
                num += B.charAt(m) - '0';
                m--;
            }
            if (n >= 0) {
                num += A.charAt(n) - '0';
                n--;
            }
            num += carry;
            carry = num / 2;
            sb.append(num % 2);
        }
        return sb.reverse().toString();
    }
}
