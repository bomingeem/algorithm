package study.inflearn.stack;

import java.util.Scanner;
import java.util.Stack;

public class problem5_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        problem5_05 problem = new problem5_05();
        System.out.println(problem.solution(str));
    }
    public int solution(String str) {
        int answer = 0;
        Stack<Character> stack = new Stack<>();

        for (int i=0; i<str.length(); i++) {
            if (str.charAt(i) == '(') {
                stack.push('(');
            } else if (str.charAt(i) == ')') {
                stack.pop();
                if (str.charAt(i-1) == '(') { //레이저
                    answer += stack.size();
                } else { //막대기의 끝
                    answer += 1;
                }
            }
        }
        return answer;
    }
}
