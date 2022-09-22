package study.inflearn.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class problem02_07 {
    public static void main(String[] args) throws IOException {
        //[인프런] 점수계산
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
        int answer = 0, count = 0;
        for (int i=0; i<n; i++) {
            if (arr[i] == 1) {
                count++;
                answer += count;
            } else {
                count = 0;
            }
        }
        return answer;
    }
}
