package study.baekjoon.math;

import java.util.Scanner;

public class boj1193 {
    public static void main(String[] args) {
        //[백준] 분수찾기
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        int diagonal = 1; //대각선의 개수
        int sum = 0; //해당 대각선 직전 대각선 까지의 누적 합

        while (true) {
            if (X <= diagonal + sum) {
                if (diagonal % 2 == 1) {
                    //대각선의 개수가 홀수
                    System.out.println((diagonal - (X - sum) + 1) + "/" + (X - sum));
                    break;
                } else {
                    //대각선의 개수가 짝수
                    System.out.println((X - sum) + "/" + (diagonal - (X - sum) + 1));
                    break;
                }
            } else {
                sum += diagonal;
                diagonal++;
            }
        }
    }
}
