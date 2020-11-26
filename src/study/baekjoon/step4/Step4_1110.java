package study.baekjoon.step4;

import java.util.Scanner;

public class Step4_1110 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int copyNum = num;
        int cnt = 0;
        while (true) {
            num = (num%10)*10 + ((num/10 + num%10))%10;
            cnt++;

            if(num == copyNum) break;
        }
        System.out.println(cnt);
    }
}
