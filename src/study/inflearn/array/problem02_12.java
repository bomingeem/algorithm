package study.inflearn.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class problem02_12 {
    public static void main(String[] args) throws IOException {
        //[인프런] 멘토링
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] arr = new int[M][N];

        for (int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j=0; j<N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        System.out.println(solution(N, M, arr));
    }

    public static int solution(int n, int m, int[][] arr) {
        int answer = 0;
        for (int i=1; i<=n; i++) { //멘토
            for (int j=1; j<=n; j++) { //멘티
                int count = 0;
                for (int k=0; k<m; k++) { //테스트 번호
                    int mentor = 0, mentee = 0;
                    for (int s=0; s<n; s++) { //학생의 위치
                        if (arr[k][s] == i) mentor = s;
                        if (arr[k][s] == j) mentee = s;
                    }
                    if (mentor < mentee) count++;
                }
                if (count == m) {
                    answer++;
                }
            }
        }
        return answer;
    }
}
