package MarchOf2024;

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
     * https://www.hackerrank.com/challenges/mini-max-sum/problem?isFullScreen=true
     */
    public static void miniMaxSum(List<Integer> arr) {
        long min = 0;
        long max = 0;
        Collections.sort(arr); //Sort in ascending order
        for (int i = 0; i < 4; i++) {//we know all list include 5 number so the first 4 is min
            min += arr.get(i);
        }
        System.out.print(min + " ");
        for (int i = 4; i > 0; i--) {//we know all list include 5 number so the last 4 is max
            max += arr.get(i);
        }
        System.out.println(max);
    }

}

public class March3 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}
