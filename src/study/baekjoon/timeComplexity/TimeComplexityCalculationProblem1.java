package study.baekjoon.timeComplexity;

import java.util.Scanner;

public class TimeComplexityCalculationProblem1 {
    static int N;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        System.out.println(func1(N));
    }

    public static int func1(int number) {
        int sum = 0;

        for (int i=1; i<=number; i++) {
            //O(N)
            if (i%3 == 0 || i%5 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
