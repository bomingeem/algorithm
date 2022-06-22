package study.baekjoon.step3;

import java.util.Scanner;

public class boj10950 {
    public static void main(String[] args) {
        //[백준] A+B - 3
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for (int i=0; i<T; i++) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            System.out.println(A+B);
        }
    }
}
