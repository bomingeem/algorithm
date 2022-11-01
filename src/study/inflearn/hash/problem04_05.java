package study.inflearn.hash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class problem04_05 {
    public static void main(String[] args) throws IOException {
        //[인프런] K번째 큰 수
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
        int answer = -1;
        Set<Integer> set = new TreeSet<>(Collections.reverseOrder());

        for (int i=0; i<n; i++) {
            for (int j=i+1; j<n; j++) {
                for (int l=j+1; l<n; l++) {
                    set.add(arr[i] + arr[j] + arr[l]);
                }
            }
        }

        int count = 0;
        for (Integer result : set) {
            count++;
            if (count == k) {
                return result;
            }
        }
        return answer;
    }
}
