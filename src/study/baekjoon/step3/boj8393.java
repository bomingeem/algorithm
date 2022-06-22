package study.baekjoon.step3;

import java.util.Scanner;

public class boj8393 {
    public static void main(String[] args) {
        //[백준] 합
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;

        for (int i=0; i<n; i++) {
            sum += (i+1);
        }

        System.out.println(sum);
    }
}
