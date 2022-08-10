package study.baekjoon.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class boj17413 {
    static String S;
    static boolean tag;
    static Stack<Character> stack = new Stack<>();
    public static void main(String[] args) throws IOException {
        //[백준] 단어 뒤집기 2
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        S = br.readLine();

        for (int i=0; i<S.length(); i++) {
            char ch = S.charAt(i);
            if(ch == '<') {
                print(stack);
                tag = true;
                System.out.print(ch);
            } else if (ch == '>') {
                tag = false;
                System.out.print(ch);
            } else if (tag) {
                System.out.print(ch);
            } else {
                if (ch == ' ') {
                    print(stack);
                    System.out.print(ch);
                } else {
                    stack.push(ch);
                }
            }
        }
        print(stack);
    }

    static void print(Stack stack) {
        while (!stack.isEmpty()) {
            System.out.print(stack.peek());
            stack.pop();
        }
    }
}
