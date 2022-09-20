package study.inflearn.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class problem02_06 {
    public static void main(String[] args) throws IOException {
        //[인프런] 뒤집은 소수
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

    public static List<Integer> solution(int n, int[] arr) {
        List<Integer> answer = new ArrayList<>();
        for (int i=0; i<n; i++) {
            int temp = arr[i];
            int result = 0;
            while (temp > 0) {
                result = result*10 + temp%10;
                temp = temp/10;
            }
            if (isPrime(result)) {
                answer.add(result);
            }
        }
        return answer;
    }

    public static boolean isPrime(int number) {
        if (number == 1) {
            return false;
        }
        for (int i=2; i<number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
