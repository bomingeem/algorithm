package study.baekjoon.step3;

import java.util.Scanner;

public class boj10951 {
    public static void main(String[] args) {
        //[백준] A+B - 4
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            System.out.println(A+B);
        }

        scanner.close();
    }
}
