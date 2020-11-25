package study.baekjoon.step2;

import java.util.Scanner;

public class Step2_14681 {
    public static void main(String[] args) {
        int x,y;

        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();
        y = scanner.nextInt();

        if(x>0 && y>0) {
            System.out.print(1);
        } else if(x<0 && y>0) {
            System.out.print(2);
        } else if(x<0 && y<0) {
            System.out.print(3);
        } else if(x>0 && y<0) {
            System.out.print(4);
        }
    }
}
