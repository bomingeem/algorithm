package study.baekjoon.bruteforce;

import java.util.Scanner;

public class boj14888 {
    static int MAX = Integer.MIN_VALUE;
    static int MIN = Integer.MAX_VALUE;
    static int N;
    static int[] numbers;
    static int[] operators;
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

        DFS(numbers[0], 1);
        System.out.println(MAX);
        System.out.println(MIN);
    }

    public static void DFS(int number, int index) {
        if (index == N) {
            MAX = Math.max(MAX, number);
            MIN = Math.min(MIN, number);
            return;
        }

        for (int i=0; i<4; i++) {
            if (operators[i] > 0) {
                operators[i]--;

                //+개수 -개수 ×갯수 ÷개수
                switch (i) {
                    case 0:
                        DFS(number + numbers[index], index+1);
                        break;
                    case 1:
                        DFS(number - numbers[index], index+1);
                        break;
                    case 2:
                        DFS(number * numbers[index], index+1);
                        break;
                    case 3:
                        DFS(number / numbers[index], index+1);
                        break;
                }
                operators[i]++;
            }
        }
    }
}
