package study.baekjoon.step4;

import java.util.Arrays;
import java.util.Scanner;

public class boj10818 {
    public static void main(String[] args) {
        //[백준] 최소, 최대
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] array = new int[N];

        for (int i=0; i<N; i++) {
            array[i] = scanner.nextInt();
        }
        Arrays.sort(array);

        System.out.println(array[0] + " " + array[N-1]);
    }
}
