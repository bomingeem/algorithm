package study.baekjoon.math;

import java.util.Scanner;

public class boj2292 {
    public static void main(String[] args) {
        //[백준] 벌집
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int count = 1;
        int range = 2;
        //1     1  1개
        //2~7   2  6개
        //8~19  3 12개
        //20~37 4 18개
        //38~61 5 24개
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
