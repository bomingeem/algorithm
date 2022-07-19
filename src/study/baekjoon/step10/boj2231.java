package study.baekjoon.step10;

import java.util.Scanner;

public class boj2231 {
    static int constructor;
    public static void main(String[] args) {
        //[백준] 분해합
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        for (int i=0; i<N; i++) {
            int number = i;
            int sum = 0;

            while (number != 0) {
                sum += number%10;
                number = number/10;
            }

            if (sum + i == N) {
                constructor = i;
                break;
            }
        }
        System.out.println(constructor);
    }
}
