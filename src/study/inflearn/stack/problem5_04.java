package study.inflearn.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class problem5_04 {
    public static void main(String[] args) throws IOException {
        //[인프런] 후위식 연산
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String postfix = br.readLine();
        System.out.println(solution(postfix));
    }

    public static int solution(String postfix) {
        Stack<Integer> stack = new Stack<>();
        for (char ch : postfix.toCharArray()) {
            if (Character.isDigit(ch)) {
                stack.push(ch - 48);
            } else {
                Integer right = stack.pop();
                Integer left = stack.pop();
                if (ch == '+') {
                    stack.push(left + right);
                } else if (ch == '-') {
                    stack.push(left - right);
                } else if (ch == '*') {
                    stack.push(left * right);
                } else if (ch == '/') {
                    stack.push(left / right);
                }
            }
        }
        return stack.get(0);
    }
}
