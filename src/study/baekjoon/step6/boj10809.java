package study.baekjoon.step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class boj10809 {
    public static void main(String[] args) throws IOException {
        //[백준] 알파벳 찾기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
         int[] alphabet = new int[26];

        Arrays.fill(alphabet, -1);

         for (int i=0; i<S.length(); i++) {
             char ch = S.charAt(i);
             if (alphabet[ch - 'a'] == -1) {
                 alphabet[ch - 'a'] = i;
             }
         }

        for (int result : alphabet) {
            System.out.print(result + " ");
        }
    }
}
