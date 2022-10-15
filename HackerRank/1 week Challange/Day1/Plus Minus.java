
//https://www.hackerrank.com/challenges/one-week-preparation-kit-plus-minus/problem


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
    // Write your code here
    
    int n=arr.size();
    double pos=0;
    double neg=0;
    double ze=0;
    for(int i=0;i<n;i++){
        if(arr.get(i)>0){
            pos++;
        }
        else if(arr.get(i)==0){
            ze++;
        }
        else{
            neg++;
        }
    }
    
    //
    
    System.out.println(pos/n);
    System.out.println(neg/n);
    System.out.println(ze/n);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}

  
