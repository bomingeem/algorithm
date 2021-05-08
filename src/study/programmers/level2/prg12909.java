package study.programmers.level2;

import java.util.Stack;

public class prg12909 {
    public static void main(String[] args) {
        //올바른 괄호
        String str = "()()";
        Solution solution = new Solution();
        System.out.println(solution.solution(str));
    }

    static class Solution {
        boolean solution(String s) {
            boolean answer = true;
            Stack<Character> stack = new Stack();
            for (char ch : s.toCharArray()) {
                if (ch == '(') {
                    stack.push(ch);
                } else {
                    if (stack.isEmpty()) {
                        answer = false;
                        break;
                    }
                    stack.pop();
                }
            }
            if (!stack.isEmpty()) {
                answer = false;
            }
            return answer;
        }
    }
}
