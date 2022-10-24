package study.inflearn.twopointers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class problem03_05 {
    public static void main(String[] args) throws IOException {
        //[인프런] 연속된 자연수의 합
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for (int i=0; i<N; i++) {
        }
        System.out.println(solution(N));
    }

    public static int solution(int n) {
        int answer = 0, sum = 0, lt = 0;
        int m = n/2+1;
        int[] arr = new int[m];
        for (int i=0; i<m; i++) {
            arr[i] = i+1;
        }

        for (int rt=0; rt<m; rt++) {
            sum += arr[rt];

            if (sum == n) {
                answer++;
            }

            while (sum >= n) {
                sum -= arr[lt++];
                if (sum == n) {
                    answer++;
                }
            }
        }
        return answer;
    }
}
