package study.inflearn.array;

import java.util.Scanner;

public class problem2_03 {
    public static void main(String[] args) {
        //[인프런] 가위바위보
        //1:가위, 2:바위, 3:보
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];

        for (int i=0; i<N; i++) {
            A[i] = scanner.nextInt();
        }
        for (int i=0; i<N; i++) {
            B[i] = scanner.nextInt();
        }

        for (int i=0; i<N; i++) {
            if (A[i] == B[i]) {
                System.out.println("D");
            } else if (A[i] == 1 && B[i] == 3) {
                System.out.println("A");
            } else if (A[i] == 2 && B[i] == 1) {
                System.out.println("A");
            } else if (A[i] == 3 && B[i] == 2) {
                System.out.println("A");
            } else {
                System.out.println("B");
            }
        }
    }
}
