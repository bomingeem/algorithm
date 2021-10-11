package study.inflearn.array;

import java.util.Scanner;

public class problem2_02 {
    public static void main(String[] args) {
        //[인프런] 보이는 학생
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = new int[N];

        for (int i=0; i<N; i++) {
            arr[i] = scanner.nextInt();
        }

        int count = 1, max = arr[0];
        for (int i=1; i<N; i++) {
            if (max < arr[i]) {
                count++;
                max = arr[i];
            }
        }
        System.out.println(count);
    }
}
