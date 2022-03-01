package study.baekjoon.bruteforce;

import java.util.Scanner;

public class boj2798 {
    static int N, M;
    static int[] blackjack;
    static int result;
    public static void main(String[] args) {
        //[백준] 블랙잭
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        M = scanner.nextInt();
        blackjack = new int[N];

        for (int i=0; i<N; i++) {
            blackjack[i] = scanner.nextInt();
        }

        System.out.println(permutation(blackjack, N, M));
    }

    public static int permutation(int[] array, int N, int M) {
        for (int i=0; i<N-2; i++) {
            for (int j=i+1; j<N-1; j++) {
                for (int k=j+1; k<N; k++) {
                    int temporaryNumber = array[i] + array[j] + array[k];
                    if (temporaryNumber == M) {
                        return temporaryNumber;
                    }

                    if (temporaryNumber > result && temporaryNumber < M) {
                        result = temporaryNumber;
                    }
                }
            }
        }
        return result;
    }
}
