package study.baekjoon.math;

import java.util.Scanner;

public class boj1934 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        for(int i=0; i<size; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int g = gcd(a, b);
            int l = a*b / g;
            System.out.println(l);
        }
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
