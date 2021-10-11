package study.inflearn.array;

import java.util.Scanner;

public class problem2_04 {
    public static void main(String[] args) {
        //[인프런] 피보나치 수열
        problem2_04 problem = new problem2_04();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] fibonacci = new int[N];

        fibonacci[0] = 1;
        fibonacci[1] = 1;
        for (int i=2; i<N; i++) {
            fibonacci[i] = fibonacci[i-2] + fibonacci[i-1];
        }

        for (int i : fibonacci) {
            System.out.print(i + " ");
        }
    }

    public void solution(int n) {
        int a = 1, b = 1, c;
        System.out.print(a + " " + b + " ");
        for (int i=2; i<n; i++) {
            c = a+b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}
