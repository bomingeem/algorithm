package study.baekjoon.step5;

import java.util.Scanner;

public class boj1065 {
    public static void main(String[] args) {
        //[백준] 한수
        Scanner scanner = new Scanner(System.in);
        System.out.println(arithmetic_sequence(scanner.nextInt()));
    }

    public static int arithmetic_sequence(int number) {
        int count = 0;

        if (number < 100) {
            return number;
        } else {
            count = 99;

            for (int i=100; i<=number; i++) {
                int hundred = i/100;
                int ten = (i/10)%10;
                int one = i%10;

                if ((hundred - ten) == (ten - one)) {
                    count++;
                }
            }
        }
        return count;
    }
}
