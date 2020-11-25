package study.baekjoon.step3;

import java.util.Scanner;

public class Step3_2739 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int gugudan = scanner.nextInt();

        for(int i=1; i<10; i++) {
            System.out.println(gugudan + " * " + i + " = " + gugudan*i);
        }
    }
}
