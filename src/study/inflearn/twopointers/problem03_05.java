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
        //cnt: 연속된 자연수의 개수
        int answer = 0, cnt = 1;

        n--;
        while (n > 0) {
            cnt++;
            n = n - cnt;
            if (n%cnt == 0) {
                answer++;
            }
        }
        return answer;
    }
}
