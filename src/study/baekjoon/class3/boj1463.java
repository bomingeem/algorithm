package study.baekjoon.class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class boj1463 {
    static int[] d;
    public static void main(String[] args) throws IOException {
        //[백준] 1로 만들기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        d = new int[N+1];
        System.out.println(solution(N));
    }

    /**
        D[i] = i를 1로 만드느데 필요한 최소 연산 횟수
        i에게 가능한 경우를 생각해보자
            1. i가 3으로 나누어 떨어졌을 때 3으로 나누는 경우 D[i/3] + 1
            2. i가 2으로 나누어 떨어졌을 때 2으로 나누는 경우 D[i/2] + 1
            3. i에서 1을 빼는 경우 D[i-1] + 1
          → N/3 → ... → 1
        N → ... → ... → 1
          → N/2 → ... → 1
     */
    public static int solution(int n) {
        //Bottom-up 방식
        d[1] = 0;
        for (int i=2; i<=n; i++) {
            d[i] = d[i-1] + 1;
            if (i%2 == 0 && d[i] > d[i/2] + 1) {
                d[i] = d[i/2] + 1;
            }
            if (i%3 == 0 && d[i] > d[i/3] + 1) {
                d[i] = d[i/3] + 1;
            }
        }
        return d[n];
    }
}
