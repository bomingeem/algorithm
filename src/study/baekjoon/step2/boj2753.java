package study.baekjoon.step2;

import java.util.Scanner;

public class boj2753 {
    public static void main(String[] args) {
        //[백준] 윤년
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();

         if (year%4 == 0) {
             if (year%400 == 0) {
                 System.out.println(1);
             } else if (year%100 == 0) {
                 System.out.println(0);
             } else {
                 System.out.println(1);
             }
         } else {
             System.out.println(0);
         }
    }
}
