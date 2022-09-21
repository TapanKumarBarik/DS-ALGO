/**
 * @input A : Integer array
 *
 * @Output Integer
 */
package main
 func main(){
	
 }
 func singleNumber(A []int )  (int) {
    num:=0
    for i:=0;i<len(A);i++{
        num^=A[i]
    }
    return num
}
