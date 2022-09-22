package study.inflearn.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class problem02_08 {
    public static void main(String[] args) throws IOException {
        //[인프런] 등수구하기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int result : solution(N, arr)) {
            System.out.print(result + " ");
        }
    }

    public static int[] solution(int n, int[] arr) {
        int[] answer = new int[n];
        for (int i=0; i<n; i++) {
            int count = 1;
            for (int j=0; j<n; j++) {
                if (arr[j] > arr[i]) {
                    count++;
                }
            }
            answer[i] = count;
        }
        return answer;
    }
}
