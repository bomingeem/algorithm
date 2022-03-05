package study.baekjoon.bruteforce;

import java.util.Scanner;

public class boj14888 {
    static int N;
    static int[] numbers;
    static int[] operators;
    static int maximum = Integer.MIN_VALUE;
    static int minumum = Integer.MAX_VALUE;
    public static void main(String[] args) {
        //[백준] 연산자 끼워넣기
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        numbers = new int[N];
        operators = new int[4];

        for (int i=0; i<N; i++) {
            numbers[i] = scanner.nextInt();
        }

        for (int i=0; i<4; i++) {
            operators[i] = scanner.nextInt();
        }

        permutation(numbers[0], 1);
        System.out.println(maximum);
        System.out.println(minumum);
    }

    public static void permutation(int number, int index) {
        if (index == N) {
            maximum = Math.max(maximum, number);
            minumum = Math.min(minumum, number);
            return;
        }

        for (int i=0; i<4; i++) {
            if (operators[i] > 0) {
                operators[i]--;

                switch (i) {
                    case 0:
                        permutation(number + numbers[index], index+1);
                        break;
                    case 1:
                        permutation(number - numbers[index], index+1);
                        break;
                    case 2:
                        permutation(number * numbers[index], index+1);
                        break;
                    case 3:
                        permutation(number / numbers[index], index+1);
                        break;
                }

                operators[i]++;
            }
        }
    }
}
