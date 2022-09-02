package study.baekjoon.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class boj2309 {
    static int[] arr = new int[9];
    static boolean visited = false;
    static int sum = 0;
    public static void main(String[] args) throws IOException {
        //[백준] 일곱 난쟁이
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i=0; i<arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }

        for (int i=0; i<arr.length; i++) {
            if (visited) break;
            for (int j=0; j<arr.length; j++) {
                if (arr[i] == arr[j]) continue;
                if (sum - arr[i] - arr[j] == 100) {
                    arr[i] = 0;
                    arr[j] = 0;
                    visited = true;
                    break;
                }
            }
        }

        Arrays.sort(arr);
        for (int result : arr) {
            if (result != 0) System.out.println(result);
        }
    }
}
