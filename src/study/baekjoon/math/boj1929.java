package study.baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj1929 {
    static int M;
    static int N;
    static boolean[] prime;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        //[백준] 소수 구하기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        prime = new boolean[N + 1];

         findPrimeNumber();

        for (int i=M; i<=N; i++) {
            if (!prime[i]) sb.append(i).append("\n");
        }
        System.out.println(sb);
    }

    /**
     * k=2부터 √N 이하까지 반복하여 자연수들 중 k를 제외한 k의 배수들을 제외시킨다
     * 소수가 아닌 경우 true, 소수인 경우 false
     */
    public static void findPrimeNumber() {
        prime[0] = prime[1] = true;
        for (int i=2; i<Math.sqrt(prime.length); i++) {
            for (int j=i*i; j<prime.length; j+=i) {
                prime[j] = true;
            }
        }
    }
}
