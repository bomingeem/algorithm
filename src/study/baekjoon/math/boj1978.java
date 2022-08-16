package study.baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj1978 {
    static int count = 0;
    public static void main(String[] args) throws IOException {
        //[백준] 소수 찾기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        while (st.hasMoreTokens()) {
            if (isPrime(Integer.parseInt(st.nextToken()))) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static boolean isPrime(int x) {
        if (x == 1) return false;

        for (int i=2; i<x-1; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
}
