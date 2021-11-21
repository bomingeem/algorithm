package study.baekjoon.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj2231 {
    public static void main(String[] args) throws IOException {
        //[백준] 분해합
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int decomposition = 0;

        for (int i=0; i<N; i++) {
            int number = i;
            int sum = 0;

            while (number != 0) {
                sum += number%10;
                number /= 10;
            }

            if (sum + i == N) {
                decomposition = i;
                break;
            }
        }
        System.out.println(decomposition);
    }
}
