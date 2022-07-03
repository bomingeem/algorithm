package study.baekjoon.step7;

import java.util.Scanner;

public class boj1712 {
    public static void main(String[] args) {
        //[백준] 손익분기점
        // C*x = A + (B*x)
        // x = A/(C-B) + 1 > 0
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        if (B >= C) {
            System.out.println(-1);
        } else {
            System.out.println(A/(C-B) + 1);
        }
    }
}
