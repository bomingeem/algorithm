package study.baekjoon.step8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj11653 {
    public static void main(String[] args) throws IOException {
        //[백준] 소인수분해
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i=2; i<=Math.sqrt(N); i++) {
            while (N%i == 0) {
                System.out.println(i);
                N = N/i;
            }
        }

        //N이 1이 아니라면 N은 소수이자 인수인 것이 자명하다
        if (N != 1) {
            System.out.println(N);
        }
    }
}
