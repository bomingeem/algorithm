package study.inflearn.dp;

import java.util.Scanner;

public class problem10_01 {
    static int dp[];
    static int N;
    public static void main(String[] args) {
        //계단오르기
        Scanner scanner = new Scanner(System.in);
        problem10_01 problem = new problem10_01();
        N = scanner.nextInt();
        dp = new int[N+1];
        System.out.print(problem.Solution(N));
    }

    public int Solution(int n) {
        dp[1] = 1;
        dp[2] = 2;

        for (int i=3; i<=N; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[n];
    }
}
