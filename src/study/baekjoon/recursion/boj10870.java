package study.baekjoon.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj10870 {
    public static void main(String[] args) throws IOException {
        //[백준] 피보나치 수 5
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int N = Integer.parseInt(str);
        System.out.println(fibonacci(N));
    }

    public static int fibonacci(int n) {
        //f(n) = f(n-1) + f(n-2)
        if (n == 0) return 0;
        else if (n == 1) return 1;
        else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
