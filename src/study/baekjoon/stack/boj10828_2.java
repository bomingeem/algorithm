package study.baekjoon.stack;

import java.util.Scanner;
import java.util.Stack;

public class boj10828_2 {
    public static void main(String[] args) {
        //라이브러리 사용
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Stack<Integer> stack = new Stack<Integer>();
        for(int i=0; i<n; i++) {
            String word = scanner.next();
            if (word.equals("push")) {
                int num = Integer.parseInt(scanner.next());
                stack.push(num);
            } else if (word.equals("pop")) {
                if(stack.empty()) {
                    System.out.println("-1");
                } else {
                    System.out.println(stack.pop());
                }
            } else if (word.equals("top")) {
                if(stack.empty()) {
                    System.out.println("-1");
                } else {
                    System.out.println(stack.peek());
                }
            } else if (word.equals("size")) {
                System.out.println(stack.size());
            } else if (word.equals("empty")) {
                if (stack.empty()) {
                    System.out.println("1");
                } else {
                    System.out.println("0");
                }
            }
        }
    }
}
