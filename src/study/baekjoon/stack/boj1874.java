package study.baekjoon.stack;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class boj1874 {
    public static void main(String[] args) {
        //[백준] 스택수열
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();

        int N = scanner.nextInt();
        int start = 0;

        while (N-- > 0) {
            int value = scanner.nextInt();

            if (value > start) {
                for (int i=start+1; i<=value; i++) {
                    stack.push(i);
                    sb.append("+").append("\n");
                }
                start = value;
            } else if (stack.peek() != value) {
                System.out.println("NO");
                return;
            }
            stack.pop();
            sb.append("-").append("\n");
        }
        System.out.println(sb);
    }
}
