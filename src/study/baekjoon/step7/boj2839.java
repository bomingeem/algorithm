package study.baekjoon.step7;

import java.util.Scanner;

public class boj2839 {
    public static void main(String[] args) {
        //[백준] 설탕 배달
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int count = 0;

        while (true) {
            if (N%5 == 0) {
                count += N/5;
                System.out.println(count);
                break;
            } else {
                N -= 3;
                count++;
            }

            if (N < 0) {
                System.out.println(-1);
                break;
            }
        }
    }
}
