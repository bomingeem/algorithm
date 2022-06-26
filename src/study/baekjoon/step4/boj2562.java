package study.baekjoon.step4;

import java.util.Scanner;

public class boj2562 {
    public static void main(String[] args) {
        //[백준] 최댓값
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[9];

        for (int i=0; i<array.length; i++) {
            array[i] = scanner.nextInt();
        }

        int count = 0;
        int max = 0;
        int index = 0;

        for (int number : array) {
            count++;

            if (number > max) {
                max = number;
                index = count;
            }
        }
        System.out.println(max);
        System.out.println(index);
    }
}
