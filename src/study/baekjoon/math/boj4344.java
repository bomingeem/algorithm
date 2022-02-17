package study.baekjoon.math;

import java.util.Scanner;

public class boj4344 {
    static int C;
    static int N;
    static int[] arrays;
    public static void main(String[] args) {
        //[백준] 평균은 넘겠지
        Scanner scanner = new Scanner(System.in);
        C = scanner.nextInt();

        for (int i=0; i<C; i++) {
            N = scanner.nextInt();
            arrays = new int[N];

            double sum = 0;

            for (int j=0; j<N; j++) {
                int score = scanner.nextInt();
                arrays[j] = score;
                sum += score;
            }

            double average = (sum / N);
            double count = 0;

            for (int k=0; k<N; k++) {
                if (arrays[k] > average) {
                    count++;
                }
            }

            System.out.printf("%.3f%%\n", (count/N) * 100);
        }
    }
}
