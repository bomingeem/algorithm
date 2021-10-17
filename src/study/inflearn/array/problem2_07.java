package study.inflearn.array;

import java.util.Scanner;

public class problem2_07 {
    public static void main(String[] args) {
        //[인프런] 점수계산
        Scanner scanner = new Scanner(System.in);
        int cnt = 0;
        int answer = 0;
        int N = scanner.nextInt();
        int[] arr = new int[N];

        for (int i=0; i<N; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i=0; i<N; i++) {
            if (arr[i] == 1) {
                cnt++;
                answer += cnt;
            }
            else cnt = 0;
        }

        System.out.println(answer);
    }
}
