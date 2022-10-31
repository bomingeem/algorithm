package study.inflearn.hash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class problem04_03 {
    public static void main(String[] args) throws IOException {
        //[인프런] 매출액의 종류
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] array = new int[N];

        st = new StringTokenizer(br.readLine(), " ");
        for (int i=0; i<N; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }

        for (Integer result : solution(N, K, array)) {
            System.out.print(result + " ");
        }
    }

    public static List<Integer> solution(int n, int k, int[] array) {
        List<Integer> answer = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        for (int i=0; i<k-1; i++) {
            map.put(array[i], map.getOrDefault(array[i], 0) + 1);
        }

        int lt = 0;
        for (int j=k-1; j<n; j++) {
            map.put(array[j], map.getOrDefault(array[j], 0) + 1);
            answer.add(map.size());
            map.put(array[lt], map.get(array[lt]) - 1);
            if (map.get(array[lt]) == 0) {
                map.remove(array[lt]);
            }
            lt++;
        }
        return answer;
    }
}
