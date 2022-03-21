package study.baekjoon.array;

import java.util.Scanner;

public class boj10808 {
    static String S;
    static int[] alphabet = new int[26];
    public static void main(String[] args) {
        //[백준] 알파벳 개수
        Scanner scanner = new Scanner(System.in);
        S = scanner.next();

        for (char ch : S.toCharArray()) {
            alphabet[ch - 'a']++;
        }

        for (int i : alphabet) {
            System.out.print(i + " ");
        }
    }
}
