package study.baekjoon.math;

import java.util.Scanner;

public class boj2004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int five = 0;
        int two = 0;

        //a1-b1-c1
        five = fiveCount(n);
        five -= fiveCount(n-m);
        five -= fiveCount(m);

        //a2-b2-c2
        two = twoCount(n);
        two -= twoCount(n-m);
        two -= twoCount(m);

        System.out.println(Math.min(five, two));
    }

    public static int fiveCount(int n) {
        int count = 0;

        while (n >= 5) {
            count += n/5;
            n /= 5;
        }
        return count;
    }

    public static int twoCount(int n) {
        int count = 0;
        while (n >= 2) {
            count += n/2;
            n /= 2;
        }
        return count;
    }
}
