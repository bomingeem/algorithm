package study.inflearn.stack;

import java.util.Scanner;
import java.util.Stack;

public class problem5_01 {
    //올바른 괄호
    public static void main(String[] args) {
        problem5_01 problem = new problem5_01();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(problem.solution(str));
    }
    public String solution(String str) {
        String answer = "YES";
        Stack<Character> stack = new Stack<>();

        for(char x : str.toCharArray()) {
            if(x == '(') {
             stack.push(x);
            } else {
                if (stack.isEmpty()) {
                    answer = "NO";
                    break;
                }
                stack.pop();
            }
        }
        if (!stack.isEmpty()) { //열린 괄호가 남아있을 경우
            answer = "NO";
        }
        return answer;
    }
}
