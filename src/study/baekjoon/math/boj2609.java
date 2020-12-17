package study.baekjoon.math;

import java.util.Scanner;

public class boj2609 {
    public static void main(String[] args) {
        // AxB = GCDxLCM
        // LCM = AxB/GCD
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(gcd(a, b));
        System.out.println((a*b)/gcd(a, b));
    }

    public static int gcd(int x, int y) {
        while (y != 0) {
            int r = x%y;
            x = y;
            y = r;
        }
        return x;
    }
}
