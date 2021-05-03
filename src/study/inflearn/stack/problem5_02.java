package study.inflearn.stack;

import java.util.Scanner;
import java.util.Stack;

public class problem5_02 {
    //괄호문자제거
    public static void main(String[] args) {
        problem5_02 problem = new problem5_02();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(problem.solution(str));
    }
    public String solution(String str) {
        String answer = "";
        Stack<Character> stack = new Stack<>();
        for(char x : str.toCharArray()) {
            if (x == ')') {
                while (stack.pop() != '(');
            } else { //닫는 괄호이거나 알파벳일 경우
                stack.push(x);
            }
        }
        for(int i=0; i<stack.size(); i++) {
            answer += stack.get(i);
        }
        return answer;
    }
}
