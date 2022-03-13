package study.baekjoon.timeComplexity;

import java.util.Scanner;

public class TimeComplexityCalculationProblem3 {
    static int N;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();

        System.out.println(func3(N));
    }

    public static int func3(int N) {
        //O(√N)
        for (int i=1; i*i<=N; i++) {
            if (i*i == N) return 1;
        }
        return 0;
    }
}
