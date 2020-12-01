package study.baekjoon.step7;

import java.util.Scanner;

public class Step7_10809 {
    public static void main(String[] args) {
        int[] arr = new int[26];
        Scanner scanner = new Scanner(System.in);

        for(int i=0; i<arr.length; i++) {
            arr[i] = -1;
        }

        String word = scanner.nextLine();

        for (int i=0; i<word.length(); i++) {
            char ch = word.charAt(i);

            if(arr[ch - 'a'] == -1) {
                arr[ch - 'a'] = i;
            }
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
