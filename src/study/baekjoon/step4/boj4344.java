package study.baekjoon.step4;

import java.util.Scanner;

public class boj4344 {
    public static void main(String[] args) {
        //[백준] 평균은 넘겠지
        Scanner scanner = new Scanner(System.in);
        int[] array;
        int C = scanner.nextInt();

        for (int i=0; i<C; i++) {
            int N = scanner.nextInt();
            array = new int[N];
            double sum = 0;

            for (int j=0; j<N; j++) {
                int score = scanner.nextInt();
                array[j] = score;
                sum += score;
            }

            double average = sum/N;
            double count = 0;

            for (int j=0; j<N; j++) {
                if (array[j] > average) {
                    count++;
                }
            }
            System.out.printf("%.3f%%\n", (count/N)*100);
        }
    }
}
