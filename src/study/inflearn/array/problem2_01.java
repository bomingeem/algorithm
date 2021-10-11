package study.inflearn.array;

import java.util.ArrayList;
import java.util.Scanner;

public class problem2_01 {
    public static void main(String[] args) {
        //[인프런] 큰 수 출력하기
        problem2_01 problem = new problem2_01();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = new int[N];

        for (int i=0; i<N; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int x : problem.solution(N, arr)) {
            System.out.print(x + " ");
        }
    }
    public ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(arr[0]);
        for (int i=1; i<n; i++) {
            if (arr[i] > arr[i-1]) answer.add(arr[i]);
        }
        return answer;
    }
}
