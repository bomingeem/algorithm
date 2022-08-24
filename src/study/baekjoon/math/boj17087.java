package study.baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj17087 {
    static int N, S;
    static int[] arr;
    static int answer;
    public static void main(String[] args) throws IOException {
        //[백준] 숨바꼭질 6
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());
        arr = new int[N];

        st = new StringTokenizer(br.readLine(), " ");
        for (int i=0; i<N; i++) {
            arr[i] = Math.abs(S-Integer.parseInt(st.nextToken()));
        }

        answer = arr[0];
        for (int i=1; i<arr.length; i++) {
            answer = GCD(answer, arr[i]);
        }
        System.out.println(answer);
    }

    public static int GCD(int a, int b) {
        /**
         if (b == 0) return a;
         else return GCD(b, a%b);
         */
        while (b != 0) {
            int r = a%b;
            a = b;
            b = r;
        }
        return a;
    }
}
