package study.baekjoon.step5;

import java.util.Arrays;
import java.util.Scanner;

public class Step5_2562 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        int count = 0;
        int index = 0;
        int[] arr = {scanner.nextInt(), scanner.nextInt(), scanner.nextInt(),
                     scanner.nextInt(), scanner.nextInt(), scanner.nextInt(),
                     scanner.nextInt(), scanner.nextInt(), scanner.nextInt()};

        for (int i : arr) {
            count++;

            if(i > max) {
                max = i;
                index = count;
            }
        }
        System.out.println(max);
        System.out.println(index);
    }
}
