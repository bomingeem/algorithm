package study.baekjoon.step7;

import java.util.Scanner;

public class boj10250 {
    public static void main(String[] args) {
        //[백준] ACM 호텔
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for (int i=0; i<T; i++) {
            int H = scanner.nextInt(); //호텔의 층 수
            int W = scanner.nextInt(); //각 층의 방 수
            int N = scanner.nextInt(); //몇번째 손님

            if (N % H == 0) {
                System.out.println(H * 100 + (N/H));
            } else {
                System.out.println((N % H) * 100 + (N/H) + 1);
            }
        }
    }
}
