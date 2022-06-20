package study.baekjoon.step2;

import java.util.Scanner;

public class boj1330 {
    public static void main(String[] args) {
        //[백준] 두 수 비교하기
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        if (A > B) {
            System.out.println(">");
        } else if (A < B) {
            System.out.println("<");
        } else if (A == B) {
            System.out.println("==");
        }
    }
}
