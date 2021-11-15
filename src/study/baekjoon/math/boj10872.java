package study.baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj10872 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int N = Integer.parseInt(str);
        System.out.println(factorial(N));
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) return 1;
        else return n * factorial(n-1);
    }
}
