

//https://www.hackerrank.com/challenges/one-week-preparation-kit-mini-max-sum/problem
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
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
    // Write your code here
    
    long sum=0;
    int max=Integer.MIN_VALUE;
    int min=Integer.MAX_VALUE;
    
    int n=arr.size();
    
    for(int i=0;i<n;i++){
        int curr=arr.get(i);
        max=Math.max(max,curr);
        min=Math.min(min, curr);
        sum+=curr;
    }
    
    System.out.print(sum-max);
    System.out.print(" ");
    System.out.print(sum-min);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}
