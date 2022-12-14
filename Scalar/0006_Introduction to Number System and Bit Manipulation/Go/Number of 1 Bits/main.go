/*
Problem Description
Write a function that takes an integer and returns the number of 1 bits it has.

Problem Constraints
1 <= A <= 109

Input Format
First and only argument contains integer A

Output Format
Return an integer as the answer

Example Input
Input1:
11

Example Output
Output1:
3

Example Explanation
Explaination1:
11 is represented as 1011 in binary.

See Expected Output
*/
package main
func main(){
	numSetBits(100)
}

/**
 * @input A : Integer
 * 
 * @Output Integer
 */
 func numSetBits(A int )  (int) {
    count:=0
    for A!=0{
        count+=A&1
        A=A>>1
    }
    return count
}
