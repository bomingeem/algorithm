package study.baekjoon.step4;

import java.util.Scanner;

public class boj8958 {
    public static void main(String[] args) {
        //[백준] OX퀴즈
        Scanner scanner = new Scanner(System.in);
        String[] array = new String[scanner.nextInt()];

        for (int i=0; i<array.length; i++) {
            array[i] = scanner.next();
        }

        for (int i=0; i<array.length; i++) {
            int count = 0;
            int sum = 0;

            for (int j=0; j<array[i].length(); j++) {
                if (array[i].charAt(j) == 'O') {
                    count++;
                } else {
                    count = 0;
                }
                sum += count;
            }
            System.out.println(sum);
        }
    }
}
