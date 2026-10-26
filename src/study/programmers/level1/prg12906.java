package study.programmers.level1;


import java.util.Stack;

public class prg12906 {
    public int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        for (int a : arr) {
            if (stack.empty() || stack.peek() != a) {
                stack.push(a);
            }
        }
        int[] answer = new int[stack.size()];
        for (int i=answer.length - 1; i>=0; i--) {
            answer[i] = stack.pop();
        }
        return answer;
    }
}
