package study.baekjoon.step2;

import java.util.Scanner;

public class Step2_9498 {
    public static void main(String[] args) {
        int score;
        Scanner scanner = new Scanner(System.in);

        score = scanner.nextInt();

        if(score >= 90) {
            System.out.print("A");
        } else if(score >= 80) {
            System.out.print("B");
        } else if(score >= 70) {
            System.out.print("C");
        } else if(score >= 60) {
            System.out.print("D");
        } else {
            System.out.print("F");
        }
    }
}
