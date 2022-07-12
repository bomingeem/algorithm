package study.baekjoon.step8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj1929 {
    static int M;
    static int N;
    static boolean[] primes;
    public static void main(String[] args) throws IOException {
        //[백준] 소수 구하기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        primes = new boolean[N+1];
        getPrime();

        for (int i=M; i<=N; i++) {
            if (!primes[i]) {
                System.out.println(i);
            }
        }
    }

    public static void getPrime() {
        primes[0] = true;
        primes[1] = true;
        for (int i=2; i<=Math.sqrt(primes.length); i++) {
            for (int j=i*i; j<primes.length; j=j+i) {
                primes[j] = true;
            }
        }
    }
}
