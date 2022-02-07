package study.baekjoon.math;

import java.util.Scanner;

public class boj2577 {
    static int[] array;
    public static void main(String[] args) {
        //[백준] 숫자의 개수
        Scanner scanner = new Scanner(System.in);
        array = new int[10];
        int multiple = scanner.nextInt() * scanner.nextInt() * scanner.nextInt();

        while (multiple != 0) {
            array[multiple%10]++;
            multiple = multiple/10;
        }

        for (int number : array) {
            System.out.println(number);
        }

    }
}
