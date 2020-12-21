package study.baekjoon.math;

import java.util.Scanner;

public class boj1676 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;

        while (n >= 5) {
            count += n/5;
             n /= 5;
        }
        System.out.println(count);
    }
}
