package study.baekjoon.step10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj2798 {
    static int N, M;
    static int answer;
    static int[] cards;
    public static void main(String[] args) throws IOException {
        //[백준] 블랙잭
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        cards = new int[N];

        st = new StringTokenizer(br.readLine(), " ");
        for (int i=0; i<N; i++) {
            cards[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(blackjack());
    }

    public static int blackjack() {
        int number = 0;

        for (int i=0; i<N-2; i++) {
            for (int j=i+1; j<N-1; j++) {
                for (int k=j+1; k<N; k++) {
                    number = cards[i] + cards[j] + cards[k];

                    if (number == M) return number;
                    if (number > answer && number < M) answer = number;
                }
            }
        }
        return answer;
    }
}
