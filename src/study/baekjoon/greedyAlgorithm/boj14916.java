package study.baekjoon.greedyAlgorithm;

import java.util.Scanner;

public class boj14916 {
    public static void main(String[] args) {
        //[백준] 거스름돈
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;

        while (n > 0) {
            if (n%5 == 0) {
                count = n/5 + count;
                break;
            }
            n = n-2;
            count++;
        }

        if (n < 0) {
            System.out.println(-1);
        } else {
            System.out.println(count);
        }
    }
}
