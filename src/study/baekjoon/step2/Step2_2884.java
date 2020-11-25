package study.baekjoon.step2;

import java.util.Scanner;

public class Step2_2884 {
    public static void main(String[] args) {
        int hour, minute;

        Scanner scanner = new Scanner(System.in);
        hour = scanner.nextInt();
        minute = scanner.nextInt();

        if(minute >= 45 && minute < 60) {
            minute = minute - 45;
        } else if (minute < 45) {
            if(hour == 0) {
                hour = 23;
            } else {
                hour = hour - 1;
            }
            minute = (minute + 60) - 45;
        }

        System.out.print(hour + " " + minute);
    }
}
