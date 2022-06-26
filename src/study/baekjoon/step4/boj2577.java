package study.baekjoon.step4;

import java.util.Scanner;

public class boj2577 {
    public static void main(String[] args) {
        //[백준] 숫자의 개수
        Scanner scanner = new Scanner(System.in);
        int result = scanner.nextInt()*scanner.nextInt()*scanner.nextInt();
        String str = Integer.toString(result);

        for (int i=0; i<10; i++) {
            int count = 0;
            for (int j=0; j<str.length(); j++) {
                if ((str.charAt(j) - '0') == i) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
