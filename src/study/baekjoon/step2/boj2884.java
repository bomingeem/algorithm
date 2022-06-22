package study.baekjoon.step2;

import java.util.Scanner;

public class boj2884 {
    public static void main(String[] args) {
        //[백준] 알람 시계
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int M = scanner.nextInt();
        if (M >= 45) {
            M -= 45;
        } else {
            if (H == 0) {
                H = 24 - 1;
            } else {
                H -= 1;
            }
            M = (M + 60) - 45;
        }
        System.out.println(H + " " + M);
    }
}
