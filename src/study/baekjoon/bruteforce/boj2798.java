package study.baekjoon.bruteforce;

import java.util.Scanner;

public class boj2798 {
    static int N, M;
    static int[] cards;
    public static void main(String[] args) {
        //[백준] 블랙잭
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        M = scanner.nextInt();
        cards = new int[N];

        for (int i=0; i<cards.length; i++) {
            cards[i] = scanner.nextInt();
        }
        System.out.println(blackjack(cards, N, M));
    }

    static int blackjack(int[] arr, int n, int m) {
        int answer = 0;
        for (int i=0; i<n-2; i++) {
            for (int j=i+1; j<n-1; j++) {
                for (int k=j+1; k<n; k++) {
                    int temp = arr[i] + arr[j] + arr[k];
                    if (temp == m) {
                        return temp;
                    }
                    if (temp > answer && temp < m) {
                        answer = temp;
                    }
                }
            }
        }
        return answer;
    }
}
