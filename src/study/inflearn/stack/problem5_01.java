package study.inflearn.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class problem5_01 {
    public static void main(String[] args) throws IOException {
        //[인프런] 올바른 괄호
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String bracket = br.readLine();
        System.out.println(solution(bracket));
    }

    public static String solution(String bracket) {
        String answer = "YES";
        Stack<Character> stack = new Stack<>();

        for (char ch : bracket.toCharArray()) {
            if (ch == '(') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return "NO";
                }
                stack.pop();
            }
        }

        if (!stack.isEmpty()) {
            return "NO";
        }

        return answer;
    }
}
