package study.baekjoon.step6;

import java.util.Scanner;

public class boj1157 {
    public static void main(String[] args) {
        //[백준] 단어 공부
        Scanner scanner = new Scanner(System.in);
        String alphabet = scanner.next();
        alphabet = alphabet.toLowerCase();
        int[] arr = new int[26];

        for (int i=0; i<alphabet.length(); i++) {
            char ch = alphabet.charAt(i);
            arr[ch - 'a']++;
        }

        int max = -1;
        char ch = '?';

        for (int i=0; i<26; i++) {
            if (arr[i] > max) {
                max = arr[i];
                ch = (char) (i+'A');
            } else if (arr[i] == max) {
                ch = '?';
            }
        }
        System.out.println(ch);
    }
}
