package study.baekjoon.step6;

import java.util.Scanner;

public class Step6_1065 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        System.out.print(arithmeticSequence(num));
    }

    public static int arithmeticSequence(int num) {
        int count = 0;

        if(num < 100) {
            return num;
        } else {
            count = 99;
            if(num == 1000) {
                num = 999;
            }

            for(int i=100; i<=num; i++) {
                int back = i/100;
                int sip = (i/10) % 10;
                int ill = i%10;

                if((back - sip) == (sip - ill)) {
                    count++;
                }
            }
        }
        return count;
    }
}
