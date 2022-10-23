package study.inflearn.twopointers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class problem03_03 {
    public static void main(String[] args) throws IOException {
        //[인프런] 최대 매출(Sliding window)
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine(), " ");
        for (int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(solution(N, K, arr));
    }

    public static int solution(int n, int k, int[] arr) {
        int answer, sum = 0;
        for (int i=0; i<k; i++) {
            sum += arr[i];
        }
        answer = sum;

        for (int i=k; i<n; i++) {
            sum += (arr[i] - arr[i-k]);
            answer = Math.max(answer, sum);
        }
        return answer;
    }
}
