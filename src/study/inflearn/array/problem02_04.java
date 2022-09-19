package study.inflearn.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class problem02_04 {
    static int[] answer;
    public static void main(String[] args) throws IOException {
        //[인프런] 피보나치 수열
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int result : solution(N)) {
            System.out.print(result + " ");
        }
    }

    public static int[] solution(int n) {
        answer = new int[n];
        answer[0] = 1;
        answer[1] = 1;
        for (int i = 2; i < n; i++) {
            answer[i] = answer[i-2] + answer[i-1];
        }
        return answer;
    }

    /*
    public static void solution(int n) {
        int a = 1, b = 1, c;
        System.out.print(a + " " + b + " ");
        for (int i=2; i<n; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
    */
}
