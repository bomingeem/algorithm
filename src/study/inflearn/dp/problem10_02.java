package study.inflearn.dp;

import java.util.Scanner;

public class problem10_02 {
    static int N;
    static int[] dp;
    public static void main(String[] args) {
        //돌다리 건너기
        Scanner scanner = new Scanner(System.in);
        problem10_02 problem = new problem10_02();
        N = scanner.nextInt();
        dp = new int[N+2];
        System.out.print(problem.Solution(N));
    }

    public int Solution(int n) {
        dp[1] = 1;
        dp[2] = 2;
        for (int i=3; i<=N+1; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[n+1];
    }
}
