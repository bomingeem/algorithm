package study.baekjoon.math;

import java.util.Scanner;

public class boj2745 {
    public static void main(String[] args) {
        //[백준] 진법 변환
        Scanner scanner = new Scanner(System.in);
        String N = scanner.next();
        int B = scanner.nextInt();

        baseConversion(N, B);
    }
    //N진법에서 10진법으로 변환하는 방법: N진법의 각 숫자에 N을 곱해가면서 10진법으로 바꾸면 된다.
    public static void baseConversion(String number, int N) {
        char[] numbers = number.toCharArray();
        int answer = 0;

        for (int i=0; i<numbers.length; i++) {
            if (numbers[i] >= 'A') {
                answer = answer * N + (numbers[i] - 'A' + 10);
            } else {
                answer = answer * N + (numbers[i] - '0');
            }
        }
        System.out.println(answer);
    }
}
