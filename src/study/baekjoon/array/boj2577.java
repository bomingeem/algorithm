package study.baekjoon.array;

import java.util.Scanner;

public class boj2577 {
    static int A, B, C;
    static int[] answer = new int[10];
    public static void main(String[] args) {
        //[백준] 숫자의 개수
        Scanner scanner = new Scanner(System.in);
        A = scanner.nextInt();
        B = scanner.nextInt();
        C = scanner.nextInt();
        int multiple = A*B*C;

        while (multiple > 0) {
            answer[multiple%10]++;
            multiple = multiple/10;
        }

        for (int i : answer) {
            System.out.println(i);
        }
    }
}
