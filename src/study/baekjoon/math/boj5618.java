package study.baekjoon.math;

import java.util.Arrays;
import java.util.Scanner;

public class boj5618 {
    public static void main(String[] args) {
        //[백준] 공약수
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] commonFactor = new int[n];
        for (int i=0; i<n; i++) {
            commonFactor[i] = scanner.nextInt();
        }
        Arrays.sort(commonFactor);

        //공약수: 두 수가 공통으로 갖고 있는 약수
        for (int i=1; i<=commonFactor[0]; i++) {
            int count = 0;
            for (int j=0; j<n; j++) {
                if (commonFactor[j] % i == 0) count++;
            }
            if (count == n) System.out.println(i);
        }
    }
}
