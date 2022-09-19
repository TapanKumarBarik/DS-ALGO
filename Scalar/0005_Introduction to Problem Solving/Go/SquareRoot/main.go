package main

import "fmt"

func main() {
	//Take a perfect sqlare as input from user and print its square root
var num int
fmt.Print("Enter a perfect square:")
	fmt.Scan(&num)

	fmt.Println(findSquare(num))
}

func findSquare(num int)int{
	start:=0
	end:=num
	for start<=end{
		mid:=(start+end)/2

		if mid*mid==num{
			return mid
		}else if mid*mid>num{
			end=mid-1
		}else{
			start=mid+1
		}

	}
	return -1
}