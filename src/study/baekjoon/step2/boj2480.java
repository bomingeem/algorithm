package study.baekjoon.step2;

import java.util.Scanner;

public class boj2480 {
    public static void main(String[] args) {
        //[백준] 주사위 세개
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int result = 0;

        if (a == b && b == c) {
            result = 10000 + (a)*1000;
        } else if (a != b && b != c && a != c) {
            int max = Math.max(Math.max(a, b), c);
            result = max*100;
        } else {
            if (a != b) {
                result = 1000 + (c*100);
            } else if (a != c) {
                result = 1000 + (b*100);
            }
        }
        System.out.println(result);
    }
}
