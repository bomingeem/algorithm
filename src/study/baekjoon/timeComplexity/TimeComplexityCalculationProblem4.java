package study.baekjoon.timeComplexity;

import java.util.Scanner;

public class TimeComplexityCalculationProblem4 {
    static int N;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        System.out.println(func4(N));
    }

    public static int func4(int N) {
        int variable = 1;
        //O(logN)
        while (2*variable <= N) {
            variable *= 2;
        }
        return variable;
    }
}
