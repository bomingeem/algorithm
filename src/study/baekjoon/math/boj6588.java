package study.baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class boj6588 {
    static List<Integer> primes = new ArrayList<>();
    static boolean[] prime = new boolean[1000000];
    public static void main(String[] args) throws IOException {
        //[백준] 골드바흐의 추측
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        prime();

        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) {
                break;
            }
            boolean isWrong = true;
            for (int i=0; i<primes.size(); i++) {
                int p = primes.get(i);
                if (!prime[n - p]) {
                    System.out.println(n + " = " + p + " + " + (n - p));
                    isWrong = false;
                    break;
                }
            }
            if (isWrong) {
                System.out.println("Goldbach's conjecture is wrong.");
            }
        }
    }

    public static void prime() {
        prime[0] = prime[1] = true;
        for (int i=2; i<Math.sqrt(prime.length); i++) {
            if (prime[i]) continue;
            primes.add(i);
            for (int j=i*i; j<prime.length; j+=i) {
                prime[j] = true;
            }
        }
    }
}
