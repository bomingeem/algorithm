package study.baekjoon.step6;

import java.util.Scanner;

public class boj11720 {
    public static void main(String[] args) {
        //[백준] 숫자의 합
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String next = scanner.next();
        int sum = 0;

        for (int i=0; i<N; i++) {
            char ch = next.charAt(i);
            sum += Character.getNumericValue(ch);
        }
        System.out.println(sum);
    }
}
