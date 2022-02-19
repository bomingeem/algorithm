package study.baekjoon.stack;

import java.util.Scanner;
import java.util.Stack;

public class boj17608 {
    static int N; //막대기의 개수
    static Stack<Integer> stack = new Stack<>();
    static int count = 1;
    public static void main(String[] args) {
        //[백준] 막대기
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();

        for (int i=0; i<N; i++) {
            stack.push(scanner.nextInt());
        }

        int standard = stack.pop();
        int current;

        while (!stack.isEmpty()) {
            current = stack.pop();
            if (current > standard) {
                standard = current;
                count++;
            }
        }
        System.out.println(count);
    }
}
