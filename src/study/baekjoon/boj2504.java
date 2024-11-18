package study.baekjoon;

import study.example.datastructure.stack.Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj2504 {
    public static void main(String[] args) throws IOException {
        //TODO: 바깥의 (), []에 따른 *2, *3처리는 어떻게 해야하는지?
        int answer = 1;
        Stack<Character> stack = new Stack<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String 괄호 = br.readLine();

        for (int i=0; i<괄호.length(); i++) {
            char ch = 괄호.charAt(i);
            switch (ch) {
                case '(':
                    stack.push(ch);
                    break;
                case ')':
                    if (!stack.empty() && stack.peek() == '(') {
                        stack.pop();
                        answer += 2;
                    }
                    break;
                case '[':
                    stack.push(ch);
                    break;
                case ']':
                    if (!stack.empty() && stack.peek() == '[') {
                        stack.pop();
                        answer += 3;
                    }
                    break;
            }
        }
        System.out.println(answer);
    }
}
