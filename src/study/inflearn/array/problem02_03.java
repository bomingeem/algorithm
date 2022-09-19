package study.inflearn.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class problem02_03 {
    public static void main(String[] args) throws IOException {
        //[인프런] 가위바위보
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        int[] B = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i=0; i<N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine(), " ");
        for (int i=0; i<N; i++) {
            B[i] = Integer.parseInt(st.nextToken());
        }

        for (int i=0; i<N; i++) {
            System.out.println(solution(A[i], B[i]));
        }
    }

    public static String solution(int a, int b) {
        String answer;
        if (a == b) {
            answer = "D";
        } else if (a == 1 && b == 3) {
            answer = "A";
        } else if (a == 2 && b == 1) {
            answer = "A";
        } else if (a == 3 && b == 2) {
            answer = "A";
        } else {
            answer = "B";
        }
        return answer;
    }
}
