package study.baekjoon.stack;


import java.util.Scanner;
import java.util.Stack;

public class boj1874 {
    static int n;
    static Stack<Integer> stack = new Stack<>();
    public static void main(String[] args) {
        //[백준] 스택수열
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        n = scanner.nextInt();

        int count = 1;

        while (n-- > 0) {
            int number = scanner.nextInt();
            while (count <= number) {
                stack.push(count++);
                sb.append("+").append("\n");
            }
            if (stack.peek() != number) {
                System.out.println("NO");
                return;
            }
            stack.pop();
            sb.append("-").append("\n");
        }
        System.out.println(sb);
    }
}
