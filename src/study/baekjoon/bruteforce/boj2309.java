package study.baekjoon.bruteforce;

import java.util.Arrays;
import java.util.Scanner;

public class boj2309 {
    static int[] arr = new int[9];
    static boolean visited = false;
    static int sum = 0;
    public static void main(String[] args) {
        //[백준] 일곱 난쟁이
        Scanner scanner = new Scanner(System.in);

        for (int i=0; i<arr.length; i++) {
            arr[i] = scanner.nextInt();
            sum += arr[i];
        }

        for (int i=0; i<arr.length; i++) {
            if (visited) break;
            for (int j=0; j<arr.length; j++) {
                if (i == j) continue;
                if (sum - arr[i] - arr[j] == 100) {
                    arr[i] = 0;
                    arr[j] = 0;
                    visited = true;
                    break;
                }
            }
        }

        Arrays.sort(arr);

        for (int i : arr) {
            if (i != 0) System.out.println(i);
        }
    }
}
