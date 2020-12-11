package study.baekjoon.stack;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class boj17413 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<Character>();
        boolean tag = false;
        String s = br.readLine();

        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if (c == '<') {
                print(stack);
                tag = true;
                System.out.print(c);
            } else if (c == '>') {
                tag = false;
                System.out.print(c);
            } else if (tag) {
                System.out.print(c);
            } else {
                if (c == ' ') {
                    print(stack);
                    System.out.print(" ");
                } else {
                    stack.push(c);
                }
            }
        }
        print(stack);
    }

    static void print(Stack stack) {
        while (!stack.empty()) {
            System.out.print(stack.peek());
            stack.pop();
        }
    }
}
