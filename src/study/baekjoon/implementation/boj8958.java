package study.baekjoon.implementation;

import java.util.Scanner;

public class boj8958 {
    static String[] strings;
    static int N;
    public static void main(String[] args) {
        //[백준] OX퀴즈
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        strings = new String[N];

        for (int i=0; i<N; i++) {
            int count = 0, sum = 0;
            strings[i] = scanner.next();
            for (int j=0; j<strings[i].length(); j++) {
                if (strings[i].charAt(j) == 'O') {
                    sum += ++count;
                } else {
                    count = 0;
                }
            }
            System.out.println(sum);
        }
    }
}
