package study.baekjoon.math;

import java.io.IOException;
import java.util.Scanner;

public class boj9613 {
    public static void main(String[] args) throws IOException {
        //[백준] GCD 합
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int c=0; c<t; c++) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int j=0; j<n; j++) {
                arr[j] = scanner.nextInt();
            }

            long sum = 0;
            for (int i=0; i<arr.length-1; i++) {
                for (int j=i+1; j<arr.length; j++) {
                    sum += GCD(arr[i], arr[j]);
                }
            }
            System.out.println(sum);
        }
    }

    public static int GCD(int a, int b) {
        while (b != 0) {
            int r = a%b;
            a = b;
            b = r;
        }
        return a;
    }
}
