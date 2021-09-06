package study.baekjoon.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj2798 {
    static int N; //카드의 개수
    static int M;
    static int[] cards;
    public static void main(String[] args) throws IOException {
        //[백준] 블랙잭
        //N장 중 3장 고르고 M을 외치다
        //플레이어가 고른 합은 21을 넘지 않으며 최대한 가깝게 만들어야 한다
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        cards = new int[N];

        st = new StringTokenizer(br.readLine(), " ");
        for (int i=0; i<N; i++) {
            cards[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(quest(cards, N, M));
    }

    static int quest(int[] cards, int n, int m) {
        int result = 0;

        for (int i=0; i<N-2; i++) {
            for (int j=i+1; j<N-1; j++) {
                for (int k=j+1; k<N; k++) {
                    int temp = cards[i] + cards[j] + cards[k];

                    if (M == temp) return temp;

                    if (result < temp && temp < M) {
                        result = temp;
                    }
                }
            }
        }
        return result;
    }
}
