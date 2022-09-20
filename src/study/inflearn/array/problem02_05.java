package study.inflearn.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class problem02_05 {
    public static void main(String[] args) throws IOException {
        //[인프런] 소수(에라토스테네스 체)
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.println(solution(N));
    }

    public static int solution(int n) {
        int answer = 0;
        int[] primes = new int[n+1];
        for (int i=2; i<=n; i++) {
            if (primes[i] == 0) {
                answer++;
                for (int j=i; j<=n; j=j+i) {
                    primes[j]=1;
                }
            }
        }
        return answer;
    }
}
