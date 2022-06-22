package study.baekjoon.step3;

import java.util.Scanner;

public class boj11021 {
    public static void main(String[] args) {
        //[백준] A+B - 7
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for (int i=0; i<T; i++) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            System.out.println("Case #"+(i+1)+": " + (A+B));
        }
    }
}
