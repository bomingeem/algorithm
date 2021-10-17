package study.inflearn.array;

import java.util.Scanner;

public class problem2_08 {
    public static void main(String[] args) {
        //[인프런] 등수 구하기
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = new int[N];
        int[] answer = new int[N];

        for (int i=0; i<N; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i=0; i<N; i++) {
            int cnt = 1;
            for (int j=0; j<N; j++) {
                if (arr[i] < arr[j]) {
                    cnt++;
                }
            }
            answer[i] = cnt;
        }

        for (int rank : answer) {
            System.out.print(rank + " ");
        }
    }
}
