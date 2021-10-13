package study.inflearn.array;

import java.util.ArrayList;
import java.util.Scanner;

public class problem2_06 {
    public boolean isPrime(int num) {
        if (num == 1) return false;
        for (int i=2; i<num; i++) {
            if (num%i == 0) return false;
        }
        return true;
    }

    public ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();

        for (int i=0; i<n; i++) {
            //32
            int temp = arr[i];
            int result = 0;
            while (temp > 0) {
                int t = temp%10;
                result = result*10 + t;
                temp = temp/10;
            }
            if(isPrime(result)) answer.add(result);
        }
        return answer;
    }
    public static void main(String[] args) {
        //[인프런] 뒤집은 소수
        problem2_06 problem = new problem2_06();
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
}
