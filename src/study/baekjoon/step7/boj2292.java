package study.baekjoon.step7;

import java.util.Scanner;

public class boj2292 {
    public static void main(String[] args) {
        //[백준] 벌집
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int count = 1;
        int range = 2;

        if (N == 1) {
            System.out.println(1);
        } else {
            while (range <= N) {
                range = range + (6*count);
                count++;
            }
            System.out.println(count);
        }
    }
}
