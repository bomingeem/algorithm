package study.baekjoon.timeComplexity;

import java.util.Scanner;

public class TimeComplexityCalculationProblem2 {
    static int N;
    static int[] arr;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        arr = new int[N];

        for (int i=0; i<N; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println(func2(arr, N));
    }

    public static int func2(int arr[], int N) {
        //(N-1)+(N-2)+...+3+2+1 = (N²-N)/2, O(N²)
        for (int i=0; i<N; i++) {
            for (int j=i+1; j<N; j++) {
                if (arr[i] + arr[j] == 100) return 1;
            }
        }
        return 0;
    }
}
