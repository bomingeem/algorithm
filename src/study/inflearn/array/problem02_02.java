package study.inflearn.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class problem02_02 {
    public static void main(String[] args) throws IOException {
        //[인프런] 보이는 학생
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(solution(N, arr));
    }

    public static int solution(int n, int[] arr) {
        int answer = 1;
        int max = arr[0];
        for (int i=1; i<n; i++) {
            if (max < arr[i]) {
                answer++;
                max = arr[i];
            }
        }
        return answer;
    }
}
