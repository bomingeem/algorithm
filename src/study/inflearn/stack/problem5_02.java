package study.inflearn.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class problem5_02 {
    public static void main(String[] args) throws IOException {
        //[인프런] 괄호문자제거
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(solution(str));
    }

    public static String solution(String str) {
        String answer = "";
        Stack<Character> stack = new Stack<>();
        for (char ch : str.toCharArray()) {
            if (ch == ')') {
                while(stack.pop() != '(') {
                    ;
                }
            } else {
                stack.push(ch);
            }
        }
        for (int i=0; i<stack.size(); i++) {
            answer += stack.get(i);
        }
        return answer;
    }
}
