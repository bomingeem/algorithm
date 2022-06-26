package study.baekjoon.step3;

import java.util.Scanner;

public class boj1110 {
    public static void main(String[] args) {
        //[백준] 더하기 사이클
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int result = N;
        int cycle = 0;

        while (true) {
            int firstDigit = result/10; //2
            int secondDigit = result%10; //6
            result = secondDigit*10 + (firstDigit+secondDigit)%10;
            cycle++;
            if (N == result) {
                break;
            }
        }
        System.out.println(cycle);
    }
}
