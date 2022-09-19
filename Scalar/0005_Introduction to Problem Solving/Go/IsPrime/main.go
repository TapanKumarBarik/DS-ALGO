package main

import "fmt"

func main() {
	fmt.Println("Enter a number : ")
	//Taking input
	var num int
	fmt.Scan(&num)
	fmt.Println(isPrime(num))
}
func isPrime(num int) string {
	if num==1{
		return "Not Prime"
	}
	for  i:=2;i*i<=num;i++{
		if num%i==0{
			return "Not Prime"
		}
	}
	return "Prime"
}