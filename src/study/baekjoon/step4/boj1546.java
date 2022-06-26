package study.baekjoon.step4;

import java.util.Arrays;
import java.util.Scanner;

public class boj1546 {
    public static void main(String[] args) {
        //[백준] 평균
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        double[] array = new double[N];
        double result = 0;

        for (int i=0; i<N; i++) {
            array[i] = scanner.nextDouble();
        }

        Arrays.sort(array);

        for (int i=0; i<array.length; i++) {
            result += (array[i]/array[N-1])*100;
        }

        System.out.println(result/N);
    }
}
