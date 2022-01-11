package study.baekjoon;

import java.util.Scanner;
import java.util.Stack;

public class boj9012 {
    static int T;
    static Stack<Character> stack;
    public static void main(String[] args) {
        //[백준] 괄호
        boj9012 solution = new boj9012();
        Scanner scanner = new Scanner(System.in);
        T = scanner.nextInt();

        for (int i=0; i<T; i++) {
            String parentheses = scanner.next();
            System.out.println(solution.solution(parentheses));
        }
    }

    public String solution(String parentheses) {
        String answer = "YES";
        stack = new Stack<>();

        for (char ch : parentheses.toCharArray()) {
            if (ch == '(') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    answer = "NO";
                    break;
                }
                stack.pop();
            }
        }

        if (!stack.isEmpty()) {
            answer = "NO";
        }
        return answer;
    }
}
