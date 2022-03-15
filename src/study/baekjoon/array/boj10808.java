package study.baekjoon.array;

import java.util.Scanner;

public class boj10808 {
    static String S;
    static int[] frequency = new int[26];
    public static void main(String[] args) {
        //[백준] 알파벳 개수
        Scanner scanner = new Scanner(System.in);
        S = scanner.next();

        for (char ch : S.toCharArray()) {
            frequency[ch-'a']++;
        }

        for (int i=0; i<26; i++) {
            System.out.print(frequency[i] + " ");
        }
    }
}
