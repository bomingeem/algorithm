package study.baekjoon.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj11726 {
    static int[] dp;
    public static void main(String[] args) throws IOException {
        //[백준] 2xn 타일링
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        dp = new int[n+2];
        System.out.println(solution(n));
    }

    /**
         D[n] = 2xn을 채우는 방법의 수
         1. D[n-1] : 세로일 경우
         2. D[n-2] : 가로일 경우
         D[n] = D[n-1] + D[n-2]
     */
    public static int solution(int n) {
        dp[1] = 1;
        dp[2] = 2;
        for (int i=3; i<=n; i++) {
            dp[i] = (dp[i-1] + dp[i-2]) % 10007;
        }
        return dp[n];
    }
}
