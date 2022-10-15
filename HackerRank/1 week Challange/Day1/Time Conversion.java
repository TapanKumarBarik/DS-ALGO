

//https://www.hackerrank.com/challenges/one-week-preparation-kit-time-conversion/problem


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
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
      // Write your code here
    
    int n=s.length();
    
    String ampm=s.substring(n-2,n);
    int firstTime=Integer.parseInt(s.substring(0,2));
    
    if(ampm.equals("AM")){
        if(firstTime>=12){
            return "00"+s.substring(2,n-2);
        }
        return s.substring(0,n-2);
    }
    if(firstTime==12){
         return s.substring(0,n-2);
    }
     return firstTime+12+s.substring(2,n-2);

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
