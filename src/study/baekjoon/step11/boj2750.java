package study.baekjoon.step11;

import java.util.Arrays;
import java.util.Scanner;

public class boj2750 {
    public static void main(String[] args) {
        //[백준] 수 정렬하기
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] array = new int[N];

        for (int i=0; i<N; i++) {
            array[i] = scanner.nextInt();
        }

        // 1. 선택정렬
        for (int i=0; i<array.length-1; i++) {
            for (int j=i+1; j<array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }

        // 2. Arrays.sort
        // Arrays.sort(array);

        for (int number : array) {
            System.out.println(number);
        }
    }
}
