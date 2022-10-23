package study.inflearn.twopointers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class problem03_02 {
    public static void main(String[] args) throws IOException {
        //[인프런] 공통원소 구하기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] a = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i=0; i<N; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        int M = Integer.parseInt(br.readLine());
        int[] b = new int[M];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i=0; i<M; i++) {
            b[i] = Integer.parseInt(st.nextToken());
        }

        for (int result : solution(N, M, a, b)) {
            System.out.print(result + " ");
        }
    }

    public static List<Integer> solution(int n, int m, int[] a, int[] b) {
        List<Integer> answer = new ArrayList<>();
        Arrays.sort(a);
        Arrays.sort(b);
        int p1 = 0, p2 = 0;

        while (p1 < n && p2 < m) {
            if (a[p1] < b[p2]) {
                p1++;
            } else if (a[p1] > b[p2]) {
                p2++;
            } else {
                answer.add(a[p1++]);
                p2++;
            }
        }
        return answer;
    }
}
