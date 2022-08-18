package study.baekjoon.step9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj10872 {
    public static void main(String[] args) throws IOException {
        //[백준] 팩토리얼
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.println(factorial(N));
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n*factorial(n-1);
        }
    }
}
