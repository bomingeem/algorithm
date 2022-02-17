package study.baekjoon.math;

import java.util.Arrays;
import java.util.Scanner;

public class boj1546 {
    static int N;
    static double sum = 0;
    public static void main(String[] args) {
        //[백준] 평균
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        double arrays[] = new double[N];

        for (int i=0; i<arrays.length; i++) {
            arrays[i] = scanner.nextDouble();
        }

        Arrays.sort(arrays);

        for (int i=0; i<arrays.length; i++) {
            sum += (arrays[i]/arrays[arrays.length - 1]) * 100;
        }

        System.out.println(sum / arrays.length);
    }
}
