package study.inflearn.array;

import java.util.Scanner;

public class problem2_05 {
    public static void main(String[] args) {
        //[인프런] 소수(에라토스테네스 체)
        problem2_05 problem = new problem2_05();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        System.out.println(problem.solution(N));

    }
    public int solution(int n) {
        int answer = 0;
        int[] arr = new int[n+1];
        for (int i=2; i<n; i++) {
            if (arr[i] == 0) {
                answer++;
                for (int j=i; j<=n; j=j+i) {
                    arr[j] = 1;
                }
            }
        }
        return answer;
    }
}
