package study.baekjoon.math;

import java.util.Arrays;
import java.util.Scanner;

public class boj3052 {
    static int[] numbers = new int[10];
    public static void main(String[] args) {
        //[백준] 나머지
        Scanner scanner = new Scanner(System.in);
        for (int i=0; i<10; i++) {
            numbers[i] = scanner.nextInt() % 42;
        }

        System.out.println(Arrays.stream(numbers).distinct().count());
    }
}
