package study.baekjoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class boj10809 {
    static String S;
    static int[] word = new int[26];
    public static void main(String[] args) {
        //[백준] 알파벳 찾기
        Scanner scanner = new Scanner(System.in);
        S = scanner.next();
        for (int i=0; i<word.length; i++) {
            word[i] = -1;
        }

        for (int i=0; i<S.length(); i++) {
            char ch = S.charAt(i);
            if (word[ch - 'a'] == -1) {
                word[ch - 'a'] = i;
            }
        }

        for (int result : word) {
            System.out.print(result + " ");
        }
    }
}
