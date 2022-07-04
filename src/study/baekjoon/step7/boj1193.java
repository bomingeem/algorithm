package study.baekjoon.step7;

import java.util.Scanner;

public class boj1193 {
    public static void main(String[] args) {
        //[백준] 분수찾기
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        int crossCount = 1, prevCountSum = 0;

        while (true) {
            if (X <= prevCountSum + crossCount) {
                if (crossCount%2 == 1) {
                    System.out.println((crossCount - (X - prevCountSum - 1)) + "/" + (X - prevCountSum));
                    break;
                } else {
                    System.out.println((X - prevCountSum) + "/" + (crossCount - (X - prevCountSum - 1)));
                    break;
                }
            } else {
                prevCountSum += crossCount;
                crossCount++;
            }
        }
    }
}
